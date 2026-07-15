package OOP;

public class Classes {

    static void main(String[] arg) {

        var person = new Person(
                "David",
                30,
                1.80f,
                94.7f
        );

        var person2 = new Person(
                "Calixto",
                53,
                1.77f,
                67.5f
        );

        person.saludar();
        person2.saludar();

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        var book = new Book();
        book.setAuthor("Gabriel G. Marquez");
        book.setTitle("100 años de soledad");
        System.out.println(book.toString());

        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido.
        var dog = new Dog("laika");
        dog.bark("Woof, Wooff!");

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Miguel De Cervantes", "Don Quijote");
        System.out.println(book2.toString());

        // 4. Crea una clase Car con atributos brand y model y un metodo showData().
        var car = new Car("Kia","Picanto 2026");
        car.showData();

        // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60).
        var student = new Student(60);
        student.Score();

    }

}
