/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.view;

import br.com.ifba.vp.login.view.TelaLogin;
import br.com.ifba.vp.produto.view.TelaVerificarEstoque;
import br.com.ifba.vp.fornecedor.view.TelaCadastroFornecedor;
import br.com.ifba.vp.funcionario.view.PesquisarFuncionario;
import br.com.ifba.vp.funcionario.view.TelaCadastroFuncionario;

/**
 *
 * @author iagobm
 */
public class TelaGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerente
     */
    public TelaGerente() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonPesquisarFuncionario = new javax.swing.JButton();
        buttonCadastrarFuncionario = new javax.swing.JButton();
        buttonCadastrarFornecedor = new javax.swing.JButton();
        buttonVerificarEstoque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Gerente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPesquisarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        buttonPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/funcionarios.png"))); // NOI18N
        buttonPesquisarFuncionario.setText("Pesquisar Funcionário");
        buttonPesquisarFuncionario.setMaximumSize(new java.awt.Dimension(111, 35));
        buttonPesquisarFuncionario.setMinimumSize(new java.awt.Dimension(111, 35));
        buttonPesquisarFuncionario.setPreferredSize(new java.awt.Dimension(111, 35));
        buttonPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPesquisarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 220, -1));

        buttonCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        buttonCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/novoFuncionario.png"))); // NOI18N
        buttonCadastrarFuncionario.setText("Cadastrar Funcionário");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, -1));

        buttonCadastrarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        buttonCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fornecedores.png"))); // NOI18N
        buttonCadastrarFornecedor.setText("Cadastrar Fornecedor");
        buttonCadastrarFornecedor.setMaximumSize(new java.awt.Dimension(111, 35));
        buttonCadastrarFornecedor.setMinimumSize(new java.awt.Dimension(111, 35));
        buttonCadastrarFornecedor.setPreferredSize(new java.awt.Dimension(111, 35));
        buttonCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCadastrarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 220, -1));

        buttonVerificarEstoque.setBackground(new java.awt.Color(255, 255, 255));
        buttonVerificarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VerEstoque.png"))); // NOI18N
        buttonVerificarEstoque.setText("Verificar Estoque");
        buttonVerificarEstoque.setMaximumSize(new java.awt.Dimension(111, 35));
        buttonVerificarEstoque.setMinimumSize(new java.awt.Dimension(111, 35));
        buttonVerificarEstoque.setPreferredSize(new java.awt.Dimension(111, 35));
        buttonVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerificarEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVerificarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modulo do Gerente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gerente.png"))); // NOI18N

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(buttonSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSair)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        new TelaCadastroFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed

    private void buttonCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFornecedorActionPerformed
        // TODO add your handling code here:
        new TelaCadastroFornecedor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCadastrarFornecedorActionPerformed

    private void buttonPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarFuncionarioActionPerformed
        // TODO add your handling code here:
        new PesquisarFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPesquisarFuncionarioActionPerformed

    private void buttonVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerificarEstoqueActionPerformed
        // TODO add your handling code here:
        new TelaVerificarEstoque(2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVerificarEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarFornecedor;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonPesquisarFuncionario;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonVerificarEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
