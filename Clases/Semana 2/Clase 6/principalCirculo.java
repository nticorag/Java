import Circulo;

public class principalCirculo {
    public static void main(String[] args) {
        Circulo circulo1;
        circulo1=new Circulo();

        Circulo circulo2=new Circulo();

        Circulo circulo3=new Circulo(5);

        System.out.println("Radio circulo 1 antes cambiar:"+circulo1.getRadio());
        System.out.println("Perimetro circulo 1: "+circulo1.getPerimetro());
        circulo1.setRadio(9);



    }
}
