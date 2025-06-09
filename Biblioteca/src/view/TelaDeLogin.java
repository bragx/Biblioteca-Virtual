package view;

import java.sql.Connection;
import data.AutenticadorDAO;
import data.LivroDAO;
import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {

    
    public TelaDeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        facaSeuLogin = new javax.swing.JLabel();
        botaoGoogle = new javax.swing.JButton();
        botaoLinkedin = new javax.swing.JButton();
        botaoApple = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        botaoCriarContaLeitor = new javax.swing.JButton();
        botaoCriarContaAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelLogin.setBackground(new java.awt.Color(0, 0, 0));
        painelLogin.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        facaSeuLogin.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        facaSeuLogin.setForeground(new java.awt.Color(255, 255, 255));
        facaSeuLogin.setText("Faça seu login");

        botaoGoogle.setBackground(new java.awt.Color(0, 0, 0));
        botaoGoogle.setForeground(new java.awt.Color(0, 0, 0));
        botaoGoogle.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicko\\OneDrive\\Desktop\\Icones projeto\\Ícone Google.png")); // NOI18N
        botaoGoogle.setBorderPainted(false);
        botaoGoogle.setContentAreaFilled(false);
        botaoGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGoogleActionPerformed(evt);
            }
        });

        botaoLinkedin.setBackground(new java.awt.Color(0, 0, 0));
        botaoLinkedin.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicko\\OneDrive\\Desktop\\Icones projeto\\Ícone Linkedin.png")); // NOI18N
        botaoLinkedin.setBorderPainted(false);
        botaoLinkedin.setContentAreaFilled(false);
        botaoLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLinkedinActionPerformed(evt);
            }
        });

        botaoApple.setBackground(new java.awt.Color(0, 0, 0));
        botaoApple.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicko\\OneDrive\\Desktop\\Icones projeto\\Ícone Apple.png")); // NOI18N
        botaoApple.setBorderPainted(false);
        botaoApple.setContentAreaFilled(false);
        botaoApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAppleActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Insira seu usuário");
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(102, 102, 102));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setText("Insira sua senha");
        txtSenha.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });

        botaoEntrar.setBackground(new java.awt.Color(102, 102, 102));
        botaoEntrar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorderPainted(false);
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        botaoCriarContaLeitor.setForeground(new java.awt.Color(255, 255, 255));
        botaoCriarContaLeitor.setText("Criar conta para leitor");
        botaoCriarContaLeitor.setBorderPainted(false);
        botaoCriarContaLeitor.setContentAreaFilled(false);
        botaoCriarContaLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaLeitorActionPerformed(evt);
            }
        });

        botaoCriarContaAdm.setForeground(new java.awt.Color(255, 255, 255));
        botaoCriarContaAdm.setText("Criar conta para Administardor");
        botaoCriarContaAdm.setBorderPainted(false);
        botaoCriarContaAdm.setContentAreaFilled(false);
        botaoCriarContaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                .addComponent(txtUsuario))
                            .addComponent(facaSeuLogin)))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(botaoGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoApple, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(botaoCriarContaLeitor)
                        .addGap(33, 33, 33)
                        .addComponent(botaoCriarContaAdm)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facaSeuLogin)
                .addGap(72, 72, 72)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarContaLeitor)
                    .addComponent(botaoCriarContaAdm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApple, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLinkedinActionPerformed
        //entrar ou criar conta linkedin
    }//GEN-LAST:event_botaoLinkedinActionPerformed

    private void botaoAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAppleActionPerformed
        //entrar ou criar conta apple
    }//GEN-LAST:event_botaoAppleActionPerformed

    private void botaoGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGoogleActionPerformed
        //entrar ou criar conta google
    }//GEN-LAST:event_botaoGoogleActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
      if(txtUsuario.getText().equals("Insira seu usuário"))
      {
            txtUsuario.setText("");
      }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().isEmpty())
        {
                txtUsuario.setText("Insira seu usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        if(txtSenha.getText().equals("Insira sua senha"))
        {
                txtSenha.setText("");
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
       if(txtSenha.getText().isEmpty())
        {
                txtSenha.setText("Insira sua senha");
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String usuarioOuEmail = txtUsuario.getText();
        String senha = txtSenha.getText();

            LivroDAO livroDao = new LivroDAO();
            livroDao.conectar();
            Connection con = livroDao.getCon();

    AutenticadorDAO dao = new AutenticadorDAO(con);
    String resultado = dao.verificarLogin(usuarioOuEmail, senha);

    switch (resultado) {
        case "administrador":
            JOptionPane.showMessageDialog(null, "Bem-vindo administrador!");
            TelaInicialAdm inicioAdm = new TelaInicialAdm();
            inicioAdm.setVisible(true);
            this.dispose();
            break;
        case "leitor":
            JOptionPane.showMessageDialog(null, "Bem-vindo, caro leitor!");
            TelaInicialLeitor inicioLeitor = new TelaInicialLeitor();
            inicioLeitor.setVisible(true);
            this.dispose();
            break;
        case "nao_encontrado":
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
            break;
        case "erro":
            JOptionPane.showMessageDialog(null, "Essa conta não existe, registre-se!");
            break;
    }

    livroDao.desconectar();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoCriarContaLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaLeitorActionPerformed
        TelaDeRegistroLeitor registroLeitor = new TelaDeRegistroLeitor();
        registroLeitor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCriarContaLeitorActionPerformed

    private void botaoCriarContaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaAdmActionPerformed
        TelaDeRegistroAdministrador registroAdm = new TelaDeRegistroAdministrador();
        registroAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCriarContaAdmActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApple;
    private javax.swing.JButton botaoCriarContaAdm;
    private javax.swing.JButton botaoCriarContaLeitor;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoGoogle;
    private javax.swing.JButton botaoLinkedin;
    private javax.swing.JLabel facaSeuLogin;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
