package Reto2;

public class Jugador extends Personaje {
  
    //ATRIBUTOS
    private int numeroBotiquines;

    //CONSTRUCTOR
    public Jugador(String n, char s, double px, double py, double dam){
        super(n, s, px, py, dam);
        this.numeroBotiquines=0;
    }

    //METODOS
    public void moverDerecha(double d){
        
        super.setPosicionX(getPosicionX()+d);
    }

    public void moverIzquierda(double d){ 
        super.setPosicionX(getPosicionX()-d);
    }

    public void moverArriba(double d){ 
        super.setPosicionY(getPosicionY()+d);
    }

    public void moverAbajo(double d){ 
        super.setPosicionY(getPosicionY()-d);
    }

    public void recogerBotiquin(){
        this.numeroBotiquines+=1;

    }

    public void usarBotiquin(){
        if(this.numeroBotiquines>=1){
            if(this.getVida()<=100){
                this.numeroBotiquines-=1;
                super.setVida(getVida()+5);
                if(this.getVida()>100){
                    this.setVida(100);
                }
            }
        }
    }

    public void golpear(Enemigo p){
        super.golpear(p);
        p.evolucionar();
        if(p.getVida()<=0 && p.getEvolucionesAplicadas()==2){
            p.setVida(0);
        }

    }

    //SETTERS Y GETTERS
    public void setNumeroBotiquines(int bot){
        this.numeroBotiquines=bot;
    }
    public int getNumeroBotiquines(){
        return this.numeroBotiquines;
    }
}
