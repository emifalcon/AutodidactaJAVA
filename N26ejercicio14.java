/*ejercicio 14: Hacer un programa que pase de kg a otra unidad de masa, 
mostrar en la pantalla un menu con las opciones posibles.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.n26ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N26ejercicio14 {

    public static void main(String[] args) {
        int parse1;
       final int kg = 5;
           float miligramo , equiv, tonelada , nanogramo, equiv2, equiv3 ;
        parse1 = Integer.parseInt(JOptionPane.showInputDialog("convertidor de unidades de Masa: "
                +"1. para pasar a miligramo/n"+
                "2. para pasar a tonelada/n"+
                "3. para pasar a nanogramo/n"));
       
        switch (parse1) {
            
            case 1: miligramo = Float.parseFloat(JOptionPane.showInputDialog("digite el equivalente de miligramo"));
                 
                equiv = kg * miligramo;
                 
                JOptionPane.showInternalMessageDialog(null, "el miligramo es: "+equiv);
                break;
            case 2: tonelada = miligramo = Float.parseFloat(JOptionPane.showInputDialog("digite el equivalente A TONELADA"));
                
               equiv2 = kg / tonelada ;
               JOptionPane.showInternalMessageDialog(null, "la tonelada es: "+equiv2);
               break;
            case 3 : nanogramo = miligramo = Float.parseFloat(JOptionPane.showInputDialog("digite el equivalente a nanogramo"));
                
               equiv3 = kg * nanogramo ;
               
               JOptionPane.showMessageDialog(null, "El nanogramo es : "+equiv3);
               
               break;
            default : JOptionPane.showMessageDialog(null, "Eleccion de equivalencia en masa erronea");
        }
                
        
        
        
        
       
    }
}
