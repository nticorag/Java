
import Planeta.*;
public class principalPlaneta {
    public static void main(String[] args) {
        Planeta planeta1= new Planeta();
        
        Planeta planeta2= new Planeta("Tierra",20);

        System.out.println("Planeta 1:"+planeta1.getNombre()+" "+planeta1.getMasa());
        planeta1.setNombre("Marte");
        planeta1.setMasa(40);
        System.out.println("Planeta 1 cambiado:"+planeta1.getNombre()+" "+planeta1.getMasa());
        System.out.println("Planeta 2:"+planeta2.getNombre()+" "+planeta2.getMasa());
        
    }
}
