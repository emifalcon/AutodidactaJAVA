/* Ciclo for
for (inicializacion; condicion; aumento o decremento ){
   Intrucciones;
}
*/
 

package com.mycompany.n29ciclofor;

import java.util.Scanner;

/**Una de las diferencias con los otros 2 ciclos while ,es que se puede indicar
 *la inicializacion dentro de for()
 * @author usuario
 */
public class N29CicloFor {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
          int contador;
          
        System.out.print("Digite los terminos:"); 
        contador = entrada.nextInt();

        
        
                
        for(int i=2/*inicializacion*/; i<=contador/*condicion*/; i+=2/*aum o Decremento*/ ){
          System.out.println(i);
                  
            /*
          for(int i=1 inicializacion; i<=10 condicion; i++/aum o Decremento ){
          System.out.println(i);
          */
            
        }
        
        
        
        
        
        
    }
}
