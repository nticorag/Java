import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int[] arreglo=new int [entrada.nextInt()];
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]=5;
        }
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }


    }
}

