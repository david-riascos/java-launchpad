# ☕ Java Launchpad

Curso completo de Java para principiantes, desde los fundamentos del lenguaje hasta la Programación Orientada a Objetos y el manejo de excepciones. Pensado para quienes empiezan desde cero y quieren construir bases sólidas antes de dar el salto a frameworks como Spring Boot.

Este repositorio documenta mi proceso de aprendizaje de Java, complementando mi experiencia previa como desarrollador Full Stack en PHP/Laravel, con el objetivo de ampliar mi perfil hacia el ecosistema Java y backend/DevOps.

## 📚 Contenido

El curso está organizado en tres bloques progresivos, cada uno en su propio paquete dentro de `src/`.

### 1. Fundamentos (`src/Fundamental`)

Bases del lenguaje: sintaxis, tipos de datos y estructuras de control.

| Archivo | Tema |
|---|---|
| `VariablesAndConstants.java` | Variables y constantes |
| `DataTypes.java` | Tipos de datos primitivos y referenciados |
| `Operators.java` / `OperatorsExercises.java` | Operadores aritméticos, lógicos y relacionales |
| `Conditionals.java` / `ConditionalsExercises.java` | Estructuras condicionales (`if`, `switch`) |
| `Loops.java` / `LoopsExercises.java` | Bucles (`for`, `while`, `do-while`) |
| `Strings.java` / `StringExercises.java` | Manipulación de cadenas de texto |
| `structures.java` / `StructuresExercises.java` | Estructuras de datos básicas |
| `List.java` / `Set.java` / `Maps.java` | Colecciones: `List`, `Set` y `Map` |
| `Functions.java` / `FunctionsExercises.java` | Definición y uso de métodos |
| `BeginnerExercises.java` / `HelloWorldExercises.java` | Ejercicios introductorios |

### 2. Programación Orientada a Objetos (`src/OOP`)

Los cuatro pilares de la POO aplicados con ejemplos de dominio propio (personas, animales, vehículos, computadores).

| Archivo | Tema |
|---|---|
| `Classes.java` | Clases, atributos y constructores |
| `AccesModifiers.java` | Modificadores de acceso: `public`, `protected`, `private`, *default* |
| `Person.java` / `Personas.java` / `Progenitores.java` / `Descendientes.java` | Herencia y relaciones entre clases |
| `Composition.java` | Composición de objetos ("tiene un" vs. "es un") |
| `Abstration.java` | Clases abstractas y métodos abstractos |
| `Polymorphis.java` | Polimorfismo estático (sobrecarga) y dinámico (sobreescritura) |
| `Car.java` / `Dog.java` / `Book.java` / `Student.java` | Ejemplos aplicados de los conceptos anteriores |

### 3. Manejo de Excepciones (`src/Exceptions`)

Excepciones personalizadas, checked vs. unchecked, y buenas prácticas de validación.

| Archivo | Tema |
|---|---|
| `SaldoInsuficienteException.java` | Excepción *checked* (`extends Exception`) |
| `EdadInvalidaException.java` | Excepción *unchecked* (`extends RuntimeException`) |
| `CuentaBancaria.java` / `Persona.java` | Clases de dominio que lanzan y validan las excepciones |
| `main.java` | Manejo de excepciones con `try-catch-finally` |

## 🎯 Objetivo del curso

- Construir una base sólida de Java partiendo de la experiencia previa en PHP.
- Interiorizar los pilares de la POO (herencia, composición, abstracción, encapsulamiento y polimorfismo) con ejemplos propios, no solo teoría.
- Entender el manejo correcto de excepciones como preparación directa para el desarrollo de APIs REST con **Spring Boot**.

## 🚀 Cómo ejecutar el proyecto

**Requisitos:**
- JDK 17 o superior
- Un IDE como IntelliJ IDEA, Eclipse o VS Code con extensión de Java

**Pasos:**

```bash
# Clonar el repositorio
git clone https://github.com/david-riascos/java-launchpad.git
cd java-launchpad

# Compilar un archivo específico
javac src/OOP/Abstration.java -d out

# Ejecutar
java -cp out OOP.Abstration
```

También puedes abrir la carpeta `src/` directamente en tu IDE y ejecutar cualquier clase con un método `main` desde ahí.

## 🗺️ Próximos pasos

- [ ] Introducción a Spring Boot: controladores, servicios y repositorios
- [ ] Persistencia con JPA/Hibernate
- [ ] Manejo global de excepciones con `@RestControllerAdvice`
- [ ] Consumo y construcción de APIs REST

## 👤 Autor

**David Riascos**
Desarrollador Full Stack (PHP/Laravel) en transición hacia Java/Spring Boot y prácticas DevOps.
📍 Cali, Colombia

[GitHub](https://github.com/david-riascos)