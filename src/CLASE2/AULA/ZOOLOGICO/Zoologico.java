package CLASE2.AULA.ZOOLOGICO;

public class Zoologico {

    public static void main(String[] args) {

        Gallina galina = new Gallina();
        Zoologico.doCasting(galina);
        Zoologico.doCasting(new Tigre());
    }

    public static void doHerencia() {
        Tigre tigre = new Tigre();
        tigre.setNumeropatas(4);
        tigre.hacerRuido();
        System.out.println("tengo " + tigre.getNumeropatas());
        tigre.hacerRuido(true);
        tigre.hacerRuido("Hola a todos");

        Gallina gallina = new Gallina();
        gallina.setNumeropatas(2);
        System.out.println(gallina.getNumeropatas());
        gallina.hacerRuido();
    }

    public static void doCasting(Animal animal) {
        if (animal instanceof Tigre) {
        Tigre tigre = (Tigre) animal;
        tigre.hacerRuido(true);
        
        }else if(animal instanceof Gallina){
            Gallina gallina = (Gallina) animal;
            gallina.hacerRuido();
        
            
        }
    }

    public static void doConstructor() {
        Gallina gallina = new Gallina();
        gallina.setNombre("PEPA");
        gallina.setNumeropatas(2);
        gallina.printNombrePatas();

        Gallina mamba = new Gallina("MAMBA");
        mamba.printNombrePatas();

        Tigre lorenzo = new Tigre("LORENZO");
        lorenzo.printNombrePatas();
    }

    public static void doInstance() {

        Animal tigre = new Animal();
        tigre.setNombre("Tigre");
        System.out.println("Soy un " + tigre.getNombre());

        tigre.hacerRuido();
    }
}
