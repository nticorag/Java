package E2;

import java.util.Arrays;


public class E4{
    public static int [] ordenamientoPersonalizado(int [] vector){
        
        

        int[]vectorOrdenado;
        Arrays.sort(vector);
        
        //.sort(vectorEntrada,(vectorEntrada.length/2),vectorEntrada.length-1,Collections.reverseOrder());
        
        vectorOrdenado=vector;
        System.out.println(vectorOrdenado);
        
        
        return vectorOrdenado;
    }
}