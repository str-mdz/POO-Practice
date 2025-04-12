/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la cuarta práctica de Programación Orientada a Objetos:
"Clases y Objetos", programa clases transporte y carnívoro,
Fecha: 12 De Septiembre del 2024
*/


// Definición de la clase Transporte
class Transporte {
    // Atributos de la clase
    String color;
    String marca;
    String placa;
    int pasajeros = 0;
    int velocidad = 0;
    
    // Constructor sin parámetros
    public Transporte() {
        System.out.println("Se crea un objeto de la clase Transporte");
    }
    
    // Constructor con parámetros
    public Transporte(String color, String marca, String placa, int pasajeros) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }

    // Método para añadir pasajeros
    public void cantidadPasajeros(int agregar) {
        pasajeros += agregar;
        System.out.println("Se subieron " + agregar + " pasajeros");
        System.out.println("En total hay " + pasajeros + " pasajeros");
    }

    // Método para quitar pasajeros
    public void cantidadPasajeros(boolean valor) {
        if (valor) {
            pasajeros -= 10;
            System.out.println("Se bajaron 10 pasajeros");
        }
        System.out.println("En total hay " + pasajeros + " pasajeros");
    }

    // Método para mostrar la información del transporte
    public void informacion() {
        System.out.println("El color del transporte es: " + color);
        System.out.println("La marca del transporte es: " + marca);
        System.out.println("La placa del transporte es: " + placa);
        System.out.println("Lleva: " + pasajeros + " pasajeros");
    }

    // Método para acelerar
    public void acelerar(int km) {
        System.out.println("Vas a " + velocidad + " km/h");
        velocidad += km;
        System.out.println("Ahora vas a " + velocidad + " km/h");
        System.out.println("====================================");
    }
}

// Definición de la clase que contiene el método main
class Prueba {
    public static void main(String[] args) {
        // Crea un Transporte 
        Transporte transporte = new Transporte("Negro", "Dodge Challenger", "34TFE-01", 0); // Constructor con parámetros
        transporte.cantidadPasajeros(30);
        transporte.cantidadPasajeros(true);
        transporte.acelerar(30);

        // Parámetro booleano
        Carnivoro Carnivoro = new Carnivoro();
        Carnivoro.cazar(true);
        Carnivoro.dormir(8);
        
        // Parámetro entero
        Carnivoro Carnivoro2 = new Carnivoro();
        Carnivoro2.cazar(2);
        Carnivoro2.dormir(false);
    }
}

// Definición de la clase Carnivoro
class Carnivoro {
    // Constructor de la clase
    public Carnivoro() {
        System.out.println("Nació un Carnivoro");
    }
    
    // Método con parámetro booleano
    public void cazar(boolean estado) {
        if (estado) {
            System.out.println("El Carnivoro ha comido");
        } else {
            System.out.println("El Carnivoro no tiene hambre");
        }
    }
    
    // Método con parámetro entero
    public void cazar(int cantidadPresas) {
        System.out.println("El Carnivoro ha cazado " + cantidadPresas + " presas");
    }

    // Método con parámetro entero
    public void dormir(int horas) {
        System.out.println("El Carnivoro ha dormido " + horas + " horas");
    }

    // Método con parámetro booleano
    public void dormir(boolean sueño) {
        if (sueño) {
            System.out.println("El Carnivoro durmió");
        } else {
            System.out.println("El Carnivoro no durmió");
        }
    }
}