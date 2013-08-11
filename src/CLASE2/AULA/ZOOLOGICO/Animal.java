
package CLASE2.AULA.ZOOLOGICO;


public class Animal {
    
    private int numeropatas;
    private Double tamaño;
    private String nombre;
    private String especie;
    
    
    void hacerRuido(){
        
        
    }
    
    void printNombrePatas(){
        
        System.out.println(this.nombre + "" + this.numeropatas);
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
