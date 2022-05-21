/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javax.swing.JFrame;
import Controller.ControllerJogo;
import Controller.observer.JogoObserver;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author boing
 */
public class ViewJogo extends javax.swing.JFrame implements JogoObserver {

    private ControllerJogo controller;
    private List<JLabel> historico;

    private ViewJogo() throws IOException {
        initComponents();
        setResizable(false);
        controller = new ControllerJogo();
        controller.attach(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaHistorico();
        setDisabled();
    }

    private static ViewJogo instance = null;

    public static ViewJogo getInstance() throws IOException {
        if (instance == null) {
            instance = new ViewJogo();
        }

        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        horario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        hisJogo1 = new javax.swing.JLabel();
        hisJogo2 = new javax.swing.JLabel();
        hisJogo3 = new javax.swing.JLabel();
        hisJogo5 = new javax.swing.JLabel();
        hisJogo4 = new javax.swing.JLabel();
        placarDir = new javax.swing.JTextField();
        placarEsq1 = new javax.swing.JTextField();
        setEsq = new javax.swing.JLabel();
        setDir = new javax.swing.JLabel();
        pontuarDir = new javax.swing.JButton();
        pontuarEsq = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Equipe");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Equipe");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Visitor");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Home");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        horario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        horario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horario.setText("10:00");
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        hisJogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hisJogo1.setText("-");

        hisJogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hisJogo2.setText("-");

        hisJogo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hisJogo3.setText("-");

        hisJogo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hisJogo5.setText("-");

        hisJogo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hisJogo4.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hisJogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hisJogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hisJogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hisJogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hisJogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hisJogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hisJogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hisJogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hisJogo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hisJogo5)
                .addContainerGap())
        );

        placarDir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        placarDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placarDir.setText("0");
        placarDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placarDirActionPerformed(evt);
            }
        });

        placarEsq1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        placarEsq1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placarEsq1.setText("0");
        placarEsq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placarEsq1ActionPerformed(evt);
            }
        });

        setEsq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        setEsq.setText("0");

        setDir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        setDir.setText("0");

        pontuarDir.setText("PONTUAR");
        pontuarDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontuarDirActionPerformed(evt);
            }
        });

        pontuarEsq.setText("PONTUAR");
        pontuarEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontuarEsqActionPerformed(evt);
            }
        });

        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setEsq, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pontuarEsq, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(placarEsq1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(placarDir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(pontuarDir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(setDir)))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placarDir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placarEsq1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(setEsq))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setDir)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pontuarDir)
                            .addComponent(pontuarEsq))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioActionPerformed

    private void placarDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placarDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placarDirActionPerformed

    private void placarEsq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placarEsq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placarEsq1ActionPerformed

    private void pontuarDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontuarDirActionPerformed
        this.controller.pontuar(false);
    }//GEN-LAST:event_pontuarDirActionPerformed

    private void pontuarEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontuarEsqActionPerformed
        this.controller.pontuar(true);
    }//GEN-LAST:event_pontuarEsqActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.controller.comecarJogo(this.jTextField2.getText(), this.jTextField1.getText());
    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(ViewJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewJogo().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ViewJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hisJogo1;
    private javax.swing.JLabel hisJogo2;
    private javax.swing.JLabel hisJogo3;
    private javax.swing.JLabel hisJogo4;
    private javax.swing.JLabel hisJogo5;
    private javax.swing.JTextField horario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField placarDir;
    private javax.swing.JTextField placarEsq1;
    private javax.swing.JButton pontuarDir;
    private javax.swing.JButton pontuarEsq;
    private javax.swing.JLabel setDir;
    private javax.swing.JLabel setEsq;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizaPontos() {
        this.placarEsq1.setText(this.controller.getPlacarHome().getPontos() + "");
        this.placarDir.setText(this.controller.getPlacarVisitor().getPontos() + "");
    }

    @Override
    public void start() {
        this.pontuarDir.setEnabled(true);
        this.pontuarEsq.setEnabled(true);
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.horario.setEnabled(false);
        this.start.setEnabled(false);
        
        limpaPlacar();
    }

    private void criaHistorico() {
        this.historico = new ArrayList();
        this.historico.add(this.hisJogo1);
        this.historico.add(this.hisJogo2);
        this.historico.add(this.hisJogo3);
        this.historico.add(this.hisJogo4);
        this.historico.add(this.hisJogo5);
    }

    private void setDisabled() {
        this.pontuarDir.setEnabled(false);
        this.pontuarEsq.setEnabled(false);
        this.placarDir.setEnabled(false);
        this.placarEsq1.setEnabled(false);
    }

    @Override
    public void endSet(String nomeWinner, int sets, boolean casa) {
        JOptionPane.showMessageDialog(null, "Equipe " + nomeWinner + " Venceu o set " + this.controller.getNumSet() + "!");
        this.placarDir.setText("0");
        this.placarEsq1.setText("0");
        
        if(casa) {
            setEsq.setText(Integer.toString(sets));
        }
        else {
            setDir.setText(Integer.toString(sets));
        }
        
        this.historico.get(this.controller.getNumSet() - 1).setText(this.controller.getPlacar());
    }

    @Override
    public void endGame(String nomeWinner, int sets, boolean casa) {
        JOptionPane.showMessageDialog(null, "Equipe " + nomeWinner + " venceu!");
        historico.get(this.controller.getNumSet() - 1).setText(this.controller.getPlacar());
        
        if(casa) {
            setEsq.setText(Integer.toString(sets));
        }
        else {
            setDir.setText(Integer.toString(sets));
        }
        
        pontuarDir.setEnabled(false);
        pontuarEsq.setEnabled(false);
        start.setEnabled(true);
        horario.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        
        controller = new ControllerJogo();
        controller.attach(this);
    }
    
    private void limpaPlacar() {
        placarDir.setText("0");
        placarEsq1.setText("0");
        setDir.setText("0");
        setEsq.setText("0");
        for(JLabel Campo : historico) {
            Campo.setText(" - ");
        }
    }
}
