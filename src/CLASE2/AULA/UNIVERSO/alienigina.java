package CLASE2.AULA.UNIVERSO;

import CLASE2.AULA.UNIVERSO.INTERFACES.Servivo;

public class alienigina implements Servivo{

    @Override
    public void alimentarse() {
        System.out.println("ENERGIA");
    }

    @Override
    public void comunicarse() {
        System.out.println("TELEPATICAMENTE");
    }

    @Override
    public void reproducirse() {
        System.out.println("ASEXUALMENTE");
    } 
}
