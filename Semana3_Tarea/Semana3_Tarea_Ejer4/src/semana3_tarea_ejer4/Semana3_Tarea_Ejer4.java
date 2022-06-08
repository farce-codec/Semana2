/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3_tarea_ejer4;

/**
 *
 * @author fabia
 */
public class Semana3_Tarea_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Desarrolle un programa que le muestre al usuario los valores
        // entre 20 y 30 (inclusive) y su correspondiente valor al cuadrado.
        
        for (int i = 20; i<=30; i++){
            System.out.println("El valor de " + i + " al cuadrado es: " 
                    + (int) Math.pow(i, 2));
        }
    }
    
}
