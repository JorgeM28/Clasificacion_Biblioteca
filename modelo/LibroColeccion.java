package modelo;

public class LibroColeccion extends Libro
{
    // --------------
    // | ATRIBUTOS |
    // --------------
    private String nombreColeccion;
    private int numeroColeccion;

    public LibroColeccion(String nombre, String autor, int anioEdicion, boolean edicionLujo, String nombreColeccion, int numeroColeccion) 
    {
        super(nombre, autor, anioEdicion, edicionLujo, nombreColeccion, numeroColeccion);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    //tiene una serie de libros que forman colecciones, en cuyo caso además de lo anterior, requiere guardar
    //el nombre de la colección y el número que ocupa el libro en la colección.

    // -----------------
    // | Metodos |
    // ----------------- 
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }

    public void setNumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    @Override
    public String toString() {
        return "LibroColeccion{" + "nombreColeccion=" + nombreColeccion + ", numeroColeccion=" + numeroColeccion + '}';
    }
    


}
