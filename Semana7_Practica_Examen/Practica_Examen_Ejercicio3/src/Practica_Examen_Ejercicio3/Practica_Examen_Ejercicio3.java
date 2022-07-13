/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_Examen_Ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Practica_Examen_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String var_nombre = JOptionPane.showInputDialog("Ingrese el "
                + "nombre del paciente:");
        
        String var_apellido1 = JOptionPane.showInputDialog("Ingrese el "
                + "primer apelido del paciente:");
        
        String var_apellido2 = JOptionPane.showInputDialog("Ingrese el "
                + "segundo apellido del paciente:");
        
        int var_edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la"
                + " edad del paciente:"));
        
        String var_cedula = JOptionPane.showInputDialog("Ingrese la "
                + "cedula del paciente:");
        
        int var_telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                + " el número de teléfono del paciente:"));
        
        Pacientes paciente1 = new Pacientes(var_nombre, var_apellido1, 
                var_apellido2, var_edad, var_cedula, var_telefono);
        
        JOptionPane.showMessageDialog(null,"El nombre del paciente es: "
                +paciente1.getNombre()+" "+paciente1.getApellido1()+" "
                +paciente1.getApellido2()+".\n"+"Tiene "+paciente1.getEdad()
                +" años.\n"+"El número de cédula es: "+paciente1.getCedula()
                +".\n"+"El número de teléfono es: "+paciente1.getTelefono());
    }
}
