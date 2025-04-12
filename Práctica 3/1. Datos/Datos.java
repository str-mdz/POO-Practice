/* Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la tercera práctica de Programación Orientada a Objetos:
"Utilerías y clases de uso general", datos desde línea de comandos
Fecha: 06 de Septiembre del 2024
*/

public class Datos{
	public static void main(String[] args){ // Paso los argumentos con args[i]
		System.out.println("Nombre completo\t" + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
		System.out.println("Edad\t" + args[5] + " " + args[6]);
		System.out.println("Fecha de nacimiento(dia/mes/año)\t" + args[7] + "/" + args[8] + "/" + args[9]);
		System.out.println("No. Cuenta\t" + args[10]); // Uso el signo + para la identación
	}
}
