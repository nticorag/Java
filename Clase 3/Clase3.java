import java.util.Scanner;

public class Clase3 {
    /* public static void main(String[] args) {  *** C O N D I C I O N A L E S ***
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura:");
        int temp = entrada.nextInt();

        if(temp > 27){
            System.out.println("Comprar algo pa' la sed");
        }
        else{
            System.out.println("No compre na'");
        }
        System.out.println("Fin programa");

    } */
    public static void main(String[] args) {
        estructuraWhileCentinela();
    }
 
    public static void estructuraWhile() {
    int i = 0;
    while(i < 100){
        System.out.println(i);
        i+= 1; // i = i +1;
    }
    }
 
    public static void estructuraWhileCentinela() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese un número");
    int num = entrada.nextInt();
 
    //int i = 0;
    while(num > 0){
        System.out.println("Hola");
        System.out.println("o ingrese cero para salir");
        num = entrada.nextInt();
    }
    }
}
