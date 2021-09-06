public class Personaje (String n, char s) {
    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double distanciaTotal;
    private int numeroBotiquines;
    private double vida;
    
    //Inserte acá el método constructor
    
    public Personaje(String n, char m){
        this.nombre=n;
        this.sexo=m;
        this.posicionX=0;
        this.posicionY=0;
        this.distanciaTotal=0;
        this.numeroBotiquines=0;
        this.vida=100;
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void usarBotiquin(){
        if (this.numeroBotiquines>=1){
            this.numeroBotiquines=this.numeroBotiquines-1;
            this.vida=this.vida+5;
        }
    }
    
    public void recogerBotiquin(){
        this.numeroBotiquines=this.numeroBotiquines+1;
    }

    public void moverDerecha(double d){
        this.posicionX=this.posicionX+d;
        this.distanciaTotal=this.distanciaTotal+d;
    }

    public void moverIzquierda(double d){
        this.posicionX=this.posicionX-d;
        this.distanciaTotal=this.distanciaTotal+d;
    }

    public void moverArriba(double d){
        this.posicionY=this.posicionY+d;
        this.distanciaTotal=this.distanciaTotal+d;
    }

    public void moverAbajo(double d){
        this.posicionY=this.posicionY-d;
        this.distanciaTotal=this.distanciaTotal+d;
    }

    public double calcularDistanciaRespectoOrigen(){

        return Math.sqrt((Math.pow(this.posicionX,2)+(Math.pow(this.posicionY,2))));
    }

    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre=n;
    }

    public char getSexo(){
        return this.sexo;
    }

    public void setSexo(char s){
        this.sexo=s;
    }
    public double getPosicionX(){
        return this.posicionX;
    }

    public void setPosicionX(double p){
        this.posicionX=p;
    }
    public double getPosicionY(){
        return this.posicionY;
    }

    public void setPosicionY(double p){
        this.posicionY=p;
    }
    public double getDistanciaTotal(){
        return this.distanciaTotal;
    }

    public void setDistanciaTotal(double d){
        this.distanciaTotal=d;
    }

    public int getNumeroBotiquines(){
        return this.numeroBotiquines;
    }

    public void setNumeroBotiquines(int n){
        this.numeroBotiquines=n;
    }
    public double getVida(){
        return this.vida;
    }

    public void setVida(double v){
        this.vida=v;
    }

    
    
}