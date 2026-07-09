package OOP;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark(String sonido){
        System.out.println(sonido);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
