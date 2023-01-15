/*
ejercicio: Dadas 6 notas, escribir la cantidad de alumnos aprobados,condicionados (=4)
y suspensos.
*/
 

package com.mycompany.n39ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N39Ciclo {

    public static void main(String[] args) {
        
        float nota;
        int aprob = 0, susp = 0 , cond = 0;
        
        for(int i=1;i<=6;i++){
            
            do{
                
               nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota entre 0-10:"));
                
                
                
            }while(nota<0 ||nota>10);
            
            if(nota == 4){
                cond++;
                
                
            } else if(nota>=5){
                
                aprob++;
                
            }else{
                
                susp++;
                
                
            }
           
        }
        
         System.out.println("La Cantidad de Aprob "+aprob);
            System.out.println("La cantidad de Condicionales "+cond);
            System.out.println("Cantidad de Suspendidos "+susp);
        
        
        
        
        
        
        
        
       
    }
}
