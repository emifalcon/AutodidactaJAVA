/*Ciclo while = Se repite una condicion siempre y cuando se cumpla la condicion
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciclosn27while;

import java.util.Scanner;

/* while(condicion) 
  instroducciones;
 
 
 */
public class Ciclosn27while {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in); //guardar la entrada de datos
       int i= 0 ,contador;
        
        System.out.print("Digite cuantos numeros quieres en la consola; ");
        contador = entrada.nextInt(); //Guardar:cuantos numeros quiere el usuario en el contador.
        
        while(i<=contador){
            
            System.out.print(i);
            i+= 2; //+= es para que empiece en 2 en 2 iniciando desde el valor i=1 
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int i= 10;
        //DE manera desendente, desde 10 a 1.
        while(i>=1){
            
            System.out.println(i); 
        i--;
            
            
        }*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* int i = 1;
        
        while(i<=10){ // como 10 es menor o igual a i entonces:
            
        // se imprime la i:
        System.out.println(i); // 1, 2,...10
        i++;// aumenta mas(+) 1.
        }*/
    }
}
