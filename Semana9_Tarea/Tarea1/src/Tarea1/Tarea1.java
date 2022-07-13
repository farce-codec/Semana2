/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int vendedores[] = new int[5];
        
        for (int i = 0; i < vendedores.length; i++){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea "
                    + "ingresar una venta para el empleado #" + (i+1) + "\n"
                            + "1. Si\n"
                            + "2. No"));
            
            if (opcion == 1){
                boolean flag = true;
                
                while (flag == true){
                    int venta = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "Por favor ingrese el monto de la venta"));
                    vendedores[i] += venta;
                    
                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("¿Desea "
                    + "ingresar una venta para el empleado #" + (i+1) + "\n "
                            + "1. Si\n"
                            + "2. No"));
                    
                    if (opcion2 == 1){
                        continue;
                    }
                    else if(opcion2 == 2){
                        flag = false;
                    }
                }
            } 
            else if (opcion == 2){
                System.out.println("A continuación pasará al siguiente empleado");
            }
        }
        
        for (int j = 0; j < vendedores.length; j++){
            System.out.println("El monto total del vendedor #" + (j + 1) + 
                    " es: " + vendedores[j]);
        }
    }
}
