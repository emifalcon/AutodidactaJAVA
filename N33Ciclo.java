/*/Pedir numeros hasta que introduzca uno negativo y calcular la Media
 
 */

package com.mycompany.n33ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N33Ciclo {

    public static void main(String[] args) {
        
        int num,elementos=0,suma=0;
           float media;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero; "));
        while(num>=0){
            
            
            suma += num; // Suma interactiva
            elementos++;// aumentamos uno a elementos
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero; "));
            
        }
        
        if(elementos==0){
            System.out.println("Error!,No existe la division entre 0");
            
            
        }
        else{
            
           media = (float)suma/elementos; 
            System.out.println("La Media es: "+media);
        }
    }
}
