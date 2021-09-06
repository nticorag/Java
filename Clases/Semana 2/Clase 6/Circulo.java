public class Circulo {
    //Atributos

    private double radio;

    //Constructores
    public Circulo(){
        this.radio=1; //Valor por defecto
    }

    public Circulo(double r){
        this.radio=r; //Valor dado por el usuario
    }
    
    //Metodos

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio=radio;
    }

    public double getPerimetro(){
        return 2*Math.PI*this.radio;
    }

}
