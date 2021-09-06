import Vehiculo;

public class principalVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.nombre="Tesla";
        vehiculo1.setPrecio(1000);

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.nombre="Mazda";
        vehiculo2.setPrecio(500);

        System.out.println(vehiculo1.nombre+" "+ vehiculo1.getPrecio());
    }
}
