package CLASE2.AULA.FIGURA;

public class Rectangulo extends Shape{

    @Override
    public Double getArea() {
        
        Double resultado = this.getAlto() * getAncho();
        return resultado;
    }
    
    
}
