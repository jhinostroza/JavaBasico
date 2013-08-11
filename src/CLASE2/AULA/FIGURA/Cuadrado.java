/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASE2.AULA.FIGURA;

/**
 *
 * @author PFR
 */
public class Cuadrado extends Shape{

    @Override
    public Double getArea() {
    
        Double resultado = this.getAlto() * getAncho();
        return resultado;
    }
    
    public void setLado(){
        this.setAlto(10d);
        this.setAncho(10d);
    }
    
    
}
