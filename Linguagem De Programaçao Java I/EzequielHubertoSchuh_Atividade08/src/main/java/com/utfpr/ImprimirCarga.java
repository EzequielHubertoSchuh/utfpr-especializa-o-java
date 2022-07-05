package com.utfpr;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezequiel
 */
public class ImprimirCarga extends javax.swing.JFrame {

    private static ImprimirCarga imprimirCargaUnico;
    
    
    
    private ImprimirCarga() {
        initComponents();
    }
    
    public static ImprimirCarga criaImprimirCarga(){
        if(imprimirCargaUnico == null){
            imprimirCargaUnico = new ImprimirCarga();
        }
        return imprimirCargaUnico;
    }
    
    
    public void listarTabCarga(){
       DefaultTableModel modeloTab = new DefaultTableModel();
        modeloTab = (DefaultTableModel) jTable1.getModel();
        int posLin = 0;
        modeloTab.setRowCount(posLin);
        if (BDVeiculos.getDbCarga().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veiculos de carga vazio", "ERRO", 0);
        } else {
            for (int i = 0; i < BDVeiculos.getDbCarga().size(); i++) {
                modeloTab.insertRow(posLin, new Object[]{
                    BDVeiculos.getDbCarga().get(i).getPlaca(), 
                    BDVeiculos.getDbCarga().get(i).getMarca(), 
                    BDVeiculos.getDbCarga().get(i).getModelo(), 
                    BDVeiculos.getDbCarga().get(i).getCor(), 
                    BDVeiculos.getDbCarga().get(i).getQtdRodas(), 
                    BDVeiculos.getDbCarga().get(i).getVeloMax(), 
                    BDVeiculos.getDbCarga().get(i).getMotor().getQtdPist(), 
                    BDVeiculos.getDbCarga().get(i).getMotor().getPotencia(), 
                    BDVeiculos.getDbCarga().get(i).getTara(), 
                    BDVeiculos.getDbCarga().get(i).getCargaMax(), 
                    BDVeiculos.getDbCarga().get(i).calcular()});
                posLin++;
            }
        } 
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnImprimirCarga = new javax.swing.JButton();
        btnExcluirCarga = new javax.swing.JButton();
        btnSairCarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imprimir carga");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Qtd. Rodas", "Veloc Máx", "Qtd. Pist", "Potência", "Tara", "Carga Máx", "Calcular"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnImprimirCarga.setBackground(new java.awt.Color(255, 255, 51));
        btnImprimirCarga.setForeground(new java.awt.Color(255, 51, 51));
        btnImprimirCarga.setText("Imprimir Todos");
        btnImprimirCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCargaActionPerformed(evt);
            }
        });

        btnExcluirCarga.setBackground(new java.awt.Color(255, 255, 51));
        btnExcluirCarga.setForeground(new java.awt.Color(255, 51, 51));
        btnExcluirCarga.setText("Excluir Todos");
        btnExcluirCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCargaActionPerformed(evt);
            }
        });

        btnSairCarga.setText("Sair");
        btnSairCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnImprimirCarga)
                        .addGap(31, 31, 31)
                        .addComponent(btnExcluirCarga)
                        .addGap(39, 39, 39)
                        .addComponent(btnSairCarga))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirCarga)
                    .addComponent(btnExcluirCarga)
                    .addComponent(btnSairCarga))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCargaActionPerformed
        listarTabCarga();
    }//GEN-LAST:event_btnImprimirCargaActionPerformed

    private void btnSairCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCargaActionPerformed
        sair();
    }//GEN-LAST:event_btnSairCargaActionPerformed

    private void btnExcluirCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCargaActionPerformed
        BDVeiculos.getDbCarga().clear();
        listarTabCarga();
    }//GEN-LAST:event_btnExcluirCargaActionPerformed

    public void sair(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            GestaoCarga.criaGestaoCarga().setVisible(true);
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
    private javax.swing.JButton btnExcluirCarga;
    private javax.swing.JButton btnImprimirCarga;
    private javax.swing.JButton btnSairCarga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
