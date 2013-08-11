
package CLASE2.AULA.UNIVERSO;

import CLASE2.AULA.UNIVERSO.INTERFACES.Servivo;


public class Hombre implements Servivo {

    @Override
    public void alimentarse() {
        System.out.println("COMER");
    }

    @Override
    public void comunicarse() {
        System.out.println("HABLAR");
    }

    @Override
    public void reproducirse() {
        System.out.println("SEXUALMENTE");
    }
    
    
    
}
