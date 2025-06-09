package view;

import data.LivroDAO;
import data.Livro;
import javax.swing.table.DefaultTableModel;

public class TelaInicialLeitor extends javax.swing.JFrame {

    public TelaInicialLeitor() {
        initComponents();
        
        tabelaLivros.setModel(new DefaultTableModel(
        new Object[][]{},
        new String[]{"Nome", "Gênero", "Data", "Autor"}
    ));
        
    carregarLivros();
    }
    
       private void carregarLivros()
    {
            DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
            modelo.setRowCount(0);
            
            LivroDAO livroDao = new LivroDAO();
            
            for(Livro livro : livroDao.getLivros())
            {
                    modelo.addRow(new Object[]{
                    livro.getNome(),
                    livro.getGenero(),
                    livro.getAnoLancamento(),
                    livro.getAutor()
                    });
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaInicialLeitor = new javax.swing.JPanel();
        botaoInicio = new javax.swing.JButton();
        botaoAjustes = new javax.swing.JButton();
        inicio = new javax.swing.JLabel();
        ajustes = new javax.swing.JLabel();
        scrollTabela = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        botaoAdicionarLivro = new javax.swing.JButton();
        botaoRemoverLivro = new javax.swing.JButton();
        livrosDisponiveis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaInicialLeitor.setBackground(new java.awt.Color(0, 0, 0));
        painelTelaInicialLeitor.setForeground(new java.awt.Color(255, 255, 255));

        botaoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicko\\OneDrive\\Desktop\\Icones projeto\\Ícone início.png")); // NOI18N
        botaoInicio.setContentAreaFilled(false);
        botaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicioActionPerformed(evt);
            }
        });

        botaoAjustes.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicko\\OneDrive\\Desktop\\Icones projeto\\Ícone ajustes.png")); // NOI18N
        botaoAjustes.setContentAreaFilled(false);
        botaoAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjustesActionPerformed(evt);
            }
        });

        inicio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setText("Ínicio");

        ajustes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ajustes.setForeground(new java.awt.Color(255, 255, 255));
        ajustes.setText("Ajustes");

        tabelaLivros.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTabela.setViewportView(tabelaLivros);

        botaoAdicionarLivro.setBackground(new java.awt.Color(51, 255, 51));
        botaoAdicionarLivro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botaoAdicionarLivro.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarLivro.setText("Adicionar Livro");
        botaoAdicionarLivro.setEnabled(false);
        botaoAdicionarLivro.setFocusPainted(false);

        botaoRemoverLivro.setBackground(new java.awt.Color(255, 51, 51));
        botaoRemoverLivro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botaoRemoverLivro.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverLivro.setText("Remover Livro");
        botaoRemoverLivro.setEnabled(false);
        botaoRemoverLivro.setFocusPainted(false);

        livrosDisponiveis.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        livrosDisponiveis.setForeground(new java.awt.Color(255, 255, 255));
        livrosDisponiveis.setText("Livros Disponíveis:");

        javax.swing.GroupLayout painelTelaInicialLeitorLayout = new javax.swing.GroupLayout(painelTelaInicialLeitor);
        painelTelaInicialLeitor.setLayout(painelTelaInicialLeitorLayout);
        painelTelaInicialLeitorLayout.setHorizontalGroup(
            painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaInicialLeitorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaInicialLeitorLayout.createSequentialGroup()
                        .addComponent(inicio)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaInicialLeitorLayout.createSequentialGroup()
                        .addComponent(botaoInicio)
                        .addGap(71, 71, 71)))
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajustes)
                    .addComponent(botaoAjustes))
                .addGap(230, 230, 230))
            .addGroup(painelTelaInicialLeitorLayout.createSequentialGroup()
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTelaInicialLeitorLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(botaoRemoverLivro)
                        .addGap(43, 43, 43)
                        .addComponent(botaoAdicionarLivro))
                    .addGroup(painelTelaInicialLeitorLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(livrosDisponiveis))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        painelTelaInicialLeitorLayout.setVerticalGroup(
            painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaInicialLeitorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAjustes)
                    .addComponent(botaoInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajustes)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(livrosDisponiveis)
                .addGap(18, 18, 18)
                .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(painelTelaInicialLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarLivro)
                    .addComponent(botaoRemoverLivro))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaInicialLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaInicialLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjustesActionPerformed
        TelaAjustesLeitor ajustesLeitor = new TelaAjustesLeitor();
        ajustesLeitor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoAjustesActionPerformed

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
        // permanecer onde esta
    }//GEN-LAST:event_botaoInicioActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajustes;
    private javax.swing.JButton botaoAdicionarLivro;
    private javax.swing.JButton botaoAjustes;
    private javax.swing.JButton botaoInicio;
    private javax.swing.JButton botaoRemoverLivro;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel livrosDisponiveis;
    private javax.swing.JPanel painelTelaInicialLeitor;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabelaLivros;
    // End of variables declaration//GEN-END:variables
}
