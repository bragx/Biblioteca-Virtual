package view;


public class TelaAjustesLeitor extends javax.swing.JFrame {


    public TelaAjustesLeitor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAjustes = new javax.swing.JPanel();
        ajustes = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoSairDaConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAjustes.setBackground(new java.awt.Color(0, 0, 0));

        ajustes.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        ajustes.setForeground(new java.awt.Color(255, 255, 255));
        ajustes.setText("Ajustes");

        botaoVoltar.setBackground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar para tela inicial");
        botaoVoltar.setBorderPainted(false);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSairDaConta.setBackground(new java.awt.Color(102, 102, 102));
        botaoSairDaConta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        botaoSairDaConta.setForeground(new java.awt.Color(255, 255, 255));
        botaoSairDaConta.setText("Sair da conta");
        botaoSairDaConta.setBorderPainted(false);
        botaoSairDaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairDaContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAjustesLayout = new javax.swing.GroupLayout(painelAjustes);
        painelAjustes.setLayout(painelAjustesLayout);
        painelAjustesLayout.setHorizontalGroup(
            painelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAjustesLayout.createSequentialGroup()
                .addGroup(painelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAjustesLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(ajustes))
                    .addGroup(painelAjustesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(painelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSairDaConta))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        painelAjustesLayout.setVerticalGroup(
            painelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAjustesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ajustes)
                .addGap(58, 58, 58)
                .addComponent(botaoSairDaConta)
                .addGap(41, 41, 41)
                .addComponent(botaoVoltar)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaInicialLeitor inicioLeitor = new TelaInicialLeitor();
        inicioLeitor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSairDaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairDaContaActionPerformed
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairDaContaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAjustesLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAjustesLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAjustesLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAjustesLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAjustesLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajustes;
    private javax.swing.JButton botaoSairDaConta;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel painelAjustes;
    // End of variables declaration//GEN-END:variables
}
