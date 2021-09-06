package Semana3;

public class Perro extends Animal{
    
    public Perro(String nombre){
        this.setNombre(nombre);
    }
    @Override
    public void sonido(){
        System.out.println("Guau Guau");
    }

}
