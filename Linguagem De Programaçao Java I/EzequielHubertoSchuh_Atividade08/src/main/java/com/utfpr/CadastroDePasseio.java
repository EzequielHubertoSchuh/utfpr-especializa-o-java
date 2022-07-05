package com.utfpr;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class CadastroDePasseio extends javax.swing.JFrame {
    
    private Passeio passeio = new Passeio();

    private static CadastroDePasseio cadastroDePasseioUnico;
            
    CadastroDePasseio() {
        initComponents();
    }
    
    public static CadastroDePasseio criaCadastroDePasseio(){
        if(cadastroDePasseioUnico == null){
            cadastroDePasseioUnico = new CadastroDePasseio();
        }
        return cadastroDePasseioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelQtdPassageiros = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelQtdRodas = new javax.swing.JLabel();
        labelVelocidadeMax = new javax.swing.JLabel();
        labelQtdPistoes = new javax.swing.JLabel();
        labelPotencia = new javax.swing.JLabel();
        fieldQtdPassageiros = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de passeio");

        labelQtdPassageiros.setText("Qtd. Passageiros:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelQtdPassageiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelQtdRodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelVelocidadeMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelQtdPistoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCadastrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonLimpar)
                        .addGap(53, 53, 53)
                        .addComponent(buttonSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldQtdPassageiros)
                        .addComponent(fieldPlaca)
                        .addComponent(fieldMarca)
                        .addComponent(fieldModelo)
                        .addComponent(fieldCor)
                        .addComponent(fieldQtdRodas)
                        .addComponent(fieldVelocidadeMax)
                        .addComponent(fieldQtdPistoes)
                        .addComponent(fieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelQtdPassageiros)
                    .addComponent(fieldQtdPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
         fieldQtdPassageiros.setText("");
        fieldPlaca.setText("");
        fieldMarca.setText("");
        fieldModelo.setText("");
        fieldCor.setText("");
        fieldQtdRodas.setText("");
        fieldVelocidadeMax.setText("");
        fieldQtdPistoes.setText("");
        fieldPotencia.setText("");
        fieldQtdPassageiros.requestFocus();
    }
    
    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        sair();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        BDVeiculos.CadPasseio(inserirPasseio());
        limpar();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

     public Passeio inserirPasseio(){
        passeio = new Passeio();
        
        
        try {
            passeio.setQtdPassageiros(Integer.parseInt(fieldQtdPassageiros.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Qtd. de Passageiros", "ERRO", 0);
            return null;
        }
        try {
            passeio.setPlaca(fieldPlaca.getText());
            BDVeiculos.verificaPlaca(fieldPlaca.getText());
        } catch (VeicExistException vee) {
            limpar();
            return null;
        }
        passeio.setMarca(fieldMarca.getText());
        passeio.setModelo(fieldModelo.getText());
        passeio.setCor(fieldCor.getText());
        try {
            passeio.setQtdRodas(Integer.parseInt(fieldQtdRodas.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Qtd. de Rodas", "ERRO", 0);
            return null;
        }
        try {
            passeio.setVeloMax(Float.parseFloat(fieldVelocidadeMax.getText()));
        } catch (VelocException ex) {
            try {
                    passeio.setVeloMax(100);
                } catch (VelocException e) {
                }
        }
        try {
            passeio.getMotor().setQtdPist(Integer.parseInt(fieldQtdPistoes.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Qtd. de Pistoes", "ERRO", 0);
            return null;
        }
        try {
            passeio.getMotor().setPotencia(Integer.parseInt(fieldPotencia.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido na Potencia", "ERRO", 0);
            return null;
        }
        
        return passeio;
    }
    
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
                new CadastroDePasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JTextField fieldCor;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldModelo;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JTextField fieldPotencia;
    private javax.swing.JTextField fieldQtdPassageiros;
    private javax.swing.JTextField fieldQtdPistoes;
    private javax.swing.JTextField fieldQtdRodas;
    private javax.swing.JTextField fieldVelocidadeMax;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPassageiros;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelVelocidadeMax;
    // End of variables declaration//GEN-END:variables
}
