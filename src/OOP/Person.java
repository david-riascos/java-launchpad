package OOP;

public class Person {
    //atributos
    private String nombre;
    private int edad;
    private float altura;
    private float peso;

    public Person(){}

    public  Person(
            String nombre,
            int edad,
            float altura,
            float peso
    ){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    void saludar(){
        System.out.println("Hola, soy "+this.nombre+" mi edad es "+this.edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
