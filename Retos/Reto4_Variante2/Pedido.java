

public class Pedido {

    //Inserte acá los atributos
    String nPedido;
    String IDCliente;
    double costoPedido;
    int diaPedido;
    int mesPedido;
    int yearPedido;
    //Inserte acá el método constructor
    public Pedido (String nPedido, String IDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido){
        this.nPedido=nPedido;
        this.IDCliente=IDCliente;
        this.costoPedido=costoPedido;
        this.diaPedido=diaPedido;
        this.mesPedido=mesPedido;
        this.yearPedido=yearPedido;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public void setnPedido (String nP){
        this.nPedido=nP;
    }
    public String getnPedido(){
        return this.nPedido;
    }
    public void setIDCliente (String ID){
        this.IDCliente=ID;
    }
    public String getIDCliente (){
        return this.IDCliente;
    }
    public void setCostoPedido (double costo){
        this.costoPedido=costo;
    }
    public double getCostoPedido(){
        return this.costoPedido;
    }
    public void setDiaPedido(int d){
        this.diaPedido=d;
    }
    public int getDiaPedido(){
        return this.diaPedido;
    }
    public void setMesPedido(int m){
        this.mesPedido=m;
    }
    public int getMesPedido(){
        return this.mesPedido;
    }
    public void setYearPedido(int y){
        this.yearPedido=y;
    }
    public int getYearPedido(){
        return this.yearPedido;
    }
}