package com.utfpr;



/**
 *
 * @author ezequiel
 */
public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float veloMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo() {
        placa = "";
        marca = "";
        modelo = "";
        cor = "";
        veloMax = 0;
        qtdRodas = 0;
        motor = new Motor();
    }

    public String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public float getVeloMax() {
        return veloMax;
    }

    public final void setVeloMax(float veloMax) throws VelocException {
        if(veloMax < 80 || veloMax > 110){
            throw new VelocException();
        }
        this.veloMax = veloMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
    }

    public abstract void calcVel(float veloMax);

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", veloMax=" + veloMax +
                ", qtdRodas=" + qtdRodas +
                ", motor=" + motor +
                '}';
    }
}

