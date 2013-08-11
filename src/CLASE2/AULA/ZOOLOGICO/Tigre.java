
package CLASE2.AULA.ZOOLOGICO;

public class Tigre extends Animal{

    public Tigre(){
        
    }
    
    public Tigre(String nombre){
        this.setNumeropatas(4);
        this.setNombre(nombre);
    }
    
    @Override
    void hacerRuido() {
        System.out.println("RUGIR   ");
    }
    
   void hacerRuido(boolean molestar){
       if (molestar){
           System.out.println("rugir y zarpar");
       }
   }
   
   void hacerRuido (String mensaje){
       System.out.println("rugir "+mensaje);
   }
}
