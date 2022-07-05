package com.utfpr;


import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    //private Carga carga = new Carga();
    //private Passeio passeio = new Passeio();
    //private DBVeiculos dBVeiculos = new DBVeiculos();
    
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonPasseio = new javax.swing.JButton();
        JButtonCarga = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuIniciar = new javax.swing.JMenu();
        itemGestaoPasseio = new javax.swing.JMenuItem();
        itemGestaoCarga = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        JButtonPasseio.setBackground(new java.awt.Color(51, 153, 255));
        JButtonPasseio.setText("Passeio");
        JButtonPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPasseioActionPerformed(evt);
            }
        });

        JButtonCarga.setBackground(new java.awt.Color(51, 255, 51));
        JButtonCarga.setText("Carga");
        JButtonCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCargaActionPerformed(evt);
            }
        });

        menuIniciar.setText("Iniciar");

        itemGestaoPasseio.setText("Gestao de passeio");
        itemGestaoPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestaoPasseioActionPerformed(evt);
            }
        });
        menuIniciar.add(itemGestaoPasseio);

        itemGestaoCarga.setText("Gestao de carga");
        itemGestaoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestaoCargaActionPerformed(evt);
            }
        });
        menuIniciar.add(itemGestaoCarga);
        menuIniciar.add(jSeparator1);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuIniciar.add(itemSair);

        jMenuBar1.add(menuIniciar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButtonPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(JButtonPasseio)
                .addGap(32, 32, 32)
                .addComponent(JButtonCarga)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPasseioActionPerformed
        abreJanGerenciaPasseio();
        
    }//GEN-LAST:event_JButtonPasseioActionPerformed

    public void abreJanGerenciaPasseio() {
        GestaoPasseio.criaGestaoPasseio().setVisible(true);
    }

    private void JButtonCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCargaActionPerformed
        abreJanGerenciaCarga();
    }//GEN-LAST:event_JButtonCargaActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        sair();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemGestaoPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestaoPasseioActionPerformed
        abreJanGerenciaPasseio();
    }//GEN-LAST:event_itemGestaoPasseioActionPerformed

    private void itemGestaoCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestaoCargaActionPerformed
        abreJanGerenciaCarga();
    }//GEN-LAST:event_itemGestaoCargaActionPerformed

    public void sair(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            dispose();
        }
    }
    
    public void abreJanGerenciaCarga() {
        GestaoCarga.criaGestaoCarga().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCarga;
    private javax.swing.JButton JButtonPasseio;
    private javax.swing.JMenuItem itemGestaoCarga;
    private javax.swing.JMenuItem itemGestaoPasseio;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuIniciar;
    // End of variables declaration//GEN-END:variables
}
