/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_Ejercicio3;

/**
 *
 * @author fabia
 */
public class Doctores {
    public String nombre;
    public int horario;
    private String cedula;
    
    public Doctores(){}

    public Doctores(String nombre, int horario, String cedula) {
        this.nombre = nombre;
        this.horario = horario;
        this.cedula = cedula;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorario() {
        return horario;
    }

    public String getCedula() {
        return cedula;
    }
}
