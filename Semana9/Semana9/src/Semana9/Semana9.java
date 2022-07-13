/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana9;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Semana9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ARREGLOS UNIDIMENSIONALES
//        
//        int total_notas = 0;
//        
//        int cant_estudiantes = Integer.parseInt(JOptionPane.showInputDialog(""
//                + "Ingrese la cantidad de estudiantes a evaluar:"));
//        
//        int notas[] = new int[cant_estudiantes];
//        
//        for (int i = 0; i < notas.length; i++){
//            int nueva_nota = Integer.parseInt(JOptionPane.showInputDialog(""
//                    + "Ingrese la nota del estudiante #" + (i+1)));
//            notas[i] = nueva_nota;
//            
//            total_notas += nueva_nota;
//        }
//        
//        System.out.println("El promedio de las notas ingresadas es de: " 
//                + total_notas / cant_estudiantes);

//****************************************************************************

//        ARREGLOS BIDIMENSIONALES
        int n = 0;

        int juego[][] = new int[6][6];
        
        for (int m = 0; m < 6; m++){
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                    + "la fila que desea colocar la nave #" + (n+1)));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                    + "la columna que desea colocar la nave #" + (n+1)));
            
            juego[fila-1][columna-1] = 1;
            
            n++;
            
        }
        
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (juego[i][j] == 1){
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" O "); 
                }
            }
            System.out.println();
        }
    }
}