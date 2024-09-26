package metodos;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Rectangulo {

    public String rectangulo(String funcion1, String a1, String b1, int n) {
        String mensaje;

        try {
            String expresion = funcion1;

            JEP a2 = new JEP();
            a2.addStandardFunctions(); // adiciona las funciones matematicas
            a2.addStandardConstants();// adiciona las constantes matematicas como  e , pi
            a2.parseExpression(a1); // paso de la expresi´on a evaluar
            double a = a2.getValue(); //[a,b] almacena el valor del limite inferior a

            JEP b2 = new JEP();
            b2.addStandardFunctions(); // adiciona las funciones matematicas
            b2.addStandardConstants();// adiciona las constantes matematicas como  e , pi
            b2.parseExpression(b1); // paso de la expresi´on a evaluar
            double b = b2.getValue();//[a,b] almacena el valor del limite superior b

            double h = (b - a) / n;
            int m = (int) n;

            double x[] = new double[m + 1];
            x[0] = a;
            for (int i = 1; i < x.length; i++) {

                x[i] = x[0] + (i * h);// calcula el termino Xi
            }

            JEP funcion = new JEP();
            funcion.addStandardFunctions(); // adiciona las funciones matem´aticas
            funcion.addStandardConstants(); // adiciona las constantes matem´aticas e , pi, etc.
            funcion.setImplicitMul(true);

            double fi[] = new double[m + 1];
            /**
             * calcula el valor de el polinomio en el punto Xi
             */
            for (int i = m; i >= 0; i--) {

                for (int j = fi.length - 1; j > 0; j--) {
                    fi[i] = funcion.addVariable("x", x[i]);
                    funcion.parseExpression(expresion); // paso de la expresi´on a evaluar
                    fi[i] = funcion.getValue();
                }

            }

            double integral = 0;
            for (int i = 0; i < fi.length; i++) {
                integral = integral + fi[i];
            }
            integral = h * integral;
            mensaje = Double.toString(integral);
        } catch (NumberFormatException e) {
            mensaje = "error ingreso de datos";
        }

        return mensaje;
    }

    public String errorRectangulo(String funcion, String a1, String b1, int n1) {
        String mensaje = null;

        try {
            JEP a2 = new JEP();
            a2.addStandardFunctions(); // adiciona las funciones matematicas
            a2.addStandardConstants();
            a2.parseExpression(a1); // paso de la expresión a evaluar
            double a = a2.getValue();

            JEP b2 = new JEP();
            b2.addStandardFunctions(); // adiciona las funciones matematicas
            b2.addStandardConstants();
            b2.parseExpression(b1); // paso de la expresion a evaluar
            double b = b2.getValue();

            double n = n1;// numero de particiones

            double h = (b - a) / n;//formula del trapecio

            DJep fun = new DJep();

            fun.addStandardConstants();
            fun.addStandardFunctions();
            fun.setImplicitMul(true);
            fun.addComplex();
            fun.setAllowAssignment(true);
            fun.setAllowUndeclared(true);
            fun.addStandardDiffRules();

            Node nodo = fun.parse(funcion);
            Node diff1 = fun.differentiate(nodo, "x");
            Node derivada = fun.simplify(diff1);

            String fd = fun.toString(derivada);

            //Buscar el error
            JEP f = new JEP();

            f.addStandardFunctions(); // adiciona las funciones matematicas
            f.addStandardConstants(); // adiciona las constantes matematicas
            f.setImplicitMul(true);

            double derivadaMax = f.addVariable("x", b);
            f.parseExpression(fd); // paso de la expresion a evaluar
            double sup = f.getValue();

            double derivadaMin = f.addVariable("x", a);
            f.parseExpression(fd);
            double inf = f.getValue();
            double gamma;
            if (sup >= inf) {
                gamma = sup;
            } else {
                gamma = inf;
            }

            double error;
            error = Math.abs((-0.5) * (Math.pow(h, 2)) * gamma);
            String errorfinal = String.valueOf(error);

            return errorfinal;
        } catch (ParseException e) {
            mensaje = "Error en los datos" + e.getErrorInfo();
        }
        return mensaje;
    }
}
