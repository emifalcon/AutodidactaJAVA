/*
Pedir 5 calificaciones de alumnos y decir al final si hay algun Suspenso.



*/


package com.mycompany.n40ejercicion2ciclofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N40ejercicion2Ciclofinal {

    public static void main(String[] args) {
        
        int num;
        
        boolean suspenso = false ;
        
        
        
        
        for(int i=1;i<=10;i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(num<=5){
                 
           
                suspenso = true;
                
            } 
           
            
        }
        
         if(suspenso == true){
                
                
                System.out.println("Existe alguien en suspension. ");
                
            }else{
                
                System.out.println("No hay suspendidos entre los Alumnos. ");
                
                
                
            }
        
       
    }
}
