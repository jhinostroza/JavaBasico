package CLASE2.AULA.ZOOLOGICO;

public class Gallina extends Animal {
    
    String pico;
    
    public Gallina() {
        this.setNumeropatas(2);
    }

    public Gallina(String nombre) {
        
        this.setNombre(nombre);
        this.setNumeropatas(2);
    }
    
    public

    @Override
    void hacerRuido() {
        System.out.println("coc coc");
    }
}
