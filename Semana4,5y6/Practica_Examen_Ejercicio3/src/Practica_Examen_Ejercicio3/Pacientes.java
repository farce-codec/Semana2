/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_Ejercicio3;

/**
 *
 * @author fabia
 */
public class Pacientes {
    public String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String cedula;
    private int Telefono;
    
    public Pacientes(){}

    public Pacientes(String nombre, String apellido1, String apellido2, int edad, 
            String cedula, int Telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.cedula = cedula;
        this.Telefono = Telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
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
        return Telefono;
    }
    
    public void Atributos (){
        System.out.println(this.nombre+" "+this.apellido1+" "+this.apellido2+" "+
                this.edad+" "+this.cedula+" "+this.Telefono);
    }
}
