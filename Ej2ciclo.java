/*
Pide un numero (que debe estar entre  0 y 10) y mostrar la tabla de multiplicar
de dicho numero.
*/
 

package com.mycompany.ej.ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ej2ciclo {

    public static void main(String[] args) {
        
        int numero , mult ,mult2;
         System.out.println("La Tabla de Multiplicacion : "); 
         numero = Integer.parseInt(JOptionPane.showInputDialog("El numero Pedido: "));
        for(mult = 0 ; mult<=10;mult++){
         
      if(numero>0 || numero<10){
         
         mult2 = mult * numero; 
          
          System.out.println(numero+" * "+mult+" = "+mult2);
          
      
      }
       
        }
       
    }
}
