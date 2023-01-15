/*
Ejericio2: Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo.


*/

package com.mycompany.n39cicloejer2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N39Cicloejer2 {

    public static void main(String[] args) {
        int N;
        float Sueldo , Sueldo3, Sueldo2;
        
       
        
        for(int i =0;i<=4;i++){
             N = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero "));
          if(N== 1 || N ==2 || N == 3){
              
              Sueldo = 1500;
              
              
              
          }  else if(N == 4 || N == 5 | N == 6){
              
             Sueldo2 = 2500;
              System.out.println("El sueldo maximo es: "+Sueldo2);
              
          }else if(N== 7 || N == 8 || N == 9 || N  == 10){
              
               Sueldo3 = 1790;
              
          }else{
              
              System.out.println("No existe ese valor Numerico: ");
          }
        
             
            
            
        }
        
        
        
       
    }
}
