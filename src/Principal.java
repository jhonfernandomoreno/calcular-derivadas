
import javax.swing.JOptionPane;
import metodos.Rectangulo;
import metodos.Simpson1;
import metodos.Simpson2;
import metodos.Trapecios;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        bloquearCasillas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAyuda = new javax.swing.JButton();
        btnAcercade = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnnueInt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_A = new javax.swing.JTextField();
        txt_B = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fx = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_n = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rbtntrapecios = new javax.swing.JRadioButton();
        rbtnSimpson = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        rbtnRectangulo = new javax.swing.JRadioButton();
        rbtnSimpson3 = new javax.swing.JRadioButton();
        btnCalc = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAyuda.setText("Ayuda");
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnAcercade.setText("Acerca de");
        btnAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscudoUdeNar-294 (2).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 70, 60));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setText("UNIVERSIDAD DE NARIÑO EXTENSION IPIALES");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setText("METODOS DE INTEGRACION TRAPECIO Y SIMPSON 1/3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 430, 60));

        btnnueInt.setText("NUEVA INTEGRACION");
        btnnueInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueIntActionPerformed(evt);
            }
        });
        getContentPane().add(btnnueInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("a =");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INTEGRAL.png"))); // NOI18N
        jLabel2.setText("jjj");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("b =");

        txt_A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AKeyTyped(evt);
            }
        });

        txt_B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Reem Kufi", 3, 12)); // NOI18N
        jLabel8.setText("f(x) =");

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        jLabel9.setText("dx =");

        jLabel10.setText("Número de particiones");

        txt_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nKeyTyped(evt);
            }
        });

        jLabel11.setText("METODOS DE INTEGRACION A UTILIZAR");

        rbtntrapecios.setText("Trapecios");
        rbtntrapecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntrapeciosActionPerformed(evt);
            }
        });

        rbtnSimpson.setText("Simpson 1/3");
        rbtnSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSimpsonActionPerformed(evt);
            }
        });

        jLabel12.setText("Error");

        rbtnRectangulo.setText("Rectangulo");
        rbtnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRectanguloActionPerformed(evt);
            }
        });

        rbtnSimpson3.setText("Simpson 3/8");
        rbtnSimpson3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSimpson3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fx, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtntrapecios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnSimpson))
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtError))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_A, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_n, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtnRectangulo)
                                        .addGap(43, 43, 43)
                                        .addComponent(rbtnSimpson3)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_fx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtntrapecios)
                    .addComponent(rbtnSimpson)
                    .addComponent(jLabel12)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnRectangulo)
                    .addComponent(rbtnSimpson3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 530, 280));

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo (1).jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercadeActionPerformed
        JOptionPane.showMessageDialog(null, "UNIVERSIDAD DE NARIÑO\n\n"
                + "Autor : Jhon Fernando Moreno\n"
                + "Carrera: Ingeniería de sistemas\n"
                + "Semestre: Sexto semestre 2020-2021");
    }//GEN-LAST:event_btnAcercadeActionPerformed

    private void btnnueIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueIntActionPerformed
        limpiarCasillas();
    }//GEN-LAST:event_btnnueIntActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        try {

            String funcion = txt_fx.getText();
            String a = txt_A.getText();
            String b = txt_B.getText();
            int n = Integer.parseInt(txt_n.getText());

            if (n < 0) {
                JOptionPane.showMessageDialog(null, "Debe elegir mínimo 1 partición");
            }

            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                JOptionPane.showMessageDialog(null, "El límite inferior debe ser menor al mímite superior");
            } else {
                if (rbtntrapecios.isSelected()) {// si se selecina el metodo de la regla de los trapecios
                    Trapecios m1 = new Trapecios();
                    txtResultado.setText(m1.trapecio(funcion, a, b, n)); // llamada al metodo trapecio que calcula la solucion aproximada
                    txtError.setText(m1.errorTrapecio(funcion, a, b, n));//error del metodo del trapecio
                } else {
                    if (rbtnSimpson.isSelected()) {// si se seleciona el metodo de Simpson 1/3
                        if (n % 2 == 0) {
                            Simpson1 m2 = new Simpson1();
                            txtResultado.setText(m2.simpson1_3(funcion, a, b, n));// llamada al metodo simpson1_3 que calcula la solucion aproximada
                            txtError.setText(m2.errorSimpson1_3(funcion, a, b, n));//error del metodo Simpson
                        } else {
                            JOptionPane.showMessageDialog(null, "El metodo de Simpson 1/3 utiliza un numero de particiones par");
                        }
                    } else {
                        if (rbtnSimpson3.isSelected()) {
                            if (n % 2 != 0) {
                                Simpson2 m3 = new Simpson2();// se crea un objeto de la clase Simpson2
                                txtResultado.setText(m3.simpson3_8(funcion, a, b, n));
                                txtError.setText(m3.errorSimpson3_8(funcion, a, b, n));
                            } else {
                                JOptionPane.showMessageDialog(null, "El metodo de Simpson 3/8 utiliza un numero de particiones impar");
                            }
                        } else {
                            if (rbtnRectangulo.isSelected()) {
                                Rectangulo m4 = new Rectangulo();
                                txtResultado.setText(m4.rectangulo(funcion, a, b, n));
                                txtError.setText(m4.errorRectangulo(funcion, a, b, n));
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Permite espacios en blanco");
        }

    }//GEN-LAST:event_btnCalcActionPerformed

    private void txt_BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_BKeyTyped

    private void txt_AKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_AKeyTyped

    private void txt_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nKeyTyped

    private void rbtntrapeciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtntrapeciosActionPerformed
        rbtnSimpson.setSelected(false);
        rbtnRectangulo.setSelected(false);
        rbtnSimpson3.setSelected(false);

    }//GEN-LAST:event_rbtntrapeciosActionPerformed

    private void rbtnSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSimpsonActionPerformed
        rbtntrapecios.setSelected(false);
        rbtnRectangulo.setSelected(false);
        rbtnSimpson3.setSelected(false);
    }//GEN-LAST:event_rbtnSimpsonActionPerformed

    private void rbtnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRectanguloActionPerformed
        rbtnSimpson.setSelected(false);
        rbtnSimpson3.setSelected(false);
        rbtntrapecios.setSelected(false);
    }//GEN-LAST:event_rbtnRectanguloActionPerformed

    private void rbtnSimpson3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSimpson3ActionPerformed
        rbtnRectangulo.setSelected(false);
        rbtnSimpson.setSelected(false);
        rbtntrapecios.setSelected(false);
    }//GEN-LAST:event_rbtnSimpson3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercade;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnnueInt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbtnRectangulo;
    private javax.swing.JRadioButton rbtnSimpson;
    private javax.swing.JRadioButton rbtnSimpson3;
    private javax.swing.JRadioButton rbtntrapecios;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txt_A;
    private javax.swing.JTextField txt_B;
    private javax.swing.JTextField txt_fx;
    private javax.swing.JTextField txt_n;
    // End of variables declaration//GEN-END:variables

    private void limpiarCasillas() {
        txt_A.setEnabled(true);
        txt_B.setEnabled(true);
        txt_fx.setEnabled(true);
        txt_n.setEnabled(true);
        rbtntrapecios.setEnabled(true);
        rbtnSimpson.setEnabled(true);
        btnCalc.setEnabled(true);
        btnLimpiar.setEnabled(true);
        rbtnRectangulo.setEnabled(true);
        rbtnSimpson3.setEnabled(true);
    }

    private void bloquearCasillas() {
        txt_A.setEnabled(false);
        txt_B.setEnabled(false);
        txt_fx.setEnabled(false);
        txt_n.setEnabled(false);
        txtResultado.setEnabled(false);
        txtError.setEnabled(false);
        rbtntrapecios.setEnabled(false);
        rbtnSimpson.setEnabled(false);
        btnCalc.setEnabled(false);
        btnLimpiar.setEnabled(false);
        rbtnRectangulo.setEnabled(false);
        rbtnSimpson3.setEnabled(false);

    }

    private void limpiar() {
        txt_A.setText("");
        txt_B.setText("");
        txt_fx.setText("");
        txt_n.setText("");
        txtResultado.setText("");
        rbtntrapecios.setSelected(false);
        rbtnSimpson.setSelected(false);
        rbtnRectangulo.setSelected(false);
        rbtnSimpson3.setSelected(false);
        txtError.setText("");
    }
}
