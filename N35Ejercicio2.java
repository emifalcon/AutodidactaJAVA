/*
Ejericico: Pedir un Numero y calcular su Factorial.
N! = 1*,2*,3*...N 
*/
 
package com.mycompany.n35ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N35Ejercicio2 {

    public static void main(String[] args) {
        
        int num =4 , i ;
        
        i = Integer.parseInt(JOptionPane.showInputDialog("digite el valor de N "));
     
        while(i >1){
        
          i-=1;
        num *=i;
        
      num+=num;
           
           
        
    }
        
          System.out.println("El valor del numero factoiral: "+num);
        
        
        
        
        
        
        
        
        /* for(int uno = 5; uno <=num;uno-=1)
        
        num*=uno ;
        
       
        
        System.out.println("El valoir Factorial del numero: "+num);
        
         num2+=num;
         System.out.println("El valor es: "+num2);*/
    }
}
