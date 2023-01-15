/* Leer un numero e indicar si es positivo o negativo. Se repetira hasta que el numero
se poner: 0.
*/
 

package com.mycompany.ejercicio2n30;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ejercicio2n30 {

    public static void main(String[] args) {
        
        
        int numero ;
        char tipo;
       
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "));
       
        do{
            
            
            JOptionPane.showMessageDialog(null, "¿El numero es Positivo o Negativo? ");
           tipo = JOptionPane.showInputDialog("El tipo de numero: ").charAt(0);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "));
            
        }while(numero >0 || numero< 0);
        
        
        
        
      /* while(0< numero o numero> 0){
           
           JOptionPane.showInputDialog("¿El numero es Positivo o Negativo? "+tipo);
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "));
       }*/ 
            
            
          
        
        
        
        
     
    }
}
