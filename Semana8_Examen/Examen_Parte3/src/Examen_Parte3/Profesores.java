/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Parte3;

/**
 *
 * @author fabia
 */
public class Profesores {
    public String nombre_profesor;
    public String curso_profesor;
    private String cedula_profesor;
    
    public Profesores(){}

    public Profesores(String nombre_profesor, String curso_profesor, 
            String cedula_profesor) {
        this.nombre_profesor = nombre_profesor;
        this.curso_profesor = curso_profesor;
        this.cedula_profesor = cedula_profesor;
    }

    public void setCurso_profesor(String curso_profesor) {
        this.curso_profesor = curso_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public String getCurso_profesor() {
        return curso_profesor;
    }

    public String getCedula_profesor() {
        return cedula_profesor;
    }
}
