package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class ConsultarPasseio extends javax.swing.JFrame {

   private static ConsultarPasseio consultarPasseioUnico;
    
    ConsultarPasseio() {
        initComponents();
    }
    
    public static ConsultarPasseio criaConsultaPasseio(){
        if(consultarPasseioUnico == null){
            consultarPasseioUnico = new ConsultarPasseio();
        }
        return consultarPasseioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlaca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fieldPlaca = new javax.swing.JTextField();
        fieldQtdPassageiros = new javax.swing.JTextField();
        fieldMarca = new javax.swing.JTextField();
        fieldModelo = new javax.swing.JTextField();
        fieldCor = new javax.swing.JTextField();
        fieldQtdRodas = new javax.swing.JTextField();
        fieldVelocidadeMax = new javax.swing.JTextField();
        fieldQtdPistoes = new javax.swing.JTextField();
        fieldPotencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de passeio");

        labelPlaca.setForeground(new java.awt.Color(255, 51, 0));
        labelPlaca.setText("Informe a Placa:");

        jLabel2.setText("Qtd. Passageiros:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Cor:");

        jLabel6.setText("Qtd. Rodas:");

        jLabel7.setText("Velocidade Máx:");

        jLabel8.setText("Qtd. Pistões:");

        jLabel9.setText("Potência:");

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 51));
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

        fieldQtdPassageiros.setEditable(false);

        fieldMarca.setEditable(false);

        fieldModelo.setEditable(false);

        fieldCor.setEditable(false);

        fieldQtdRodas.setEditable(false);

        fieldVelocidadeMax.setEditable(false);

        fieldQtdPistoes.setEditable(false);

        fieldPotencia.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(fieldPlaca)
                    .addComponent(fieldQtdPassageiros)
                    .addComponent(fieldMarca)
                    .addComponent(fieldModelo)
                    .addComponent(fieldCor)
                    .addComponent(fieldQtdRodas)
                    .addComponent(fieldVelocidadeMax)
                    .addComponent(fieldQtdPistoes)
                    .addComponent(fieldPotencia))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldQtdPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldQtdRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldVelocidadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Passeio passeio = new Passeio();
        passeio = BDVeiculos.consultaPasseioPlaca(fieldPlaca.getText());
        limpar();
        if(passeio != null){
        fieldQtdPassageiros.setText(String.valueOf(passeio.getQtdPassageiros()));
        fieldQtdRodas.setText(String.valueOf(passeio.getQtdRodas()));
        fieldPotencia.setText(String.valueOf(passeio.getMotor().getPotencia()));
        fieldQtdPistoes.setText(String.valueOf(passeio.getMotor().getQtdPist()));
        fieldCor.setText(passeio.getCor());
        fieldMarca.setText(passeio.getMarca());
        fieldModelo.setText(passeio.getModelo());
        fieldVelocidadeMax.setText(String.valueOf(passeio.getVeloMax()));  
        }else{
            JOptionPane.showMessageDialog(null,"Veiculo de passeio placa: "+fieldPlaca.getText()+" não encontrado!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Passeio passeio = new Passeio();
        passeio = BDVeiculos.consultaPasseioPlaca(fieldPlaca.getText());
        limpar();
        if(passeio != null){
            BDVeiculos.getDbPasseio().remove(passeio);
            JOptionPane.showMessageDialog(null,"Veiculo de passeio placa: "+fieldPlaca.getText()+" excluido!");
        }else{
            JOptionPane.showMessageDialog(null,"Veiculo de passeio placa: "+fieldPlaca.getText()+" não encontrado!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  
    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do Sistema", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            GestaoPasseio.criaGestaoPasseio().setVisible(true);
            dispose();
        }
    }

    public void limpar(){
        fieldQtdPassageiros.setText("");
        fieldMarca.setText("");
        fieldModelo.setText("");
        fieldCor.setText("");
        fieldQtdRodas.setText("");
        fieldVelocidadeMax.setText("");
        fieldQtdPistoes.setText("");
        fieldPotencia.setText("");
        fieldPlaca.requestFocus();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCor;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldModelo;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JTextField fieldPotencia;
    private javax.swing.JTextField fieldQtdPassageiros;
    private javax.swing.JTextField fieldQtdPistoes;
    private javax.swing.JTextField fieldQtdRodas;
    private javax.swing.JTextField fieldVelocidadeMax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelPlaca;
    // End of variables declaration//GEN-END:variables
}
