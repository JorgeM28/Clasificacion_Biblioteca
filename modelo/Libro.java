package modelo;
import modelo.LibroColeccion;

public class Libro 
{
    //Se necesita escribir las clases necesarias y una aplicación para registrar la información de los libros
    //pertenecientes a la biblioteca del señor Pérez. El ha informado que de cada libro desea guardar el nombre del
    //mismo, el nombre del autor o autores, el año de edición y si se trata de una edición de lujo o no. También ha
    //dicho que tiene una serie de libros que forman colecciones, en cuyo caso además de lo anterior, requiere guardar
    //el nombre de la colección y el número que ocupa el libro en la colección. La única aclaración adicional es que
    //si se trata de un libro con mas de dos autores quiere guardar el primer autor, y el nombre del segundo debe
    //aparecer “y otros”.

    // --------------
    // | ATRIBUTOS |
    // --------------
    private String nombre;
    private String autor;
    private String autor2;
    private String anioEdicion;
    private boolean edicionLujo;
    private String nombreColeccion;
    private String numeroColeccion;


    // -----------------
    // | CONSTRUCTORES |
    // -----------------
    public Libro(String nombre, String autor, String anioEdicion2, boolean edicionLujo, String nombreColeccion) 
    {
        this.nombre = nombre;
        this.autor = autor;
        this.anioEdicion = anioEdicion2;
        this.edicionLujo = edicionLujo;
        this.nombreColeccion = nombreColeccion;
 
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getAnioEdicion() {
        return anioEdicion;
    }


    public void setAnioEdicion(String anioEdicion) {
        this.anioEdicion = anioEdicion;
    }


    public boolean isEdicionLujo() {
        return edicionLujo;
    }


    public void setEdicionLujo(boolean edicionLujo) {
        this.edicionLujo = edicionLujo;

      
    }


    // ------------------
    // | MÉTODOS  |
    // ------------------

    @Override
    public String toString() 
    {
        return "Libro"+ "\n"+ "  nombre = " + nombre + "\n "+" autor = " + autor + "\n "+ " anioEdicion=" + anioEdicion +"\n "+  " edicionLujo=" + edicionLujo + "\n "+ " nombreColeccion=" + nombreColeccion + "\n ";
    }





    
}
