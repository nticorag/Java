package Semana3;

import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        ArrayList<Integer> edades= new ArrayList<>();

        edades.add(18);
        edades.add(24);
        edades.add(13);
        System.out.println("Tamaño del arreglo: "+edades.size());
        System.out.println(edades.get(2));

        edades.set(2,45);
        System.out.println(edades.get(2));
        edades.remove(1);
        
        System.out.println(edades.toString());
        
        for (Integer x : edades) {
            System.out.println(x);
        }


    }
}
