package modelo;

public class LibroColeccion extends Libro
{
    // --------------
    // | ATRIBUTOS |
    // --------------
    private String nombreColeccion;
    private String numeroColeccion;

    // -----------------
    // | CONSTRUCTORES |
    // -----------------

    public LibroColeccion(String nombre, String autor, String anioEdicion, Boolean edicionLujo, String nombreColeccion, String numeroColeccion)
    {
        super(nombre, autor, anioEdicion, edicionLujo, numeroColeccion);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    // ------------------
    // | GETTERS/SETTERS |
    // ------------------

    public String getNombreColeccion()
    {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion)
    {
        this.nombreColeccion = nombreColeccion;
    }

    public String getNumeroColeccion()
    {
        return numeroColeccion;
    }

    public void setNumeroColeccion(String numeroColeccion)
    {
        this.numeroColeccion = numeroColeccion;
    }


}
