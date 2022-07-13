/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana45y6;

/**
 *
 * @author fabia
 */
public class Direccion {
    private String calle;
    private String canton;
    private String provincia;
    private String distrito;
    
    public Direccion(){}

    public Direccion(String calle, String canton, String provincia, 
            String distrito) {
        this.calle = calle;
        this.canton = canton;
        this.provincia = provincia;
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public String getCanton() {
        return canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDistrito() {
        return distrito;
    } 
}
