/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Parte2;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Examen_Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dibujarT = 0;
        
        dibujarT = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "ingrese el tamaño que gusta para imprimir la letra T.\n"
                + "Tome en cuenta que debe ingresar un número impar."));
        
        while (dibujarT % 2 == 0 || dibujarT < 3){
            if (dibujarT < 3){
                System.out.println("El número ingresado es menor a 3.\n"
                    + "Por favor ingrese un número impar mayor o igual a 3.\n");
                dibujarT = Integer.parseInt(JOptionPane.showInputDialog("Por "
                        + "favor ingrese el tamaño que gusta para imprimir la "
                        + "letra T.\n"
                        + "Tome en cuenta que debe ingresar un número impar.\n")); 
            }
            else {
                System.out.println("El número ingresado es un número par.\n"
                    + "Por favor intente nuevamente.\n");
                dibujarT = Integer.parseInt(JOptionPane.showInputDialog("Por "
                        + "favor ingrese el tamaño que gusta para imprimir la "
                        + "letra T.\n"
                        + "Tome en cuenta que debe ingresar un número impar.\n"));  
            }
        }
        
        int newT = dibujarT * 2;
        
        for (int i = 1; i <= newT; i++){
            if (i % 2 != 0){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        for (int j = 1; j < dibujarT; j++){
            for (int m = 1; m <= newT; m++){
                if (m == newT/2){
                    System.out.print("*");
                    break;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}