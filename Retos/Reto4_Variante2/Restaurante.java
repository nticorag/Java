import java.util.ArrayList;
public class Restaurante {

    //Inserte acá los atributos
    ArrayList <Pedido> pedidos = new ArrayList<Pedido>();

    //Inserte acá el método constructor
    public Restaurante(){

    }

    //Inserte acá los SETTERS Y GETTERS
    public void setPedidos(ArrayList<Pedido> p){
        this.pedidos=p;
    }
    public ArrayList<Pedido> getPedidos(){
        return this.pedidos;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarPedidoLista(Pedido pl){
        pedidos.add(pl);
    }
    public void eliminarPedido(String np){
        for (int i=0;i<pedidos.size();i++){
            if (pedidos.get(i).nPedido==np){
                pedidos.remove(i);
            }
        }
    }
    public double calcularGanancias(){
        double sum=0;
        for(int i=0;i<pedidos.size();i++){
            sum+=pedidos.get(i).costoPedido;
        }
        return sum;
    }
    public double promedioGananciasTotales(){
        return calcularGanancias()/pedidos.size();
    }
    public double desviacionEstandarGananciasTotales(){
        double media=promedioGananciasTotales();
        double suma=0;
        for (Pedido a:pedidos){
            suma+=Math.pow(a.costoPedido-media, 2);
        }
        return Math.sqrt(suma/pedidos.size());
    }
    public double retornarCostoPedido(String np){
        double costo=0;
        for(int i =0;i<pedidos.size();i++){
            if(pedidos.get(i).nPedido==np){
                costo=pedidos.get(i).costoPedido;
            }
        }
        return costo;
    }
<<<<<<< HEAD
}

// AAdasd
//asdasdfsdf
///asdfasdf

//asdfa
=======
}
>>>>>>> 8776850e5d1cc75ba9e56576b5b07f23b249e447
