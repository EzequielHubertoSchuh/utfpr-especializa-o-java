package com.utfpr;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezequiel
 */
public class ImprimirPasseio extends javax.swing.JFrame {

    private static ImprimirPasseio imprimirPasseioUnico;
    
    ImprimirPasseio() {
        initComponents();
    }
    
    public static ImprimirPasseio criaImprimirPasseio(){
        if(imprimirPasseioUnico == null){
            imprimirPasseioUnico = new ImprimirPasseio();
        }
        return imprimirPasseioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImprimirPasseio = new javax.swing.JButton();
        btnExcluirPasseio = new javax.swing.JButton();
        btnSairPasseio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imprimir passeio");

        btnImprimirPasseio.setBackground(new java.awt.Color(255, 255, 51));
        btnImprimirPasseio.setForeground(new java.awt.Color(255, 51, 51));
        btnImprimirPasseio.setText("Imprimir Todos");
        btnImprimirPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPasseioActionPerformed(evt);
            }
        });

        btnExcluirPasseio.setBackground(new java.awt.Color(255, 255, 51));
        btnExcluirPasseio.setForeground(new java.awt.Color(255, 51, 51));
        btnExcluirPasseio.setText("Excluir Todos");
        btnExcluirPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPasseioActionPerformed(evt);
            }
        });

        btnSairPasseio.setText("Sair");
        btnSairPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPasseioActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Qtd. Rodas", "Veloc Máx", "Qtd. Pist", "Potência", "Qtd. Passageiros", "Calcular"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnImprimirPasseio)
                .addGap(31, 31, 31)
                .addComponent(btnExcluirPasseio)
                .addGap(39, 39, 39)
                .addComponent(btnSairPasseio)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirPasseio)
                    .addComponent(btnExcluirPasseio)
                    .addComponent(btnSairPasseio))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPasseioActionPerformed
        listarTabPasseio();
    }//GEN-LAST:event_btnImprimirPasseioActionPerformed

    private void btnSairPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPasseioActionPerformed
        sair();
    }//GEN-LAST:event_btnSairPasseioActionPerformed

    public void listarTabPasseio(){
        DefaultTableModel modeloTab = new DefaultTableModel();
        modeloTab = (DefaultTableModel) jTable1.getModel();
        int posLin = 0;
        modeloTab.setRowCount(posLin);
        if (BDVeiculos.getDbPasseio().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veiculos de passeio vazio", "ERRO", 0);
        } else {
            for (int i = 0; i < BDVeiculos.getDbPasseio().size(); i++) {
                modeloTab.insertRow(posLin, new Object[]{
                    BDVeiculos.getDbPasseio().get(i).getPlaca(), 
                    BDVeiculos.getDbPasseio().get(i).getMarca(), 
                    BDVeiculos.getDbPasseio().get(i).getModelo(), 
                    BDVeiculos.getDbPasseio().get(i).getCor(), 
                    BDVeiculos.getDbPasseio().get(i).getQtdRodas(), 
                    BDVeiculos.getDbPasseio().get(i).getVeloMax(), 
                    BDVeiculos.getDbPasseio().get(i).getMotor().getQtdPist(), 
                    BDVeiculos.getDbPasseio().get(i).getMotor().getPotencia(), 
                    BDVeiculos.getDbPasseio().get(i).getQtdPassageiros(), 
                    BDVeiculos.getDbPasseio().get(i).calcular(),});
                posLin++;
            }
        }
    }
    
    private void btnExcluirPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPasseioActionPerformed
        BDVeiculos.getDbPasseio().clear();
        listarTabPasseio();
    }//GEN-LAST:event_btnExcluirPasseioActionPerformed

    public void sair(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            GestaoPasseio.criaGestaoPasseio().setVisible(true);
            dispose();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirPasseio;
    private javax.swing.JButton btnImprimirPasseio;
    private javax.swing.JButton btnSairPasseio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
