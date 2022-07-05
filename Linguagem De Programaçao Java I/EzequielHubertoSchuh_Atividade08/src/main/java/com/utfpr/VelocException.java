package com.utfpr;



import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ezequiel
 */
public class VelocException extends IOException {
    public VelocException() {
        JOptionPane.showMessageDialog(null,"A velocidade máxima está fora dos limites brasileiros." , "ERRO",  JOptionPane.ERROR_MESSAGE);
    }
}
