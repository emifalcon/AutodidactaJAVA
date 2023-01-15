/*
Una empresa que se dedica a la venta de desinfectantes necesita un progrma para gestionar las facturas.
En cada factura figura: el Codigo del articulo, la cantidad vendida en litros y el precio
por litro.
- Se pide de 5 facturas introducidas: Facturacion Total, cant en litros vendidos
del articulo 1 y cuantas facturas se emitieron de mas de $600.
*/
 

package com.mycompany.n38cicloo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class N38Cicloo {

    public static void main(String[] args) {
        
        int codigo, Clitros, litrosA1 = 0, fm600 = 0;
        float Preciol, facturaTotal = 0 , Importef;
        for(int i = 1;i<=5;i++){
        codigo = Integer.parseInt(JOptionPane.showInputDialog("El articulo"+i+"Digite el codigo "));
        Clitros = Integer.parseInt(JOptionPane.showInputDialog("El articulo"+i+"Digite la cant V. litros "));
        Preciol = Float.parseFloat(JOptionPane.showInputDialog("El articulo"+i+"Digite el precio por litro "));
       
        Importef = Clitros *  Preciol ; // importe por factura
        
        facturaTotal +=  Importef; //Suma total de las facturas.
        
        if(codigo == 1){
            litrosA1 += Clitros; 
            
        }
        if(Importef>600){
        
            fm600 ++; 
        }
        
        
        }
        
        System.out.println("Resumen de Facturacion: ");
        System.out.println("facturacion total"+facturaTotal);
        System.out.println("cantidad de litros v en el A1: $"+litrosA1);
        
      System.out.println("Cantidad de facturas de mas de $600 : "+fm600);
    }
}
