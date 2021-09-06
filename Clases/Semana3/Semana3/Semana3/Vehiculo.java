package Semana3;

/**
 * Vehiculo
 */
public class Vehiculo {

    private String nombre;
    private double precio;

    public Vehiculo (String n, double p){
        this.nombre=n;
        this.precio=p;
    }

    public double getPrecio(){
        return this.precio;
    }

}