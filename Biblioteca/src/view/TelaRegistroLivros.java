package view;

import data.LivroDAO;
import data.Livro;
import javax.swing.JOptionPane;

public class TelaRegistroLivros extends javax.swing.JFrame {

    public TelaRegistroLivros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastro = new javax.swing.JPanel();
        cadastrodelivros = new javax.swing.JLabel();
        nomedolivro = new javax.swing.JLabel();
        generodolivro = new javax.swing.JLabel();
        datadolancamento = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataLancamento = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCadastro.setBackground(new java.awt.Color(0, 0, 0));

        cadastrodelivros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastrodelivros.setForeground(new java.awt.Color(255, 255, 255));
        cadastrodelivros.setText("Cadastro de Livros");

        nomedolivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomedolivro.setForeground(new java.awt.Color(255, 255, 255));
        nomedolivro.setText("Nome do livro:");

        generodolivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generodolivro.setForeground(new java.awt.Color(255, 255, 255));
        generodolivro.setText("Gênero do livro:");

        datadolancamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        datadolancamento.setForeground(new java.awt.Color(255, 255, 255));
        datadolancamento.setText("Data de lançamento: (aaaa-mm-dd)");

        autor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        autor.setForeground(new java.awt.Color(255, 255, 255));
        autor.setText("Autor (a):");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        txtDataLancamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataLancamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataLancamento.setForeground(new java.awt.Color(0, 0, 0));

        txtGenero.setBackground(new java.awt.Color(255, 255, 255));
        txtGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(0, 0, 0));

        txtAutor.setBackground(new java.awt.Color(255, 255, 255));
        txtAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(0, 0, 0));

        botaoCadastrar.setBackground(new java.awt.Color(51, 255, 51));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(255, 51, 51));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(51, 51, 255));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(cadastrodelivros))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datadolancamento)
                            .addComponent(nomedolivro)
                            .addComponent(generodolivro)
                            .addComponent(autor))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtGenero)
                            .addComponent(txtDataLancamento)
                            .addComponent(txtAutor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addComponent(botaoVoltar)
                .addGap(54, 54, 54)
                .addComponent(botaoLimpar)
                .addGap(54, 54, 54)
                .addComponent(botaoCadastrar)
                .addGap(52, 52, 52))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cadastrodelivros)
                .addGap(60, 60, 60)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomedolivro)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generodolivro)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datadolancamento)
                    .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoVoltar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

            String nome = txtNome.getText();
            String genero = txtGenero.getText();
            String data = txtDataLancamento.getText();
            String autor = txtAutor.getText();

if(nome.isEmpty() || genero.isEmpty() || data.isEmpty() || autor.isEmpty())
{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.");
             return;
}
if(!data.matches("[0-9]{4}[-][0-9]{2}[-][0-9]{2}"))
{
            JOptionPane.showMessageDialog(null, "Data inválida, insira a data de lançamento no formato correto. (aaaa-mm-dd)");
            return;
}
try
{
            Livro livro = new Livro(nome, genero, data, autor); 
            LivroDAO livroDao = new LivroDAO(); 

if (livroDao.conectar()) 
{
            livroDao.salvar(livro);
            livroDao.desconectar();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
} 
else 
{
             JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
}

            TelaInicialAdm inicioAdm = new TelaInicialAdm();
            inicioAdm.setVisible(true);
            this.dispose();
}
catch (Exception e) 
{
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar livro: " + e.getMessage());
}
            txtNome.setText("");
            txtGenero.setText("");
            txtDataLancamento.setText("");
            txtAutor.setText("");
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
           txtNome.setText("");
           txtGenero.setText("");
           txtDataLancamento.setText("");
           txtAutor.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaInicialAdm inicioAdm = new TelaInicialAdm();
        inicioAdm.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaRegistroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistroLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel cadastrodelivros;
    private javax.swing.JLabel datadolancamento;
    private javax.swing.JLabel generodolivro;
    private javax.swing.JLabel nomedolivro;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
