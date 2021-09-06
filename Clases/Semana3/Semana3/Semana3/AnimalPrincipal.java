package Semana3;

import java.util.ArrayList;

public class AnimalPrincipal {
    public static void main(String[] args) {
        Gato g1=new Gato("Paco");
        Gato g2=new Gato("Pepe");
        Perro p1=new Perro("Pongo");
        Perro p2 =new Perro("Pongo II");
        
        Animal[] arreglo={g1,g2,p1,p2};
        sonidosAnimales(arreglo);

        //AREGLO DINÁMICO
        //PERMITE MODIFICAR CONSTANTEMENTE EL ARREGLO
        //Trabaja como si fueran OBJETOS
        //NO PERMITE primitivos
        ArrayList<Gato> gatitos=new ArrayList<Gato>();
        gatitos.add(g1);
        gatitos.add(g2);

        ArrayList<Perro> perritos=new ArrayList<Perro>();
        perritos.add(p1);
        perritos.add(p2);


        System.out.println("Va el array dinámico");
        sonidosGatos(gatitos);
    

    }

    public static void sonidosAnimales(Animal[] arreglo){
        for(Animal i: arreglo){
            System.out.println(i.getNombre()+ " hace "+"");
            i.sonido();
        }

    }

    public static void sonidosGatos(ArrayList<Gato> gatitos){
        for(Animal i: gatitos){
            System.out.println(i.getNombre()+ " hace "+"");
            i.sonido();
        }

    }

    public static void sonidosPerros(ArrayList<Perro> perritos){
        for(Animal i: perritos){
            System.out.println(i.getNombre()+ " hace "+"");
            i.sonido();
        }

    }
}