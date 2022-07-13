/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Parte3;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Examen_Parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var_nombre = JOptionPane.showInputDialog("Ingrese el nombre del "
                + "estudiante:");
        
        String var_apellido1 = JOptionPane.showInputDialog("Ingrese el primer "
                + "apellido del estudiante:");
        
        String var_apellido2 = JOptionPane.showInputDialog("Ingrese el segundo "
                + "apellido del estudiante:");
        
        int var_edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la"
                + " edad del estudiante"));
        
        String var_cedula = JOptionPane.showInputDialog("Ingrese la "
                + "cédula del estudiante:");
        
        int var_telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                + " el número de teléfono del estudiante:"));
        
        Estudiantes estudiante1 = new Estudiantes(var_nombre, var_apellido1, 
                var_apellido2, var_edad, var_cedula, var_telefono);
        
        System.out.println("El nombre del estudiante es: " + 
                estudiante1.getNombre() + " " + estudiante1.getApellido1() + 
                " " + estudiante1.getApellido2() + ".\n" + 
                "Tiene " + estudiante1.getEdad() + " años.\n" +
                "El número de cédula es: " + estudiante1.getCedula() + ".\n" +
                "El número de teléfono es: " + estudiante1.getTelefono() + ".\n");
    }
}
