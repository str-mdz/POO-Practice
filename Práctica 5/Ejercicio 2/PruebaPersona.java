/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la quinta práctica de Programación Orientada a Objetos:
"Abstracción y Encapsulamiento", programa persona / fechas.
Fecha: 20 De Septiembre del 2024
*/

class Fecha {
    private int dia;
    private int mes; 
    private int anio;

    // Constructor por defecto
    public Fecha() {
        // Inicialización vacía
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    // Método para obtener el día
    public int getDia() {
        return dia;
    }

    // Método para establecer el día con verificación de rango
    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            System.out.println("Día no válido");
        }
    }

    // Método para obtener el mes
    public int getMes() {
        return mes;
    }

    // Método para establecer el mes con verificación de rango
    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            System.out.println("Mes no válido");
        }
    }

    // Método para obtener el año
    public int getAnio() {
        return anio;
    }

    // Método para establecer el año con verificación de rango
    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
        } else {
            System.out.println("El año no puede ser negativo");
        }
    }

    // Método para representar la fecha como una cadena
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    // Constructor por defecto
    public Persona() {
        fNacimiento = new Fecha(); // Inicialización de la fecha de nacimiento
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, int fDia, int fMes, int fAnio) {
        this.nombre = nombre;
        this.apellido = apellido;
        fNacimiento = new Fecha(fDia, fMes, fAnio); // Inicialización de la fecha de nacimiento con valores
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el apellido
    public String getApellido() {
        return apellido;
    }

    // Método para establecer el apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para establecer la fecha de nacimiento
    public void setFNacimiento(int dia, int mes, int anio) {
        fNacimiento.setDia(dia);
        fNacimiento.setMes(mes);
        fNacimiento.setAnio(anio);
    }

    // Método para obtener la fecha de nacimiento
    public Fecha getFNacimiento() {
        return fNacimiento;
    }
}

public class PruebaPersona {
    public static void main(String[] args) {
        // Creación de una instancia de Persona
        Persona per1 = new Persona();
        per1.setNombre("Juan");
        per1.setApellido("Perez");
        per1.setFNacimiento(15, 8, 1950);

        // Impresión de los datos de la persona
        System.out.println("Nombre: " + per1.getNombre());
        System.out.println("Apellido: " + per1.getApellido());
        System.out.println("Fecha Nacimiento: " + per1.getFNacimiento());
    }
}
