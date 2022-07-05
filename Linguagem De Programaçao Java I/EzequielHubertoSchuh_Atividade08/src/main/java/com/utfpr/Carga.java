package com.utfpr;



/**
 *
 * @author ezequiel
 */
public final class Carga extends Veiculo implements Calcular{
    private int cargaMax;
    private int tara;

    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public Carga() {
        cargaMax = 0;
        tara = 0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public void calcVel(float velocMax) {
        float x = (velocMax*10000);
        System.out.println("\nVelocidade - CARGA: "+ x +" CM/H");
    }

    @Override
    public int calcular() {

        int somaNum = 0;

        somaNum += getMotor().getQtdPist();
        somaNum += getMotor().getPotencia();
        somaNum += getQtdRodas();
        somaNum += getVeloMax();
        somaNum += getTara();
        somaNum += getCargaMax();

        return somaNum;
    }
}
