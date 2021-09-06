public class Planeta {
    private String nombre;
    private float masa;

    //Constructores
    public Planeta(){
        this.masa=4000; //Valor por defecto
    }

    public Planeta(String nom,float m){
        this.masa=m; //Valor dado por el usuario
        this.nombre=nom;
    }
    
    //Metodos

    public String getNombre(){
        return this.nombre;
    }

    public float getMasa(){
        return this.masa;
    }

    public void setNombre(String nom){
        this.nombre=nom;
    }

    public void setMasa(float m){
        this.masa=m;
    }
}
