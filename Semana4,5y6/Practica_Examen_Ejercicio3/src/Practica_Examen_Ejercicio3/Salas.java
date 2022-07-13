/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_Ejercicio3;

/**
 *
 * @author fabia
 */
public class Salas {
    public String codigo;
    public String urgencia;
    public int pasillo;
    public int capacidad;
    
    public Salas(){}

    public Salas(String codigo, String urgencia, int pasillo, int capacidad) {
        this.codigo = codigo;
        this.urgencia = urgencia;
        this.pasillo = pasillo;
        this.capacidad = capacidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public int getPasillo() {
        return pasillo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
