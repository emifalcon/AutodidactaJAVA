/*/pedir un numero N, y mostrar todos los numeros del 1 al N.
 
 */

package com.mycompany.ej2n33ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ej2N33Ciclo {

    public static void main(String[] args) {
        int N, Uno = 1;
        
     
        
        do{
            
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));   
           
            
            
            
            
            N = 0+ N;
            if(N>Uno){
                
            
            System.out.println(Uno+" al "+N);
            }
            else{
                System.out.println("Termino");
            }
            
        }while(N !=Uno);
        
        
       // System.out.println("Los numeros ingresados son del: "+Uno+" al "+N);
      
    }
}
