package ejecutable;
import java.util.Scanner;
import modelo.Libro;

public class Test
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor ingrese los siguientes datos del libro:\n");

        System.out.print("Título: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor principal: ");
        String autor = scanner.nextLine();


        System.out.print("Año de edición: ");
        String anioEdicion = scanner.nextLine();

        System.out.print("Nombre coleccion: ");
        String nombreColeccion = scanner.nextLine();

        System.out.print("Numero coleccion: ");
        String numeroColeccion = scanner.nextLine();

        System.out.print("Es de lujo? (si/no): ");
        String deLujoStr = scanner.nextLine();
        Boolean edicionLujo = deLujoStr.equalsIgnoreCase("si");



        // Crear instancia del libro con los datos recogidos
        Libro libro = new Libro(nombre, autor, anioEdicion, edicionLujo, nombreColeccion);

        // Mostrar los datos del libro creado
        System.out.println("\nSe ha creado el libro:");
        System.out.println(libro.toString());

        scanner.close();
    }
}
