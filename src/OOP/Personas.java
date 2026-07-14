package OOP;

// Clase base: lo que TODA persona tiene, sin importar su rol
public class Personas {

    protected String primerApellido;
    protected String segundoApellido;
    protected String primerNombre;
    protected String segundoNombre;

    public Personas(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerApellido() { return primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public String getPrimerNombre() { return primerNombre; }
    public String getSegundoNombre() { return segundoNombre; }

    public String getNombreCompleto() {
        return this.getPrimerNombre() + " " + this.getSegundoNombre() + " " + this.getPrimerApellido() + " " + this.getSegundoApellido();
    }
}