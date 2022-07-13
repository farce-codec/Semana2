/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Parte3;

/**
 *
 * @author fabia
 */
public class Estudiantes {
    public String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String cedula;
    private int telefono;
    
    public Estudiantes(){}

    public Estudiantes(String nombre, String apellido1, String apellido2, 
            int edad, String cedula, int telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public int getTelefono() {
        return telefono;
    }
}
