/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todososjogos;

/**
 *
 * @author ALUNO
 */
public class TodosOsJogos extends javax.swing.JFrame {

    /**
     * Creates new form TodosOsJogos
     */
    public TodosOsJogos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuParOuImpar = new javax.swing.JMenuItem();
        menuSoma = new javax.swing.JMenuItem();
        menuMulti = new javax.swing.JMenuItem();
        menuSoma2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Selecione um jogo pelo menu");

        jMenu1.setText("Jogos");

        menuParOuImpar.setText("Par ou Ímpar");
        menuParOuImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParOuImparActionPerformed(evt);
            }
        });
        jMenu1.add(menuParOuImpar);

        menuSoma.setText("Soma");
        menuSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSomaActionPerformed(evt);
            }
        });
        jMenu1.add(menuSoma);

        menuMulti.setText("Multiplicação");
        menuMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMultiActionPerformed(evt);
            }
        });
        jMenu1.add(menuMulti);

        menuSoma2.setText("Soma 2");
        menuSoma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSoma2ActionPerformed(evt);
            }
        });
        jMenu1.add(menuSoma2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuParOuImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParOuImparActionPerformed
        // TODO add your handling code here:
       new ParOuImpar().setVisible(true);
    }//GEN-LAST:event_menuParOuImparActionPerformed

    private void menuMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMultiActionPerformed
        // TODO add your handling code here:
        new JogoMulti().setVisible(true);
    }//GEN-LAST:event_menuMultiActionPerformed

    private void menuSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSomaActionPerformed
        // TODO add your handling code here:
        new JogoSoma().setVisible(true);
    }//GEN-LAST:event_menuSomaActionPerformed

    private void menuSoma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSoma2ActionPerformed
        // TODO add your handling code here:
        new JogoSoma2().setVisible(true);
    }//GEN-LAST:event_menuSoma2ActionPerformed

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
            java.util.logging.Logger.getLogger(TodosOsJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodosOsJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodosOsJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodosOsJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodosOsJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuMulti;
    private javax.swing.JMenuItem menuParOuImpar;
    private javax.swing.JMenuItem menuSoma;
    private javax.swing.JMenuItem menuSoma2;
    // End of variables declaration//GEN-END:variables
}
