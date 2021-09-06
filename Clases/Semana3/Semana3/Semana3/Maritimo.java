package Semana3;

public class Maritimo extends Vehiculo {
    public static final double IVA = 0.2;

    public Maritimo(String n, double p){
        super(n, p);
    }

@Override
    public double getPrecio(){
        return super.getPrecio()+(super.getPrecio()*IVA);
    }
}
