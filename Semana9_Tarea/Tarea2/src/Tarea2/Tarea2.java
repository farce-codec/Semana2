/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "ingrese la cantidad de filas que tendrá la matriz"));
        
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "ingrese la cantidad de columnas que tendrá la matriz"));
        
        int matriz[][] = new int[fila][columna];
        
        for (int i = 0; i < fila;i++){
            for (int j = 0; j < columna; j++){
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                        + " el siguiente número"));
                matriz[i][j] = valor;
            }
        }
        
        int esquinas = 0;
        
        for (int s = 0; s < fila; s++){
            for (int t = 0; t < columna; t++){
                if (s == 0 && t == 0){
                    esquinas += matriz[s][t];
                }
                else if (s == 0 && t == columna-1){
                    esquinas += matriz[s][t];
                }
                else if (s == fila-1 && t == 0){
                    esquinas += matriz[s][t];
                }
                else if (s == fila-1 && t == columna-1){
                    esquinas += matriz[s][t];
                }
            }
        }
        
        int diagonal = 0;
        
        for (int a = 0; a < fila; a++){
            for (int b = 0; b < columna; b++){
                if(a == b){
                    diagonal += matriz[a][b];
                }
            }
        }
        
        int diagonal_inv = 0;
        
        for (int c = 0; c < fila; c++){
            for (int d = 0; d < columna; d++){
                if (c + d == fila - 1){
                    diagonal_inv += matriz[c][d];
                }
            }
        }
        
        int mayor = 0;
        
        for (int m = 0; m < fila; m++){
            for (int n = 0; n < columna; n++){
                if (matriz[m][n] > mayor){
                    mayor = matriz[m][n];
                }
            }
        }
        
        System.out.println("La suma total de las esquinas es: " + esquinas);
        System.out.println("La suma total de la diagonal es: " + diagonal);
        System.out.println("La suma total de la diagonal inversa es: "
                + "" + diagonal_inv);
        System.out.println("El número mayor ingresado es: " + mayor);
    }
}