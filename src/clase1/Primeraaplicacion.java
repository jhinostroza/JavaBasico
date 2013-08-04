package clase1;

public class Primeraaplicacion {

    public static void main(String[] args) {

        /*
         Primeraaplicacion.ejercicio1();
         Primeraaplicacion.ejercicio2y3();
         Primeraaplicacion.ejercicio4();
         Primeraaplicacion.ejercicio5();
         Primeraaplicacion.ejercicio6();
         */

        //Primeraaplicacion.ControladoresFlujo();
        //Primeraaplicacion.ejercicioSwitch();
        //Primeraaplicacion.ejercicioWhile();
        //Primeraaplicacion.ejercicioDo();
        //Primeraaplicacion.ejercicioFor();
        //Primeraaplicacion.ejercicio7(65);
        //Primeraaplicacion.ejercicioMatriz();
        Primeraaplicacion.ejercicio8(12);

    }

    public static void ControladoresFlujo() {
        int cont = 4;
        double total = 0;
        if (cont < 5) {
            total = cont * 10;
        }
        System.out.println("Contador : " + cont);
        System.out.println("Total : " + total);
    }

    public static void ejercicioSwitch() {

        int diaSemana = 5;
        String textoSemana = "";

        switch (diaSemana) {

            case 1:
                textoSemana = "Domingo";
                break;
            case 2:
                textoSemana = "Viernes";
                break;
            default:
                textoSemana = "otros";
        }

    }

    public static void ejercicioWhile() {

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;

        }
    }

    public static void ejercicioDo() {

        int contador = 0;
        do {
            System.out.println(contador);
            ++contador;
        } while (contador < 10);
    }

    public static void ejercicioFor() {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }

            System.out.println(i);
        }
    }

    public static void ejercicio1() {


        String nombre = "Javier Enrique Hinostroza Dàvila";
        System.out.println("Mi nombre es " + nombre);

    }

    public static void ejercicio2y3() {

        byte altura = 3;
        float numero = 1.75f;
        int dni = 44451485;
        short edad = 322;
        String sexo = "femenino";
        String canalTV = "WarnerBros";
        System.out.println(sexo.substring(4));
    }

    public static void ejercicio4() {

        int numerox = 5;
        int numeroy = 2;

        int numeroTemporal = numerox;
        numerox = numeroy;
        numeroy = numeroTemporal;

        System.out.println("numerox = " + numerox);
        System.out.println("numeroy = " + numeroy);
    }

    public static void ejercicio5() {

        int x = 5;
        int y = 8;
        int z = 6;
        int solucion = x + y - 3 * z;

        System.out.println("El resultado es " + solucion);
    }

    public static void ejercicio6() {

        double resultado = 7 * (15 + 1) * 2 % 2;
        System.out.println("El resultado es " + resultado);

        boolean resultado2 = 0.0 / 0.0 == 0.0 / 0.0;
        System.out.println("El resultado es " + resultado2);

        boolean resultado3 = (!true && false);
        System.out.println("El resultado es " + resultado3);

    }

    public static void ejercicio7(int edad) {

        double descuento = 0;

        if (edad < 18) {
            descuento = 0.15;
        } else if (edad > 60) {
            descuento = 0.3;
        }
        System.out.println("El descuento es " + descuento);
    }

    public static void ejercicioMatriz() {
        int[] matrizNumeros = new int[5];
        matrizNumeros[0] = 54;
        matrizNumeros[1] = 545;
        matrizNumeros[2] = 45;
        matrizNumeros[3] = 5555;
        matrizNumeros[4] = 124;

        for (int i = 0; i < matrizNumeros.length; i++) {
            System.out.println(matrizNumeros[i]);


        }

    }

    public static void ejercicio8(int mes) {

        int[] meses = {30, 28, 31, 30, 31, 30, 31, 30, 31, 30, 30, 31};
        if (mes <= meses.length) {
            System.out.println(meses[mes - 1]);
        }
    }
}
