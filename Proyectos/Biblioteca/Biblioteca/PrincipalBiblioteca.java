package Biblioteca;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        Biblioteca b1=new Biblioteca();

        System.out.println(Biblioteca.libros.toString());

        b1.agregar("Sofwater libre para una sociedad libre", "GTY345", "Richard Stallman", 2002);

        System.out.println(Biblioteca.libros.toString());
        System.out.println(Biblioteca.libros.get(1));

        Object[][] table=b1.listar();

        for(int i=0;i<table.length;i++){
            for(int j = 0;j<table[0].length;j++){
                System.out.println(table[i][j]+", ");
            }
            System.out.println("");
        }
        System.out.println("********************");
       
        for (Object[] filas:table){
            for (Object value: filas){
                System.out.println(value);
            }
            System.out.println("");
        }
        System.out.println("********************");
        Object[][] table2=b1.obtenerPorId(0);

        for (Object[] filas:table2){
            for (Object value: filas){
                System.out.println(value);
            }
            System.out.println("");
        }

        System.out.println("********************");
        b1.eliminar(0);
        Object[][] table4=b1.listar();
        for (Object[] filas:table4){
            for (Object value: filas){
                System.out.println(value);
            }
            System.out.println("");
        }

    }


    //CREAR MÉTODO EN BIBLIOTECA PARA BUSCAR POR ID(DEVUELVE OBJECT), 
    //MODIFICAR (DEVUELVE UN OBJECT) Y PARA ELIMINAR (VOID)
}
