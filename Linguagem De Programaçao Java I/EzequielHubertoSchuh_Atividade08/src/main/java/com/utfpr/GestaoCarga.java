package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class GestaoCarga extends javax.swing.JFrame {
    
    private static GestaoCarga gestaoCargaUnico;

    private GestaoCarga() {
        initComponents();
    }
    
    public static GestaoCarga criaGestaoCarga(){
        if(gestaoCargaUnico == null){
            gestaoCargaUnico = new GestaoCarga();
        }
        return gestaoCargaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadastrarCarga = new javax.swing.JButton();
        buttonConsultarCarga = new javax.swing.JButton();
        buttonImprimirCarga = new javax.swing.JButton();
        buttonSairCarga = new javax.swing.JButton();
        labelCadastrarCarga = new javax.swing.JLabel();
        labelConsultarCarga = new javax.swing.JLabel();
        labelImprimirCarga = new javax.swing.JLabel();
        labelSairCarga = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCadastrar = new javax.swing.JMenuItem();
        itemConsultar = new javax.swing.JMenuItem();
        itemImprimir = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de passeio");

        buttonCadastrarCarga.setBackground(new java.awt.Color(51, 255, 51));
        buttonCadastrarCarga.setText(" ");
        buttonCadastrarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCargaActionPerformed(evt);
            }
        });

        buttonConsultarCarga.setBackground(new java.awt.Color(51, 255, 51));
        buttonConsultarCarga.setText(" ");
        buttonConsultarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarCargaActionPerformed(evt);
            }
        });

        buttonImprimirCarga.setBackground(new java.awt.Color(51, 255, 51));
        buttonImprimirCarga.setText(" ");
        buttonImprimirCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirCargaActionPerformed(evt);
            }
        });

        buttonSairCarga.setBackground(new java.awt.Color(255, 51, 51));
        buttonSairCarga.setText(" ");
        buttonSairCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairCargaActionPerformed(evt);
            }
        });

        labelCadastrarCarga.setText("Cadastrar");

        labelConsultarCarga.setText("Consultar / Excluir pela placa");

        labelImprimirCarga.setText("Imprimir / Excluir todos");

        labelSairCarga.setText("Sair");

        jMenu1.setText("File");

        itemCadastrar.setText("Cadastrar");
        itemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(itemCadastrar);

        itemConsultar.setText("Consultar / Excluir pela placa");
        itemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(itemConsultar);

        itemImprimir.setText("Imprimir / Excluir todos");
        itemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(itemImprimir);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        jMenu1.add(itemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCadastrarCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonConsultarCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonImprimirCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSairCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastrarCarga)
                    .addComponent(labelConsultarCarga)
                    .addComponent(labelImprimirCarga)
                    .addComponent(labelSairCarga))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarCarga)
                    .addComponent(labelCadastrarCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConsultarCarga)
                    .addComponent(labelConsultarCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonImprimirCarga)
                    .addComponent(labelImprimirCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSairCarga)
                    .addComponent(labelSairCarga))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarCargaActionPerformed
        abreJanCadastrarCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_buttonCadastrarCargaActionPerformed

    public void abreJanCadastrarCarga(){
        CadastroDeCarga.criaCadastroDeCarga().setVisible(true);
    }
    
    private void buttonConsultarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarCargaActionPerformed
        abreJanConsultaCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_buttonConsultarCargaActionPerformed

    public void abreJanConsultaCarga(){
        ConsultarCarga.criaConsultarCarga().setVisible(true);
    }
    
    public void abreJanImprimirCarga(){
        ImprimirCarga.criaImprimirCarga().setVisible(true);
    }
    
    private void buttonImprimirCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirCargaActionPerformed
        abreJanImprimirCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_buttonImprimirCargaActionPerformed

    private void buttonSairCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairCargaActionPerformed
        sair();
    }//GEN-LAST:event_buttonSairCargaActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        sair();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImprimirActionPerformed
        abreJanImprimirCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_itemImprimirActionPerformed

    private void itemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarActionPerformed
        abreJanCadastrarCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_itemCadastrarActionPerformed

    private void itemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarActionPerformed
        abreJanConsultaCarga();
        ocultaJanGestaoCarga();
    }//GEN-LAST:event_itemConsultarActionPerformed

    public void ocultaJanGestaoCarga(){
        gestaoCargaUnico.setVisible(false);
    }
    
    public void sair(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            dispose();
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarCarga;
    private javax.swing.JButton buttonConsultarCarga;
    private javax.swing.JButton buttonImprimirCarga;
    private javax.swing.JButton buttonSairCarga;
    private javax.swing.JMenuItem itemCadastrar;
    private javax.swing.JMenuItem itemConsultar;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCadastrarCarga;
    private javax.swing.JLabel labelConsultarCarga;
    private javax.swing.JLabel labelImprimirCarga;
    private javax.swing.JLabel labelSairCarga;
    // End of variables declaration//GEN-END:variables
}
