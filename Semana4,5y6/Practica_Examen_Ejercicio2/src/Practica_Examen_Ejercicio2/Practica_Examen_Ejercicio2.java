/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_Examen_Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Practica_Examen_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dibujU = 0;
        
        dibujU = Integer.parseInt(JOptionPane.showInputDialog("¿De qué "
                + "tamaño le gustaría que fuera la letra U?"));
        
        for (int u = 0; u < dibujU; u++){
            if (u == dibujU-1){
               for (int m = 0; m < dibujU; m++){
                   System.out.print("*");
               }
            }
            else{
                for (int i = 0; i < dibujU; i++){
                    if (i == 0){
                        System.out.print("*");
                    }
                    else if (i == dibujU-1){
                        System.out.print("*");
                    }
                    else{
                       System.out.print(" "); 
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}