package com.utfpr;



import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author ezequiel
 */

public class VeicExistException extends IOException {
    public VeicExistException() {
        JOptionPane.showMessageDialog(null,"Já existe um veículo com essa placa cadastrado." , "ERRO",  JOptionPane.ERROR_MESSAGE);
    }
}

