/*Ejercicio 3 : leer numeros hasta que se introduzca 0. Indicar si es Par o impar.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.n31ciclospareseimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N31ciclosPareseImpar {

    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        
        while(numero != 0){
            
            if(numero %2 == 0){//Si numero es Par
                System.out.println("El numero "+numero+" es Par");
                
                
                
                
            }
            else{
                
                System.out.println("El numero "+numero+"Es impar");
                 
                
            }
            
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
            
            
            
        }
        
        
        
        
        
        
       
    }
}
