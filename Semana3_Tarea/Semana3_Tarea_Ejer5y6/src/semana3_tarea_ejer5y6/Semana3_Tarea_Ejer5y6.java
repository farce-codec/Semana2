/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3_tarea_ejer5y6;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Semana3_Tarea_Ejer5y6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // EJERCICIO #5 //
        
//        int total_estudiantes = Integer.parseInt(JOptionPane.showInputDialog(""
//                + "Por favor ingrese la cantidad de estudiantes a evaluar"));
//        
//        int nota_total = 0;
//        int promedio = 0;
//        int aprobados = 0;
//        int reprobados = 0;
//        
//        for (int i = 1; i<=total_estudiantes; i++){
//            int nota = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
//                    + "ingrese la nota del estudiante #" + i));
//            
//            if (nota >= 70){
//                aprobados += 1;
//            }else{
//                reprobados += 1;
//            }
//            
//            nota_total += nota;
//            
//        }
//        
//        promedio = nota_total / total_estudiantes;
//        
//        JOptionPane.showMessageDialog(null,"El promedio de las notas ingresadas"
//                + " es: " + promedio);
//        
//        JOptionPane.showMessageDialog(null,"La cantidad de estudiantes "
//                + "aprobado son: " + aprobados);
//        
//        JOptionPane.showMessageDialog(null,"La cantidad de estudiantes "
//                + "reprobados son: " + reprobados);
        

        // EJERCICIO #6 //
        
        int nota_total = 0;
        int promedio = 0;
        int aprobados = 0;
        int reprobados = 0;
        int counter = 0;
        
        boolean flag = true;
        
        while (flag){
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                    + "ingrese la nota del siguiente estudiante"));
            
            if (nota >= 70){
                aprobados += 1;
                
            }else{
                reprobados += 1;
                counter += 1;
                flag = false;
            }
            
            nota_total += nota;
            
            counter += 1;
            
        }
        
        promedio = nota_total / counter;
        
        JOptionPane.showMessageDialog(null,"El promedio de las notas ingresadas"
                + " es: " + promedio);
        
        JOptionPane.showMessageDialog(null,"La cantidad de estudiantes "
                + "aprobado son: " + aprobados);
        
        JOptionPane.showMessageDialog(null,"La cantidad de estudiantes "
                + "reprobados son: " + reprobados);
    }
    
}
