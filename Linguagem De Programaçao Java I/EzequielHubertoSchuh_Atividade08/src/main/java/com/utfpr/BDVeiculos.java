package com.utfpr;

/**
 *
 * @author ezequiel
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDVeiculos {
    
   
    private static List<Passeio> dbPasseio = new ArrayList<Passeio>();
    private static List<Carga> dbCarga = new ArrayList<Carga>();

    public BDVeiculos() {
    }

    public static List<Passeio> getDbPasseio() {
        return dbPasseio;
    }

    public static void setDbPasseio(List<Passeio> dbPasseio) {
        BDVeiculos.dbPasseio = dbPasseio;
    }

    public static List<Carga> getDbCarga() {
        return dbCarga;
    }

    public static void setDbCarga(List<Carga> dbCarga) {
        BDVeiculos.dbCarga = dbCarga;
    }

    public static boolean CadCarga(Carga carga){
        
        if(carga != null){
          dbCarga.add(carga);
          JOptionPane.showMessageDialog(null, "Veiculo de carga cadastrado com sucesso!", "Ok", 1);
          return true;
        }
        return false;
    }
    
    public static boolean CadPasseio(Passeio passeio){
        
        if(passeio != null){ 
          dbPasseio.add(passeio);
          JOptionPane.showMessageDialog(null, "Veiculo de passeio cadastrado com sucesso!", "Ok", 1);
          return true;
        }
        return false;
    }
    
    public static Passeio consultaPasseioPlaca(String placa) {
        for (int i = 0; i < BDVeiculos.dbPasseio.size(); i++) {
            if (BDVeiculos.getDbPasseio().get(i).getPlaca().equals(placa)) {
                return BDVeiculos.getDbPasseio().get(i);
            }
        }
        return null;
    }
    
    public static Carga consultaCargaPlaca(String placa) {
        for (int i = 0; i < BDVeiculos.dbCarga.size(); i++) {
            if (BDVeiculos.getDbCarga().get(i).getPlaca().equals(placa)) {
                return BDVeiculos.getDbCarga().get(i);
            }
        }
        return null;
    }
    
    public static String verificaPlaca(String placa) throws VeicExistException {

        for (int i = 0; i < BDVeiculos.getDbCarga().size(); i++) {
            if (BDVeiculos.getDbCarga().get(i).getPlaca().equals(placa)) {
                throw new VeicExistException();
            }
        }
        for (int i = 0; i < BDVeiculos.getDbPasseio().size(); i++) {
            if (BDVeiculos.getDbPasseio().get(i).getPlaca().equals(placa)) {
                throw new VeicExistException();
            }
        }
        return placa;
    }
    
}
