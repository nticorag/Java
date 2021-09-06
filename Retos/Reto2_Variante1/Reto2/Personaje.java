package Reto2;

public class Personaje {
    //ATRIBUTOS
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;

    //CONSTRUCTOR
    public Personaje(String n, char s, double px, double py, double dam){
        this.nombre=n;
        this.sexo=s;
        this.posicionX=px;
        this.posicionY=py;
        this.damage=dam;
        this.vida=100;

    }

    //METODOS
    public void golpear(Personaje p){ //PADRE. RESTA DAÑO/DISTANCIA ENTRE PERSONAJES A LA VIDA DEL PERSONAJE p
        double dano=this.damage/calcularDistanciaRespectoPersonaje(p);
        p.setVida(p.getVida()-dano);
        if(p.getVida()<=0){
            p.setVida(0);
        }
    }

    public void recibirImpacto(double i){ //RESTA i (Cantidad ed vida a restar) al personaje
        this.vida-=i;
    }

    public double calcularDistanciaRespectoPersonaje (Personaje p){ //RETURNA la distancia entre el personaje que invoca el método y el que entra como
        //parametro

        return Math.sqrt(Math.pow(this.posicionX-p.posicionX, 2)+Math.pow(this.posicionY-p.posicionY, 2));
    }

    //SETTERS Y GETTERS

    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setSexo(char s){
        this.sexo=s;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setPosicionX(double px){
        this.posicionX=px;
    }
    public double getPosicionX(){
        return this.posicionX;
    }
    public void setPosicionY(double py){
        this.posicionY=py;
    }
    public double getPosicionY(){
        return this.posicionY;
    }
    public void setDamage(double dam){
        this.damage=dam;
    }
    public double getDamage(){
        return this.damage;
    }
    public void setVida(double v){
        this.vida=v;
    }
    public double getVida(){
        return this.vida;
    }


}
