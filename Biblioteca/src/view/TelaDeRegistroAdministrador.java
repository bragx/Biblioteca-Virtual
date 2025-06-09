package view;

import java.sql.Connection;
import data.LivroDAO;
import data.LoginAdministrador;
import data.LoginAdministradorDAO;
import javax.swing.JOptionPane;

public class TelaDeRegistroAdministrador extends javax.swing.JFrame {

    public TelaDeRegistroAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leitorOuAdm = new javax.swing.ButtonGroup();
        painelRegistro = new javax.swing.JPanel();
        registrese = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        botaoRegistrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelRegistro.setBackground(new java.awt.Color(0, 0, 0));
        painelRegistro.setForeground(new java.awt.Color(255, 255, 255));

        registrese.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        registrese.setForeground(new java.awt.Color(255, 255, 255));
        registrese.setText("Registre-se!");

        user.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Usuário:");

        senha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha:");

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Máximo 10 caractereres)");

        javax.swing.GroupLayout painelRegistroLayout = new javax.swing.GroupLayout(painelRegistro);
        painelRegistro.setLayout(painelRegistroLayout);
        painelRegistroLayout.setHorizontalGroup(
            painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar)
                .addGap(45, 45, 45)
                .addComponent(botaoLimpar)
                .addGap(45, 45, 45)
                .addComponent(botaoRegistrar)
                .addGap(42, 42, 42))
            .addGroup(painelRegistroLayout.createSequentialGroup()
                .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRegistroLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(registrese))
                    .addGroup(painelRegistroLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addGroup(painelRegistroLayout.createSequentialGroup()
                                .addComponent(senha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addGap(12, 12, 12)
                        .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        painelRegistroLayout.setVerticalGroup(
            painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRegistroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(registrese)
                .addGap(87, 87, 87)
                .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(69, 69, 69)
                .addGroup(painelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRegistrar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoVoltar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
try 
{
        String usuario = txtUser.getText();
        String senha = txtSenha.getText();

if (usuario.length() > 20 || senha.length() > 20) 
{
            JOptionPane.showMessageDialog(null, "Usuário e senha não podem ter mais de 20 caracteres.");
            return;
}

        LoginAdministrador loginAdm = new LoginAdministrador();
        loginAdm.setUsuario(usuario);
        loginAdm.setSenha(senha);

        LivroDAO livroDao = new LivroDAO();
        livroDao.conectar();
        Connection con = livroDao.getCon();

 if (con == null) 
 {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados, tente novamente.");
            return;
 }

        LoginAdministradorDAO loginAdmDao = new LoginAdministradorDAO(con);

        int resultado = loginAdmDao.registrarAdm(loginAdm);

 if (resultado > 0)
{
            JOptionPane.showMessageDialog(null, "Administrador registrado com sucesso.");
}
 else
{
            JOptionPane.showMessageDialog(null, "Erro ao registrar administrador, tente novamente");
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
            java.util.logging.Logger.getLogger(TelaDeRegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeRegistroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup leitorOuAdm;
    private javax.swing.JPanel painelRegistro;
    private javax.swing.JLabel registrese;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
