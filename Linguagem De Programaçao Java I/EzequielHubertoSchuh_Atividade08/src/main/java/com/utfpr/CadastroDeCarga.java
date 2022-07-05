package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class CadastroDeCarga extends javax.swing.JFrame {

    private Carga carga = new Carga();
    
    private static CadastroDeCarga cadastroDeCargaUnico;
    
    private CadastroDeCarga() {
        initComponents();
    }

    public static CadastroDeCarga criaCadastroDeCarga(){
        if(cadastroDeCargaUnico == null){
            cadastroDeCargaUnico = new CadastroDeCarga();
        }
        return cadastroDeCargaUnico;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCargaMax = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelQtdRodas = new javax.swing.JLabel();
        labelVelocidadeMax = new javax.swing.JLabel();
        labelQtdPistoes = new javax.swing.JLabel();
        labelPotencia = new javax.swing.JLabel();
        fieldCargaMax = new javax.swing.JTextField();
        fieldPlaca = new javax.swing.JTextField();
        fieldMarca = new javax.swing.JTextField();
        fieldModelo = new javax.swing.JTextField();
        fieldCor = new javax.swing.JTextField();
        fieldQtdRodas = new javax.swing.JTextField();
        fieldVelocidadeMax = new javax.swing.JTextField();
        fieldQtdPistoes = new javax.swing.JTextField();
        fieldPotencia = new javax.swing.JTextField();
        buttonCadastrar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        labelTara = new javax.swing.JLabel();
        fieldTara = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de carga");

        labelCargaMax.setText("Carga Máx:");

        labelPlaca.setText("Placa:");

        labelMarca.setText("Marca:");

        labelModelo.setText("Modelo:");

        labelCor.setText("Cor:");

        labelQtdRodas.setText("Qtd. Rodas:");

        labelVelocidadeMax.setText("Velocidade Máx:");

        labelQtdPistoes.setText("Qtd. Pistões:");

        labelPotencia.setText("Potência:");

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        labelTara.setText("Tara:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCargaMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelQtdRodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelVelocidadeMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelQtdPistoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelTara, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCadastrar)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSair))
                    .addComponent(fieldTara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(fieldCargaMax)
                    .addComponent(fieldPlaca)
                    .addComponent(fieldMarca)
                    .addComponent(fieldModelo)
                    .addComponent(fieldCor)
                    .addComponent(fieldQtdRodas)
                    .addComponent(fieldVelocidadeMax)
                    .addComponent(fieldQtdPistoes)
                    .addComponent(fieldPotencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTara))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCargaMax)
                    .addComponent(fieldCargaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlaca)
                    .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(fieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(fieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdRodas)
                    .addComponent(fieldQtdRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidadeMax)
                    .addComponent(fieldVelocidadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPistoes)
                    .addComponent(fieldQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPotencia)
                    .addComponent(fieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonLimpar)
                    .addComponent(buttonSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        limpar();
    }//GEN-LAST:event_buttonLimparActionPerformed

    public void limpar(){
        fieldTara.setText("");
        fieldCargaMax.setText("");
        fieldPlaca.setText("");
        fieldMarca.setText("");
        fieldModelo.setText("");
        fieldCor.setText("");
        fieldQtdRodas.setText("");
        fieldVelocidadeMax.setText("");
        fieldQtdPistoes.setText("");
        fieldPotencia.setText("");
        fieldTara.requestFocus();
    }
    
    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
      sair();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        BDVeiculos.CadCarga(inserirCarga());
        limpar();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    public Carga inserirCarga(){
        carga = new Carga();
        
        try {
            carga.setTara(Integer.parseInt(fieldTara.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Tara", "ERRO", 0);
            return null;
        }
        try {
            carga.setCargaMax(Integer.parseInt(fieldCargaMax.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Carga Maxima", "ERRO", 0);
            return null;
        }
        try {
            carga.setPlaca(fieldPlaca.getText());
            BDVeiculos.verificaPlaca(fieldPlaca.getText());
        } catch (VeicExistException vee) {
            limpar();
            return null;
        }
        carga.setMarca(fieldMarca.getText());
        carga.setModelo(fieldModelo.getText());
        carga.setCor(fieldCor.getText());
        try {
            carga.setQtdRodas(Integer.parseInt(fieldQtdRodas.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Qtd. de Rodas", "ERRO", 0);
            return null;
        }
        try {
            carga.setVeloMax(Float.parseFloat(fieldVelocidadeMax.getText()));
        } catch (VelocException ex) {
            try {
                    carga.setVeloMax(100);
                } catch (VelocException e) {
                }
        }
        try {
            carga.getMotor().setQtdPist(Integer.parseInt(fieldQtdPistoes.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido no qtdPist", "ERRO", 0);
            return null;
        }
        try {
            carga.getMotor().setPotencia(Integer.parseInt(fieldPotencia.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Potencia", "ERRO", 0);
            return null;
        }
        
        return carga;
        
    }
    
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
                new CadastroDePasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSair;
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
    private javax.swing.JLabel labelCargaMax;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelTara;
    private javax.swing.JLabel labelVelocidadeMax;
    // End of variables declaration//GEN-END:variables
}
