package Semana3;

public class EmpleadoAsalariado extends Empleado {
    private float salario;

    public void setSalario(float s){
        this.salario=s;
    }
    public float getSalario(){
        return this.salario;
    }
    
    @Override //Indica que se esta sobreescribiendo un método de la clase padre
    public String toString(){
        String texto= "Empleado Aslariado: nombre- "+getNombre()+"\n";
        texto=texto+" Empresa: "+getEmpresa()+"\n";
        texto=texto+" Salario: "+this.getSalario();
        return texto;
    }
}
