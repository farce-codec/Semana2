/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana45y6;

/**
 *
 * @author fabia
 */
public class Persona {
    public String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String cedula;
    private Direccion direccion;
    
    public Persona(){}

    public Persona(String nombre, String apellido1, String apellido2, int edad, 
            String cedula, Direccion direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }
    
    public String MiNombreEs(){
        return this.nombre + " " + this.apellido1 + " " + this.apellido2;
    }
    
    public void NuevaDireccion(String NuevaDireccionSoñada){
        System.out.println("Me quiero ir a vivir a: "+NuevaDireccionSoñada);
    }
}
