package OOP;

// Descendientes ES UNA Persona -> herencia correcta
// pero TIENE padres -> composición correcta
public class Descendientes extends Personas {

    private final int id;
    private final String fechaNacimiento;

    // composición: el Descendiente TIENE padres, no ES sus padres
    private final Progenitores padre;
    private final Progenitores madre;

    public Descendientes(int id, String fechaNacimiento, String primerNombre, String segundoNombre,
                         Progenitores padre, Progenitores madre) {
        // uso los apellidos de los padres para construir MI propia identidad (herencia de datos, no de clase)
        super(primerNombre, segundoNombre, padre.getPrimerApellido(), madre.getSegundoApellido());
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.padre = padre;
        this.madre = madre;
    }

    public int getId() { return id; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public Progenitores getPadre() { return padre; }
    public Progenitores getMadre() { return madre; }
}