public class Bronce extends Asiento {
    // ^ hereda de Asiento

//Inserte acá el método constructor
    public Bronce (String ID, char t){
        super(ID,t);
    }

//Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public String imprimirMenuPantalla(){
        return "BRONCE";
/*         String p="";
        char t=super.getTipo();
        if(t=='b'){
            p="BRONCE";
        }
        else if (t=='p'){
            p="PLATA";
        }
        else if (t=='o'){
            p="ORO";
        }
        return p;*/
    } 
}