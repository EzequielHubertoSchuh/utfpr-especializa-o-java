package com.utfpr;



/**
 *
 * @author ezequiel
 */
public final class Passeio extends Veiculo implements Calcular {
    private int qtdPassageiros;

    @Override
    public String toString() {
        return "Passeio{" +
                "qtdPassageiros=" + qtdPassageiros +
                "\nPlaca                          = " + super.getPlaca() +
                "\nMarca                          = " + super.getMarca() +
                "\nModelo                         = " + super.getModelo() +
                "\nCor                            = " + super.getCor() +
                "\nVelocidade maxima              = " + super.getVeloMax() +
                "\nQuantidade de rodas            = " + super.getQtdRodas() +
                "\nQuantidade de pistões do motor = " + super.getMotor().getQtdPist() +
                "\nPotencia do motor              = " + super.getMotor().getPotencia() +
                '}';
    }

    public Passeio() {
        qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public void calcVel(float velocMax) {
        float x = (velocMax*1000);
        System.out.println("\nVelocidade - PASSEIO: "+ x +" M/H");
    }

    @Override
    public int calcular() {

        int somaLetras = 0;

        somaLetras += getCor().length();
        somaLetras += getMarca().length();
        somaLetras += getModelo().length();
        somaLetras += getPlaca().length();

        return somaLetras;
    }

}
