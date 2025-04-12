/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la quinta práctica de Programación Orientada a Objetos:
"Abstracción y Encapsulamiento", programa figuras.
Fecha: 20 De Septiembre del 2024
*/


import java.util.Scanner;

// Circulo
class Circulo {
    static float PI = 3.14159f;
    private float radio;
    private static Scanner sc = new Scanner(System.in);

    public Circulo() {  // Constructor
        System.out.println("Se creó un círculo");
    }

    public float getRadio() {   // Leer el radio
        return radio;
    }

    public void setRadio(float radio) { // Modificar el radio
        while (radio <= 0) { // Verificación
            System.out.println("Ingresa un valor correcto para el radio (mayor que 0):");
            radio = sc.nextFloat();
        }
        this.radio = radio;
    }

    public float perimetro() { // Método perimetro
        return 2 * PI * radio;
    }

    public float area() { // Método area
        return PI * radio * radio;
    }

    public String toString() { // Impresión de datos
        return "Círculo [radio = " + radio + "]";
    }
}

// Rectangulo

class Rectangulo {
    private float base;
    private float altura;
    private static Scanner sc = new Scanner(System.in);

    public Rectangulo() { // Constructor
        System.out.println("Se creó un rectángulo");
    }

    public void setBaseAltura(float base, float altura) { // Verificación de base mayor que altura
        while (base <= altura) {
            System.out.println("La base debe ser mayor que la altura. Ingresa nuevamente los valores:");
            base = sc.nextFloat();
            altura = sc.nextFloat();
        }
        this.base = base;
        this.altura = altura;
    } 

    public float area() {
        return base * altura;
    }

    public float perimetro() {
        return 2 * (base + altura);
    }

    public String toString() {
        return "Rectángulo [base = " + base + ", altura = " + altura + "]";
    }
}

// Trapecio

class Trapecio {
    private float baseMayor;
    private float baseMenor;
    private float altura;
    private static Scanner sc = new Scanner(System.in);

    public Trapecio() {
        System.out.println("Se creó un trapecio");
    }

    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(float altura) {   // Verificación altura mayor a 0
        while (altura <= 0) {
            System.out.println("Ingresa un valor correcto para la altura (mayor que 0):");
            altura = sc.nextFloat();
        }
        this.altura = altura;
    }

    public float area() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public float perimetro() { // Fórmula para el perimetro (teorema de Pitagoras para obtener las diagonales)
        float diagonal = (float) Math.sqrt(Math.pow((baseMayor - baseMenor) / 2, 2) + Math.pow(altura, 2));
        return baseMayor + baseMenor + (2 * diagonal);
    }

    public String toString() {
        return "Trapecio [base mayor = " + baseMayor + ", base menor = " + baseMenor + ", altura = " + altura + "]";
    }
}

// Rombo 

class Rombo {
    private float diagonalMayor;
    private float diagonalMenor;

    public Rombo() {
        System.out.println("Se creó un rombo");
    }

    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public float area() { // Área
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public float perimetro() { // Fórmula para obtener las diagonales (lados)
        float lado = (float) Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
        return 4 * lado; // Suma de lados
    }

    public String toString() {
        return "Rombo [diagonal mayor = " + diagonalMayor + ", diagonal menor = " + diagonalMenor + "]";
    }
}

// Pentagono

class Pentagono {
    private float lado;

    public Pentagono() {
        System.out.println("Se creó un pentágono");
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float area() { // Fórmula para obtener el area de un pentagono
        return (float) (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) / 4) * lado * lado;
    }

    public float perimetro() {
        return 5 * lado;
    }

    public String toString() {
        return "Pentágono [lado = " + lado + "]";
    }
}

// Clase principal
public class pruebaFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circulo prueba 

        Circulo cir = new Circulo();
        System.out.println("Ingresa el radio del círculo:");
        cir.setRadio(sc.nextFloat());
        System.out.println(cir);
        System.out.println("Perímetro: " + cir.perimetro());
        System.out.println("Área: " + cir.area());

        // Rectangulo prueba
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingresa la base y la altura del rectángulo:");
        rectangulo.setBaseAltura(sc.nextFloat(), sc.nextFloat());
        System.out.println(rectangulo);
        System.out.println("Perímetro: " + rectangulo.perimetro());
        System.out.println("Área: " + rectangulo.area());

        // Trapecio
        Trapecio trapecio = new Trapecio();
        System.out.println("Ingresa la base mayor, base menor y altura del trapecio:");
        trapecio.setBaseMayor(sc.nextFloat());
        trapecio.setBaseMenor(sc.nextFloat());
        trapecio.setAltura(sc.nextFloat());
        System.out.println(trapecio);
        System.out.println("Perímetro: " + trapecio.perimetro());
        System.out.println("Área: " + trapecio.area());

        // Rombo
        Rombo rombo = new Rombo();
        System.out.println("Ingresa la diagonal mayor y la diagonal menor del rombo:");
        rombo.setDiagonalMayor(sc.nextFloat());
        rombo.setDiagonalMenor(sc.nextFloat());
        System.out.println(rombo);
        System.out.println("Perímetro: " + rombo.perimetro());
        System.out.println("Área: " + rombo.area());

        // Pentagono
        Pentagono pentagono = new Pentagono();
        System.out.println("Ingresa el lado del pentágono:");
        pentagono.setLado(sc.nextFloat());
        System.out.println(pentagono);
        System.out.println("Perímetro: " + pentagono.perimetro());
        System.out.println("Área: " + pentagono.area());

        sc.close(); // Cerrar el scann
    }
}
