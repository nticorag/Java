package Semana3;

public class Empleado extends Persona {
    
    private String empresa; //Asi NO se puede hacer la modificación desde la clase.
    //si se deja en protected se puede modificar desde la clase

    public void setEmpresa(String e){
        this.empresa=e;
    }

    public String getEmpresa(){
        return this.empresa;
    }

    @Override
    public String toString(){
        String texto = "Empleado: "+getNombre();
        texto= texto+ " Empresa: " + getEmpresa();
        return texto;
    }


}
