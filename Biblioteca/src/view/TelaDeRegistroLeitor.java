package view;

import data.LivroDAO;
import data.LoginLeitor;
import data.LoginLeitorDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class TelaDeRegistroLeitor extends javax.swing.JFrame {

    public TelaDeRegistroLeitor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelRegistroLeitor = new javax.swing.JPanel();
        registrese = new javax.swing.JLabel();
        botaoRegistrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        nomecompleto = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelRegistroLeitor.setBackground(new java.awt.Color(0, 0, 0));
        painelRegistroLeitor.setForeground(new java.awt.Color(255, 255, 255));

        registrese.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        registrese.setForeground(new java.awt.Color(255, 255, 255));
        registrese.setText("Registre-se!");

        botaoRegistrar.setBackground(new java.awt.Color(51, 255, 51));
        botaoRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botaoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(255, 51, 51));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(51, 51, 255));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        nomecompleto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        nomecompleto.setForeground(new java.awt.Color(255, 255, 255));
        nomecompleto.setText("Usuário:");

        email.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-mail:");

        senha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha:");

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Máximo 10 caractereres)");

        javax.swing.GroupLayout painelRegistroLeitorLayout = new javax.swing.GroupLayout(painelRegistroLeitor);
        painelRegistroLeitor.setLayout(painelRegistroLeitorLayout);
        painelRegistroLeitorLayout.setHorizontalGroup(
            painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRegistroLeitorLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(botaoVoltar)
                .addGap(45, 45, 45)
                .addComponent(botaoLimpar)
                .addGap(45, 45, 45)
                .addComponent(botaoRegistrar)
                .addGap(31, 31, 31))
            .addGroup(painelRegistroLeitorLayout.createSequentialGroup()
                .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRegistroLeitorLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(registrese))
                    .addGroup(painelRegistroLeitorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomecompleto)
                            .addComponent(email)
                            .addGroup(painelRegistroLeitorLayout.createSequentialGroup()
                                .addComponent(senha)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtSenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelRegistroLeitorLayout.setVerticalGroup(
            painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRegistroLeitorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(registrese)
                .addGap(38, 38, 38)
                .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomecompleto)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(painelRegistroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRegistrar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoVoltar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistroLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistroLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
try 
{
        String email = txtEmail.getText();
        String usuario = txtUser.getText();
        String senha = txtSenha.getText();

if (senha.length() > 20) 
{
            JOptionPane.showMessageDialog(null, "A senha não pode ter mais de 20 caracteres.");
            return;
}

        LoginLeitor loginUser = new LoginLeitor();
        loginUser.setEmail(email);
        loginUser.setUsuario(usuario);
        loginUser.setSenha(senha);

        LivroDAO livroDao = new LivroDAO();
        livroDao.conectar();
        Connection con = livroDao.getCon();

 if (con == null) 
 {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados, tente novamente.");
            return;
 }

        LoginLeitorDAO loginUserDao = new LoginLeitorDAO(con);

        int resultado = loginUserDao.registrarUser(loginUser);

 if (resultado > 0)
{
            JOptionPane.showMessageDialog(null, "Leitor registrado com sucesso.");
}
 else
{
            JOptionPane.showMessageDialog(null, "Erro ao registrar o leitor, tente novamente");
}

       livroDao.desconectar();
}
catch (Exception e)
{
        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
}

            TelaDeLogin login = new TelaDeLogin();
            login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botaoRegistrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        txtEmail.setText("");
        txtUser.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeRegistroLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomecompleto;
    private javax.swing.JPanel painelRegistroLeitor;
    private javax.swing.JLabel registrese;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
