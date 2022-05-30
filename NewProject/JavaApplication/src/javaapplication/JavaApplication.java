/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import javax.swing.JOptionPane;
/**
 *
 * @author fabia
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hello World Test
        //String val1 = "Hello";
        //String val2 = "World";
        
        //System.out.println(val1+val2);
        
        //*********************************************************************
        // Java Swing Test
        //String nombre = "";
        //int edad = 0;
        //nombre = JOptionPane.showInputDialog("Digit su nombre");
        //edad = Integer.parseInt(JOptionPane.showInputDialog("Digit su edad"));
        
        //Esta opcion no se pueda usar el "%s" o "%d"
        //JOptionPane.showMessageDialog(null,"Mi nombre es "+nombre+" y mi edad "
        //        + "es "+edad+" años");
        
        //System.out.printf("Mi nombre es %s y mi edad es %d años%n",nombre,edad);
        
        //*********************************************************************
        
        //Calcule la suma y el promedio
        //sumaYpromedio();
    //}

    //public static void sumaYpromedio(){
        //int num1 = 0;
        //int num2 = 0;
        //int num3 = 0;
        //int num4 = 0;
        //int suma = 0;
        //int promedio = 0;
        
        //num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        //num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        //num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número"));
        //num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto número"));
        
        //suma = num1+num2+num3+num4;
        //promedio = suma/4;
        
        //JOptionPane.showMessageDialog(null,"La suma de los números ingresados"
        //        + " es: "+suma+" y el promedio es: "+promedio);
            
    //*********************************************************************
        saludo();
    }
        
    public static void saludo(){
        String nombre = "";
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        JOptionPane.showMessageDialog(null,"Hola "+nombre+". Bienvenido(a) a"
                + " este programa desarrollado en Java con NetBeans.");
    }
}
