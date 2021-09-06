import java.util.Scanner;

public class Ciclo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int factor = 1;
        int numero= entrada.nextInt();
        for (int i=2;i<=numero;i++){
            factor=factor*i;
        }
        System.out.println(factor);
    }
}
