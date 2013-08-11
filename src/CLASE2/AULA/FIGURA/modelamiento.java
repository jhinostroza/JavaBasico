package CLASE2.AULA.FIGURA;

public class modelamiento {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setAlto(10.0);
        cuadrado.setAncho(10.0);
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(10d);
        rectangulo.setAncho(10d);
        
        System.out.println(cuadrado.getArea());
        System.out.println(rectangulo.getArea());
    }
}