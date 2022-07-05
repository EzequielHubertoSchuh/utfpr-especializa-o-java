package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class GestaoPasseio extends javax.swing.JFrame {
    
    private static GestaoPasseio gestaoPasseioUnico;

    GestaoPasseio() {
        initComponents();
    }
    
    public static GestaoPasseio criaGestaoPasseio(){
        if(gestaoPasseioUnico == null){
            gestaoPasseioUnico = new GestaoPasseio();
        }
        return gestaoPasseioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadastrarPasseio = new javax.swing.JButton();
        buttonConsultarPasseio = new javax.swing.JButton();
        buttonImprimirPasseio = new javax.swing.JButton();
        buttonSairPasseio = new javax.swing.JButton();
        labelCadastrarPasseio = new javax.swing.JLabel();
        labelConsultarPasseio = new javax.swing.JLabel();
        labelImprimirPasseio = new javax.swing.JLabel();
        labelSairPasseio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestaoPasseio = new javax.swing.JMenu();
        itemCadastrar = new javax.swing.JMenuItem();
        itemConsultar = new javax.swing.JMenuItem();
        itemImprimir = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonCadastrarPasseio.setBackground(new java.awt.Color(51, 51, 255));
        buttonCadastrarPasseio.setText(" ");
        buttonCadastrarPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarPasseioActionPerformed(evt);
            }
        });

        buttonConsultarPasseio.setBackground(new java.awt.Color(51, 51, 255));
        buttonConsultarPasseio.setText(" ");
        buttonConsultarPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarPasseioActionPerformed(evt);
            }
        });

        buttonImprimirPasseio.setBackground(new java.awt.Color(51, 51, 255));
        buttonImprimirPasseio.setText(" ");
        buttonImprimirPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirPasseioActionPerformed(evt);
            }
        });

        buttonSairPasseio.setBackground(new java.awt.Color(255, 51, 51));
        buttonSairPasseio.setText(" ");
        buttonSairPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairPasseioActionPerformed(evt);
            }
        });

        labelCadastrarPasseio.setText("Cadastrar");

        labelConsultarPasseio.setText("Consultar / Excluir pela placa");

        labelImprimirPasseio.setText("Imprimir / Excluir todos");

        labelSairPasseio.setText("Sair");

        menuGestaoPasseio.setText("Gestão Passeio");

        itemCadastrar.setText("Cadastrar");
        itemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarActionPerformed(evt);
            }
        });
        menuGestaoPasseio.add(itemCadastrar);

        itemConsultar.setText("Consultar / Excluir pela placa");
        itemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarActionPerformed(evt);
            }
        });
        menuGestaoPasseio.add(itemConsultar);

        itemImprimir.setText("Imprimir / Excluir todos");
        itemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImprimirActionPerformed(evt);
            }
        });
        menuGestaoPasseio.add(itemImprimir);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuGestaoPasseio.add(itemSair);

        jMenuBar1.add(menuGestaoPasseio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCadastrarPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonConsultarPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonImprimirPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSairPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastrarPasseio)
                    .addComponent(labelConsultarPasseio)
                    .addComponent(labelImprimirPasseio)
                    .addComponent(labelSairPasseio))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarPasseio)
                    .addComponent(labelCadastrarPasseio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConsultarPasseio)
                    .addComponent(labelConsultarPasseio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonImprimirPasseio)
                    .addComponent(labelImprimirPasseio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSairPasseio)
                    .addComponent(labelSairPasseio))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarPasseioActionPerformed
        abreJanCadastrarPasseio();
        ocultaJanGestaoPasseio();
        
    }//GEN-LAST:event_buttonCadastrarPasseioActionPerformed

    public void ocultaJanGestaoPasseio(){
        gestaoPasseioUnico.setVisible(false);
    }
    
    public void abreJanCadastrarPasseio(){
        CadastroDePasseio.criaCadastroDePasseio().setVisible(true);    
    }
    
    private void buttonConsultarPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarPasseioActionPerformed
        abreJanConsultaPasseio();
        ocultaJanGestaoPasseio();
    }//GEN-LAST:event_buttonConsultarPasseioActionPerformed

    public void abreJanConsultaPasseio(){
        ConsultarPasseio.criaConsultaPasseio().setVisible(true);
    }
    
    private void buttonSairPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairPasseioActionPerformed
        sair();
    }//GEN-LAST:event_buttonSairPasseioActionPerformed

    public void sair(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            dispose();
        }
    }
    
    private void buttonImprimirPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirPasseioActionPerformed
        abreJanImprimirPasseio();
        ocultaJanGestaoPasseio();
    }//GEN-LAST:event_buttonImprimirPasseioActionPerformed

    public void abreJanImprimirPasseio(){
        ImprimirPasseio.criaImprimirPasseio().setVisible(true);
    }
    
    private void itemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarActionPerformed
         abreJanCadastrarPasseio();
         ocultaJanGestaoPasseio();
    }//GEN-LAST:event_itemCadastrarActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        sair();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImprimirActionPerformed
        abreJanImprimirPasseio();
        ocultaJanGestaoPasseio();
    }//GEN-LAST:event_itemImprimirActionPerformed

    private void itemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarActionPerformed
        abreJanConsultaPasseio();
        ocultaJanGestaoPasseio();
    }//GEN-LAST:event_itemConsultarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarPasseio;
    private javax.swing.JButton buttonConsultarPasseio;
    private javax.swing.JButton buttonImprimirPasseio;
    private javax.swing.JButton buttonSairPasseio;
    private javax.swing.JMenuItem itemCadastrar;
    private javax.swing.JMenuItem itemConsultar;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCadastrarPasseio;
    private javax.swing.JLabel labelConsultarPasseio;
    private javax.swing.JLabel labelImprimirPasseio;
    private javax.swing.JLabel labelSairPasseio;
    private javax.swing.JMenu menuGestaoPasseio;
    // End of variables declaration//GEN-END:variables
}
