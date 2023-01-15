/*
ejercicioN13: pEDIR 10 NUMEROS. mOSTRAR LA MEDIA DE LOS NUMEROS pOSITIVOS,
LA MEDIA DE LOS NUMEROS nEGATIVOS Y LA CANTIDAD DE Ceros.


*/
 

package com.mycompany.n36ejciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N36ejCiclo {

    public static void main(String[] args) {
        
        
        
        int  sumaP = 0 ,conts = 0 , restan = 0 , contn =  0, cantC = 0, num  ;
        float mediap , median;
        for(int i= 1; i<=10;i++ ){
     
      num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        
         if (num == 0 ){
            
            cantC++; // aumento en 1 cada vez que se seleccione en 0
               
            
        }
        else if (num>0){
            
            
            sumaP+=num;
            
            conts++; // se cuenta uno mas al conteo para sacar la media de los N positivos
            
            
        }
        else{//El numero es Negativo
            
            restan+=num;
            
            contn++;
            
        }
         
        }
        if(conts == 0){
            System.out.println("No se puede sacar la Media P.");
            
        } else{
                    
                    
                  mediap = (float)sumaP/conts;  
                     System.out.println("La media de los numeros P: "+mediap); 
                  
                    
                    } 
        
            if(contn == 0){
                
                System.out.println("No se puede sacar la M edi a de los N egativos.");        
                
                
                
                
            }
            else{
                
                median = (float)restan/contn;
                System.out.println("La media de los Negativos es: "+median);
                
                
            }
            
            System.out.println("La cantidad de ceros es: "+cantC);
        }
        
        
        
        
        
        
        
}   

