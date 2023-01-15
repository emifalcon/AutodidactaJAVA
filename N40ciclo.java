/*
Ejericicio: Pedir 10 numeros, y mostrar al final si se ha introducido 
alguno negativo.

*/
 
package com.mycompany.n40ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N40ciclo {

    public static void main(String[] args) {
        
        int num;
        boolean negativo= false ;
        
        for(int i = 1; i<=10;i++){
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            
            if(num<0){
                
                
                negativo = true;
                
            }
            
                
            }
          if(negativo == true){
                
                System.out.println("Exisrte al menos un Numero Negativo. ");
                
                
                
            }else{
                
                System.out.println("No existe un NUmero Negativo. ");  
        }
        
        
        
        
        
        
        
        
      
    }
}
