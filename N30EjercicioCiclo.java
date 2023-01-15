/*Ejecicio 1 : leer un numero y mostrar su cuadrado, repetir el proceso hasta 
que se introduzca un Numero Negativo.

*/ 

package com.mycompany.n30ejerciciociclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N30EjercicioCiclo {

    public static void main(String[] args) {
        
        int numero,cuadrado; //cambiamos al tipo double para sacar el cuadrado o
        //colocamos (int)
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        
       while(numero>=0){ //mientra el numero sea 0 o +
        cuadrado = (int)Math.pow(numero, 2);
        
        JOptionPane.showInternalMessageDialog(null, "El numero "+numero+" elevado al cuadrado : "+cuadrado);
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    }
       JOptionPane.showInternalMessageDialog(null, "Error numero negativo ");
    }
}
