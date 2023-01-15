/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.n28bucledowhile;

import java.util.Scanner;

/**
 *Ciclo do while
 do{
   Instrucciones; se va a ejecutar las instrucciones y luego...
   }while(condicion);se comprueba si la condicion es verdadera.
 
 */
public class N28BUCLEdowhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i= 1,contador; //cumple una sola vez, es decir, que ejecuta solo una vez sin verificar la condicion-
        System.out.print("Digite la cantidad de numeros que desea: ");
        contador = entrada.nextInt();
        
        do{
            System.out.println(i);
            
           i+=3; //++
            
            
        }while(i<=contador);//i<=10
        
        
        
        
        
        
        
    }
}
