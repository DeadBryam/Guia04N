/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.DiferenciasDivididas;
import clases.Evaluar;
import clases.Hermite;
import clases.Lagrange;
import clases.Multiplicar;
import clases.Newton;

/**
 *
 * @author bryan
 */
public class form extends javax.swing.JFrame {

    Evaluar ev = new Evaluar();
    /**
     * Creates new form form
     */
    public form() {
        initComponents();
        llenarTbl();
        this.setLocationRelativeTo(null);
        pnlResultado.show(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnLagranja = new javax.swing.JButton();
        btnNewton = new javax.swing.JButton();
        btnHermite = new javax.swing.JButton();
        btnDiferencias = new javax.swing.JButton();
        btnTrazadores = new javax.swing.JButton();
        pnlResultado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPolinomio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><p align=\"center\">El censo de una poblacion de una determinada <br>ciudad proporciona los siguientes datos del <br> numero de habitantes en diferentes anios<p></html>");

        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Anios", "Poblacion", "Datos para hermite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMain);

        btnLagranja.setText("Lagrange");
        btnLagranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagranjaActionPerformed(evt);
            }
        });

        btnNewton.setText("Newton");
        btnNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewtonActionPerformed(evt);
            }
        });

        btnHermite.setText("Hermite");
        btnHermite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHermiteActionPerformed(evt);
            }
        });

        btnDiferencias.setText("Diferencias divididas");
        btnDiferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenciasActionPerformed(evt);
            }
        });

        btnTrazadores.setText("Trazadores cubicos");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBotonesLayout.createSequentialGroup()
                            .addComponent(btnLagranja)
                            .addGap(65, 65, 65)
                            .addComponent(btnHermite)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewton)))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnDiferencias)
                        .addGap(30, 30, 30)
                        .addComponent(btnTrazadores)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLagranja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHermite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 310));

        pnlResultado.setBackground(new java.awt.Color(255, 255, 51));

        tblRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Anios", "Poblacion", "Error"
            }
        ));
        jScrollPane3.setViewportView(tblRes);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Polinomio");

        txtPolinomio.setEditable(false);
        txtPolinomio.setColumns(1);
        txtPolinomio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPolinomio.setForeground(new java.awt.Color(0, 0, 0));
        txtPolinomio.setRows(1);
        jScrollPane1.setViewportView(txtPolinomio);

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlResultadoLayout.createSequentialGroup()
                        .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTbl() {
        double x[] = {1910, 1930, 1950, 1960, 1980}, y[] = {125350, 133420, 117183, 120323, 145311}, z[] = {1964, 2000, 2010, 2018}, fx[] = {100000,45678,98769,123654,88653,123450};
        for (int i = 0; i < x.length; i++) {
            tblMain.setValueAt(x[i], i, 0);
            tblMain.setValueAt(y[i], i, 1);
            tblMain.setValueAt(fx[i], i, 2);
        }
        for (int i = 0; i < z.length; i++) {
            tblRes.setValueAt(z[i], i, 0);
        }
    }

    private void btnLagranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagranjaActionPerformed
        pnlBotones.show(false);
        pnlResultado.show();
        double x[] = new double[tblMain.getRowCount()], y[] = new double[tblMain.getRowCount()];
        Lagrange lg = new Lagrange();
        String polinomio;

        for (int i = 0; i < tblMain.getRowCount(); i++) {
            x[i] =  (double) tblMain.getModel().getValueAt(i, 0);
            y[i] = (double) tblMain.getModel().getValueAt(i, 1);
        }

        polinomio = new Multiplicar().reducirToString(lg.getLn(x, y));

        for (int i = 0; i < tblRes.getRowCount(); i++) {
            tblRes.setValueAt(ev.evaluarFuncion(Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 1);
            tblRes.setValueAt(ev.getErrorLagrange(x, y, Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0)))), i, 2);
        }

        txtPolinomio.setText(polinomio);
    }//GEN-LAST:event_btnLagranjaActionPerformed

    private void btnDiferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenciasActionPerformed
        pnlBotones.show(false);
        pnlResultado.show();
        double x[] = new double[tblMain.getRowCount()], y[] = new double[tblMain.getRowCount()];
        DiferenciasDivididas dd = new DiferenciasDivididas();
        String polinomio;

        for (int i = 0; i < tblMain.getRowCount(); i++) {
            x[i] = (double) tblMain.getModel().getValueAt(i, 0);
            y[i] = (double) tblMain.getModel().getValueAt(i, 1);
        }

        polinomio = dd.getDiferenciasDivididas(x, y);

        for (int i = 0; i < tblRes.getRowCount(); i++) {
            tblRes.setValueAt(ev.evaluarFuncion(Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 1);
            tblRes.setValueAt(ev.getErrorInterpolacion(x, y, Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 2);
        }
        
        txtPolinomio.setText(polinomio);
    }//GEN-LAST:event_btnDiferenciasActionPerformed

    private void btnHermiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHermiteActionPerformed
        pnlBotones.show(false);
        pnlResultado.show();
        double x[] = new double[tblMain.getRowCount() * 2], y[] = new double[tblMain.getRowCount() * 2], z[] = new double[tblMain.getRowCount()];
       // double x[] = {1910.0, 1910.0, 1930.0, 1930.0, 1950.0, 1950.0, 1960.0, 1960.0, 1980.0, 1980.0}, y[] = {125350.0, 125350.0, 133420.0, 133420.0, 117183.0, 117183.0, 120323.0, 120323.0, 145311.0, 145311.0},z[] = {1964,2000,2010,2018,2020};
        Hermite hr = new Hermite();
        String polinomio;

        for (int i = 1; i <= tblMain.getRowCount(); i++) {
            x[(i-1)*2] = (double) tblMain.getModel().getValueAt(i-1, 0);
            x[(i*2)-1] = (double) tblMain.getModel().getValueAt(i-1, 0);
            y[(i-1)*2] = (double) tblMain.getModel().getValueAt(i-1, 1);
            y[(i*2)-1] = (double) tblMain.getModel().getValueAt(i-1, 1);
            z[i-1] = (double) tblMain.getModel().getValueAt(i-1, 2);
        }
        
        polinomio = hr.getHermite(x, y, z);

        for (int i = 0; i < tblRes.getRowCount(); i++) {
            tblRes.setValueAt(ev.evaluarFuncion(Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 1);
            tblRes.setValueAt(ev.getErrorInterpolacion(x, y, Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 2);
        }
        
        txtPolinomio.setText(polinomio);
    }//GEN-LAST:event_btnHermiteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlResultado.show(false);
        pnlBotones.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewtonActionPerformed
        pnlBotones.show(false);
        pnlResultado.show();
        double x[] = new double[tblMain.getRowCount()], y[] = new double[tblMain.getRowCount()];
        Newton nw = new Newton();
        String polinomio;

        for (int i = 0; i < tblMain.getRowCount(); i++) {
            x[i] = (double) tblMain.getModel().getValueAt(i, 0);
            y[i] = (double) tblMain.getModel().getValueAt(i, 1);
        }

        polinomio = nw.getNewton(x, y);
        
        for (int i = 0; i < tblRes.getRowCount(); i++) {
            tblRes.setValueAt(ev.evaluarFuncion(Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 1);
            tblRes.setValueAt(ev.getErrorInterpolacion(x, y, Double.parseDouble(String.valueOf(tblRes.getValueAt(i, 0))), polinomio), i, 2);
        }
        
        txtPolinomio.setText(polinomio);
    }//GEN-LAST:event_btnNewtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiferencias;
    private javax.swing.JButton btnHermite;
    private javax.swing.JButton btnLagranja;
    private javax.swing.JButton btnNewton;
    private javax.swing.JButton btnTrazadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTable tblMain;
    private javax.swing.JTable tblRes;
    private javax.swing.JTextArea txtPolinomio;
    // End of variables declaration//GEN-END:variables
}
