import java.util.Scanner;
public class Clase2 {
    /* public static void main(String[] args){
        System.out.println("Hola Mundo");
        identidad();
    } ******************************P  A  R  T  E     1    V  A  R  I  A  B  L  E  S

    public static void identidad(){
        
        String Nombres="Nicolas";
        String Apellidos="Ticora Garzon";
        int TI=1019122648;
        int edad=24;
        String Gen="Masculino";
        System.out.println(Nombres+" "+Apellidos+" "+TI+" "+edad+" "+Gen);
    } */
    /* public static void main(String[] args) { ****P A R T E   2   A R I T M E T H 
        int a=5,b=3,c=8,d=4,e=2;
        double res=a-(b/c)+((b-c/d)/e);
        System.out.println("el resultado es "+res);
        System.out.println(Math.pow(5,2));
    }  */

//Exclusive or: Solo UNO puede ser verdadero, de resto es FALSO

   /*  public static void main(String[] args) {***C O N D I C I O N A L E S ***
        int a=16,c=4,d=8,e=5;
        boolean b=true;
        System.out.println(a>c && e<=d);
        System.out.println(b || (d-e) > a/c);
        System.out.println(!b);
        System.out.println(!b && c<d || a/d <=e);
    } */

 //Librería para "leer" entradas
    /* public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in); //se crea un objeto de la clase escaner
    //el .in indica que se recibirá por consola

    System.out.println("Ingrese su nombre: ");
    String nombre= entrada.next();
    System.out.println("Ingrese su apellido: ");
    String apellido=entrada.next();
    System.out.println(nombre+" "+apellido);
} */
public static void main(String[] args) {
    Rectangulo();
}
public static void Rectangulo() {
    Scanner entrada =new Scanner(System.in);
;   System.err.println("Ingrese la base del rectángulo: ");
    int base=entrada.nextInt();
    System.out.println("Inrese la altura: ");
    int altura=entrada.nextInt();
    System.out.println("El área es: "+(base*altura));
}
}
