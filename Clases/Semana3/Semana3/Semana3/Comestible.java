package Semana3;

public interface Comestible {
    public final int VARIABLE =1; //Constante
    public abstract String comer(); //METODO ABSTRACTO
    public static void imprimir(){ //METODOS STATIC
        System.out.println("Imprimir");
    }
    public abstract void hola();
    default void metodo(){ //IMPLICITAMENTE ES ABSTRACT
        System.out.println("Hola");
    }
}

class Gallina extends AnimalAbstracta implements Comestible{ //implements es para INTERFACE
    
    //FALTA LA CLASE ANIMAL ABSTRACTA
    @Override
    public String comer(){
        Comestible.imprimir();
        return ("Comer gallinas "+VARIABLE);
    }

    @Override
    public void hola(){
        System.out.println("Hola");
    }

    @Override
    public void sonido(){
        System.out.println("Choi choi");
    }
}


