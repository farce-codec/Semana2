/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_Examen_Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Practica_Examen_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tipo_tiquete = 0;
        
        JOptionPane.showMessageDialog(null, "A continuación ofrecemos las "
                + "siguientes categorías:");
        
        JOptionPane.showMessageDialog(null, "1. Categoría Alta\n"
                + "2. Categoría Media\n3. Categoría Baja");
        
        tipo_tiquete = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "indique ¿cuál categoría le gustaría consultar?"));
        
        if (tipo_tiquete == 1){
            JOptionPane.showMessageDialog(null, "La categoría alta ofrece "
                    + "asientos al frente del escenario y con posibilidad "
                    + "de ir a una sala VIP");
        }
        else if (tipo_tiquete == 2){
            JOptionPane.showMessageDialog(null, "La categoría media ofrece "
                    + "asientos a una distancia media del escenario.");
        }
        else if (tipo_tiquete == 3){
            JOptionPane.showMessageDialog(null, "La categoría baja ofrece "
                    + "asientos a una distance considerable y ángulos de "
                    + "visión incómodos.");
        }
    }
    
}
