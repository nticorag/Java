package Semana3;

public class Gato extends Animal {
    
    public Gato(String nombre){
        this.setNombre(nombre);
    }
    @Override
    public void sonido(){
        System.out.println("Miau Miau");
    }

}
