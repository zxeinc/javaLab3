
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class valueException extends Exception{

    public valueException(String str) {
        JOptionPane.showMessageDialog(null, "value is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
