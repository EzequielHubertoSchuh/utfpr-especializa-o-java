package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class ConsultarCarga extends javax.swing.JFrame {

    
    private static ConsultarCarga consultarCargaUnico;
    
    private ConsultarCarga() {
        initComponents();
    }
    
    public static ConsultarCarga criaConsultarCarga(){
        if(consultarCargaUnico == null){
            consultarCargaUnico = new ConsultarCarga();
        }
        return consultarCargaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlaca = new javax.swing.JLabel();
        labelCargaMax = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelQtdRodas = new javax.swing.JLabel();
        labelVelocidadeMax = new javax.swing.JLabel();
        labelQtdPistoes = new javax.swing.JLabel();
        labelPotencia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fieldPlaca = new javax.swing.JTextField();
        fieldCargaMax = new javax.swing.JTextField();
        fieldMarca = new javax.swing.JTextField();
        fieldModelo = new javax.swing.JTextField();
        fieldCor = new javax.swing.JTextField();
        fieldQtdRodas = new javax.swing.JTextField();
        fieldVelocidadeMax = new javax.swing.JTextField();
        fieldQtdPistoes = new javax.swing.JTextField();
        fieldPotencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fieldTara = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de carga");

        labelPlaca.setForeground(new java.awt.Color(255, 51, 0));
        labelPlaca.setText("Informe a Placa:");

        labelCargaMax.setText("Carga Máx:");

        labelMarca.setText("Marca:");

        labelModelo.setText("Modelo:");

        labelCor.setText("Cor:");

        labelQtdRodas.setText("Qtd. Rodas:");

        labelVelocidadeMax.setText("Velocidade Máx:");

        labelQtdPistoes.setText("Qtd. Pistões:");

        labelPotencia.setText("Potência:");

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 51));
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fieldCargaMax.setEditable(false);

        fieldMarca.setEditable(false);

        fieldModelo.setEditable(false);

        fieldCor.setEditable(false);

        fieldQtdRodas.setEditable(false);

        fieldVelocidadeMax.setEditable(false);

        fieldQtdPistoes.setEditable(false);

        fieldPotencia.setEditable(false);

        jLabel10.setText("Tara:");

        fieldTara.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(labelCargaMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelQtdRodas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVelocidadeMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelQtdPistoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPotencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(fieldPlaca)
                    .addComponent(fieldCargaMax)
                    .addComponent(fieldMarca)
                    .addComponent(fieldModelo)
                    .addComponent(fieldCor)
                    .addComponent(fieldQtdRodas)
                    .addComponent(fieldVelocidadeMax)
                    .addComponent(fieldQtdPistoes)
                    .addComponent(fieldPotencia)
                    .addComponent(fieldTara))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargaMax)
                    .addComponent(fieldCargaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(fieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(fieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdRodas)
                    .addComponent(fieldQtdRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidadeMax)
                    .addComponent(fieldVelocidadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPistoes)
                    .addComponent(fieldQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPotencia)
                    .addComponent(fieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sair();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void limpar(){
        fieldTara.setText("");
        fieldCargaMax.setText("");
        fieldMarca.setText("");
        fieldModelo.setText("");
        fieldCor.setText("");
        fieldQtdRodas.setText("");
        fieldVelocidadeMax.setText("");
        fieldQtdPistoes.setText("");
        fieldPotencia.setText("");
        fieldPlaca.requestFocus();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Carga carga = new Carga();
        carga = BDVeiculos.consultaCargaPlaca(fieldPlaca.getText());
        limpar();
        if(carga != null){
        fieldTara.setText(String.valueOf(carga.getTara()));
        fieldCargaMax.setText(String.valueOf(carga.getCargaMax()));
        fieldQtdRodas.setText(String.valueOf(carga.getQtdRodas()));
        fieldPotencia.setText(String.valueOf(carga.getMotor().getPotencia()));
        fieldQtdPistoes.setText(String.valueOf(carga.getMotor().getQtdPist()));
        fieldCor.setText(carga.getCor());
        fieldMarca.setText(carga.getMarca());
        fieldModelo.setText(carga.getModelo());
        fieldVelocidadeMax.setText(String.valueOf(carga.getVeloMax()));  
        }else{
            JOptionPane.showMessageDialog(null,"Veiculo de passeio placa: "+fieldPlaca.getText()+" não encontrado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Carga carga = new Carga();
        carga = BDVeiculos.consultaCargaPlaca(fieldPlaca.getText());
        limpar();
        if(carga != null){
            BDVeiculos.getDbCarga().remove(carga);
            JOptionPane.showMessageDialog(null,"Veiculo de carga placa: "+fieldPlaca.getText()+" excluido!");
        }else{
            JOptionPane.showMessageDialog(null,"Veiculo de carga placa: "+fieldPlaca.getText()+" não encontrado!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new ConsultarPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCargaMax;
    private javax.swing.JTextField fieldCor;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldModelo;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JTextField fieldPotencia;
    private javax.swing.JTextField fieldQtdPistoes;
    private javax.swing.JTextField fieldQtdRodas;
    private javax.swing.JTextField fieldTara;
    private javax.swing.JTextField fieldVelocidadeMax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel labelCargaMax;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelVelocidadeMax;
    // End of variables declaration//GEN-END:variables
}
