package Reto2;

public class Enemigo extends Personaje{
    
    //ATRIBUTOS
    private int evolucionesAplicadas;
    private int resistencia;

    //CONSTRUCTOR
    public Enemigo(String n, char s, double px, double py, double dam){
        super(n, s, px, py, dam);
        this.evolucionesAplicadas=0;
        this.resistencia=1;
    }

    //METODOS
    public void evolucionar(){
        
        
        if(this.getVida()<=30 && this.getEvolucionesAplicadas()==0){
            super.setDamage(super.getDamage()+20);
            this.evolucionesAplicadas+=1;
        }
        if (this.getVida()<=10 && this.getEvolucionesAplicadas()==1){
            this.setResistencia(this.getResistencia()+1);
            this.evolucionesAplicadas+=1;
        }
    }

    @Override
    public void recibirImpacto(double i){
        super.setVida(getVida()-(i/this.resistencia));
        if(super.getVida()<=0 && this.getEvolucionesAplicadas()==2){
            super.setVida(0);
        }
    }

    //SETTERS Y GETTERS
    public void setEvolucionesAplicadas(int evo){
        this.evolucionesAplicadas=evo;
    }
    public int getEvolucionesAplicadas(){
        return this.evolucionesAplicadas;
    }
    public void setResistencia(int res){
        this.resistencia=res;
    }
    public int getResistencia(){
        return this.resistencia;
    }
}
