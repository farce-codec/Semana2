/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Parte3;

/**
 *
 * @author fabia
 */
public class Cursos {
    public String nombre_curso;
    public String codigo_curso;
    public int horario_curso;
    public String aula_curso;
    public int cupo_curso;
    
    public Cursos(){}

    public Cursos(String nombre_curso, String codigo_curso, int horario_curso, 
            String aula_curso, int cupo_curso) {
        this.nombre_curso = nombre_curso;
        this.codigo_curso = codigo_curso;
        this.horario_curso = horario_curso;
        this.aula_curso = aula_curso;
        this.cupo_curso = cupo_curso;
    }

    public void setHorario_curso(int horario_curso) {
        this.horario_curso = horario_curso;
    }

    public void setAula_curso(String aula_curso) {
        this.aula_curso = aula_curso;
    }

    public void setCupo_curso(int cupo_curso) {
        this.cupo_curso = cupo_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public String getCodigo_curso() {
        return codigo_curso;
    }

    public int getHorario_curso() {
        return horario_curso;
    }

    public String getAula_curso() {
        return aula_curso;
    }

    public int getCupo_curso() {
        return cupo_curso;
    }
}
