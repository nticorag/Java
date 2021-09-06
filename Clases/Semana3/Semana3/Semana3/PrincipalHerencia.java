package Semana3;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Empleado e1= new Empleado();
        e1.setNombre("El de Claro");
        e1.setEmpresa("Claro");
        System.out.println(e1.getEmpresa());
        System.out.println(e1.getNombre());
        System.out.println(e1.toString());

        EmpleadoAsalariado ea1= new EmpleadoAsalariado();
        ea1.setNombre("German");
        ea1.setEmpresa("Ecopetrol");
        ea1.setSalario(2000);
        System.out.println(ea1.toString());
        

        Persona p1 = new Empleado();
        p1.setNombre("Luisa");
        
        Empleado temp =(Empleado) p1;
        temp.setEmpresa("LaEmpresa");
        System.out.println(temp.toString());

        Persona p2=new EmpleadoAsalariado();
        EmpleadoAsalariado eaa1=(EmpleadoAsalariado) p2;
        

    }
}
