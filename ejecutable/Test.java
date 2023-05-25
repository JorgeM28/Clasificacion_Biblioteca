package ejecutable;

import modelo.Libro;

public class Test 
{
    public static void main(String[] args) 
    {
        //Mostar los datos del libro
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, false, "La Comunidad del Anillo", 1);
        System.out.println(libro.toString());


    }
}