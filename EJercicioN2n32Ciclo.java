/*/Pedir un numero hasta que se teclee 0, mostrar la suma de todos los numeros 
 introducidos.
 */

package com.mycompany.ejercicion2n32ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class EJercicioN2n32Ciclo {

    public static void main(String[] args) {
        
        
        int num, cont = 0;
        
        
        
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));    
            
            cont= cont + num;
            
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null, "La suma total de numeros introducidos: "+cont);
        
        
        
    }
}
