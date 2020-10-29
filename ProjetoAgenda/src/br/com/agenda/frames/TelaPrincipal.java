/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.frames;

import br.com.agenda.beans.Usuario;
import br.com.agenda.conection.ConnectionFactory;
import br.com.agenda.dao.UsuarioDAO;
import br.com.agenda.panels.CadPessoas;
import br.com.agenda.panels.CadUsuario;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Proway
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuarioLagado;
    private daoUsuario = new UsuarioDAO();

    public TelaPrincipal() {
        initComponents();
        ativar();
    }

    public void ativar() {
        //conecta com o banco
        Connection cnn = ConnectionFactory.getConnection();
        //esconde Menu
        if (usuarioLagado == null) {
            mnBar.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        mnBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        mnCadastro = new javax.swing.JMenu();
        mnCadastroDePessoa = new javax.swing.JMenuItem();
        mnCadUsuario = new javax.swing.JMenuItem();
        mnCadAgenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setText("Login");

        txtLogin.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Senha");

        pswSenha.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        pswSenha.setText("jPasswordField1");

        btnEntrar.setBackground(new java.awt.Color(153, 153, 0));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogin)
                    .addComponent(pswSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnEntrar))
        );

        jMenu1.setText("Arquivo");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        mnBar.add(jMenu1);

        mnCadastro.setText("Cadastro");

        mnCadastroDePessoa.setText("Cadastro de pessoas");
        mnCadastroDePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastroDePessoaActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadastroDePessoa);

        mnCadUsuario.setText("Cadastro de usuarios");
        mnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadUsuarioActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadUsuario);

        mnCadAgenda.setText("Adicionar agenda");
        mnCadastro.add(mnCadAgenda);

        mnBar.add(mnCadastro);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnCadastroDePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroDePessoaActionPerformed
        // TODO add your handling code here:
        JPanel cadPessoas = new CadPessoas();
        setContentPane(cadPessoas);
        pack();
        setVisible(true);

    }//GEN-LAST:event_mnCadastroDePessoaActionPerformed

    private void mnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadUsuarioActionPerformed
        // TODO add your handling code here:
        JPanel cadUsuarios = new CadUsuario();
        setContentPane(cadUsuarios);
        pack();
        setVisible(true);
    }//GEN-LAST:event_mnCadUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        String login = txtLogin.getText();
        String senha = pswSenha.getText();
        
        if(!"".equals(login) && !"".equals(senha)){
            usuarioLogado = daoUsuario.fazerLogin(login,senha);
            
            if(usuarioLogado != null && usuarioLogado.getIdPessoa() > )
                mnBar.setVisible(true);
            panelLogin.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(this, "Informe seu login/senha");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenuItem mnCadAgenda;
    private javax.swing.JMenuItem mnCadUsuario;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnCadastroDePessoa;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
