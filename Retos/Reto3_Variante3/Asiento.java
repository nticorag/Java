public abstract class Asiento {

    //Inserte acá los atributos
    private char tipo;
    private String ID;
    private boolean pantallaEncendida;
    private double inclinacionSilla;
    private boolean luzLecturaEncendida;
    private boolean luzAsistenciaEncendida;
    private boolean aireAcondicionadoEncendido;
    //Inserte acá el método constructor
    public Asiento(String ID, char t){
        this.tipo=t;
        this.ID=ID;
        this.pantallaEncendida=false;
        this.inclinacionSilla=90;
        this.luzLecturaEncendida=false;
        this.luzAsistenciaEncendida=false;
        this.aireAcondicionadoEncendido=false;

    }
    //Inserte acá los SETTERS Y GETTERS
    public void setTipo(char tipo){
        this.tipo=tipo;
    }
    public char getTipo(){
        return this.tipo;
    }
    public void setID(String id){
        this.ID=id;
    }
    public String getID(){
        return this.ID;
    }
    public void setPantallaEncendida(boolean p){
        this.pantallaEncendida=p;
    }
    public boolean isPantallaEncendida(){
        return this.pantallaEncendida;
    }
    public void setInclinacionSilla(Double s){
        this.inclinacionSilla=s;
    }
    public double getInclinacionSilla(){
        return this.inclinacionSilla;
    }
    public void setLuzLecturaEncendida(boolean l){
        this.luzLecturaEncendida=l;
    }
    public boolean isLuzLecturaEncendida(){
        return this.luzLecturaEncendida;
    }
    public void setLuzAsistenciaEncendida(boolean l){
        this.luzAsistenciaEncendida=l;
    }
    public boolean isLuzAsistenciaEncendida(){
        return this.luzAsistenciaEncendida;
    }
    public void setAireAcondicionadoEncendido(boolean a){
        this.aireAcondicionadoEncendido=a;
    }
    public boolean isAireAcondicionadoEncendido(){
        return this.aireAcondicionadoEncendido;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void gestionarAireAcondicionado(){
        if(this.aireAcondicionadoEncendido){
            this.aireAcondicionadoEncendido=false;
        }
        else{
            this.aireAcondicionadoEncendido=true;
        }
    }
    public void gestionarPantalla(){
        if(this.pantallaEncendida){
            this.pantallaEncendida=false;
        }
        else{
            this.pantallaEncendida=true;
        }

    }
    public void gestionarLuzLectura(){
        if(this.luzLecturaEncendida){
            this.luzLecturaEncendida=false;
        }
        else{
            this.luzLecturaEncendida=true;
        }
    }
    public void gestionarLuzAsistencia(){
        if(this.luzAsistenciaEncendida){
            this.luzAsistenciaEncendida=false;
        }
        else{
            this.luzAsistenciaEncendida=true;
        }
    }
    public void aumentarInclinacion (double i){
        this.inclinacionSilla+=i;
        if(this.inclinacionSilla>135){
            this.inclinacionSilla=135;
        }
    }
    public void disminuirInclinacion(double i){
        this.inclinacionSilla-=i;
        if(this.inclinacionSilla<0){
            this.inclinacionSilla=0;
        }
    }
    public abstract String imprimirMenuPantalla();

    
}