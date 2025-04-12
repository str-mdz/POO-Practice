/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la cuarta práctica de Programación Orientada a Objetos:
"Clases y Objetos", programa clase perro
Fecha: 12 De Septiembre del 2024
*/

class Perro {
    // Atributos de la clase
    String nombre;
    String raza;
    String color;

    // Constructor sin parámetros
    public Perro() {
        System.out.println("Nació un perro");
    }
    
    // Constructor con un parámetro
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    // Se mandan diferentes parámetros, no puede ser el mismo
    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    // Método ladrar
    public void ladrar(boolean ladrido) {
        if (ladrido) {
            System.out.println("==================================");
            System.out.println("El perro ladra mucho");
        } else {
            System.out.println("==================================");
            System.out.println("El perro no ladra");
        }
    }

    // Método ladrar sobrecargado
    public void ladrar(String raza, boolean ladrido) {
        if (ladrido) {
            System.out.println("==================================");
            System.out.println("El perro de raza " + raza + " ladra mucho");
        } else {
            System.out.println("==================================");
            System.out.println("El perro de raza " + raza + " no ladra");
        }
    }

    // Método velocidad
    public void velocidad(String raza, boolean tamaño) {
        if (tamaño) {
            System.out.println("==================================");
            System.out.println("El perro de raza " + raza + " es rápido porque es pequeño");
        } else {
            System.out.println("==================================");
            System.out.println("El perro de raza " + raza + " es lento porque es grande");
        }
    }

    // Método limpieza
    public void limpieza(String color, boolean suciedad) {
        if (suciedad) {
            System.out.println("==================================");
            System.out.println("Mi perro de color " + color + " se ensucia porque es claro");
        } else {
            System.out.println("==================================");
            System.out.println("A mi perro de color" + color + " no se le nota la suciedad porque es oscuro");
        }
    }

    // Método impresión de datos
    public void datos(String nombre, String raza, String color) {
        System.out.println("==================================");
        System.out.println("Datos de mis mascotas:");
        System.out.println("Mis perrita se llama " + nombre);
        System.out.println("Es de color " + color);
        System.out.println("Es de raza " + raza);
    }

}
    
// Definición de la clase que contiene el método main
class pruebaPerro {
    public static void main(String[] args) {
        // Crea tres perros y asigna diferentes valores
        Perro perro = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        perro.ladrar(false);
        perro.ladrar("Chihuahua", true);
        perro.velocidad("Labrador", false);
        perro.limpieza("blanco", true);
        perro.datos("Kelly", "maltes", "blanco");
        // ===========================================================
        perro2.ladrar(true);
        perro2.ladrar("Maltes", false);
        perro2.velocidad("Labrador", true);
        perro2.limpieza("blanco", true);
        perro2.datos("Tequila", "chihuahua", "blanco");
        // ===========================================================
        perro3.ladrar(false);
        perro3.ladrar("Chihuahua", true);
        perro3.velocidad("Labrador", true);
        perro3.limpieza("blanco", false);
        perro3.datos("Cometa", "Labrador", "amarillo");

    }
}