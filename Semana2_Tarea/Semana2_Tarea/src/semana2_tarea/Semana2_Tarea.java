/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2_tarea;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Semana2_Tarea {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int años_laborados = 0;
        int horas_laboradas = 0;
        float precio_hora = 0;
        double salario_bruto = 0;
        double salario_neto = 0;
        
        años_laborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "la cantidad de años laborados"));

        horas_laboradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                + " la cantidad de horas laboradas por semana"));

        precio_hora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el "
                + "monto a cancelar por hora laborada"));

        salario_bruto = (horas_laboradas * precio_hora) * 4;
        
        if (años_laborados > 10) {
            salario_neto = (salario_bruto * 0.20) + salario_bruto;
            
            if (salario_neto > 1000 && salario_neto < 2000) {
                salario_neto -= salario_neto * 0.10;
            } 
            else if (salario_neto > 2000) {
                salario_neto -= salario_neto * 0.15;
            }  
        }
        else {
            salario_neto = salario_bruto;
        }

        JOptionPane.showMessageDialog(null, "Su salario neto es "
                + "de " + salario_neto);
    }
    
}