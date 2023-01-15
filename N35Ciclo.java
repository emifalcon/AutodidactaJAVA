/*
ejericio: Diseñar un programa que muestre el producto los 10 primeros numeros ImPares
*/
 

package com.mycompany.n35ciclo;

/**
 *
 * @author usuario
 */
public class N35Ciclo {

    public static void main(String[] args) {
        
        long producto = 1;
        
        // long: tipo entero pero con mas numeros.
        
        for(int i = 1; i<=20; i+=2)
        
        producto *= i;
        
        
        
        
        
        System.out.print("El producto de los N impares son: "+producto);
    }
}
