/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Parte1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Examen_Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multa = 0;
        
        multa = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese"
                + " la velocidad para brindarle el monto de la multa"));
        
        if (multa > 100 && multa < 120){
            System.out.println("El valor de la multa es de 10,000 colones.");
        }
        else if (multa > 120 && multa < 150){
            System.out.println("El valor de la multa es de 20,000 colones");
        }
        else if (multa > 150){
            System.out.println("El valor de la multa es de 50,000 colones");
        }
        else {
            System.out.println("No tiene multa.");
        }
    }
}
