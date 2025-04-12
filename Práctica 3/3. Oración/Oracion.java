/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la tercera práctica de 
Programación Orientada a Objetos:
"Utilerias y clases de uso general", manejo de oración 
*/

import java.util.Scanner;

public class Oracion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una oración: ");
		// Lectura de oración proporcionada por el usuario
		String oracion = sc.nextLine();

		// Oración original
		System.out.println("Oración original: " + oracion);

		// Oración en mayusculas
		String oracionMayusculas = oracion.toUpperCase();
		System.out.println("Oración en mayúsculas: " + oracionMayusculas);

		// Longitud de la oración
		int tamaño = oracion.length();
		System.out.println("Longitud de la oración: " + tamaño + " caracteres");

		// Reemplazo de vocales, replace devuelve un string, así que vuelvo a llamar a replace
		String vocales = oracion.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O"). replace("u", "U");
		System.out.println("Vocales: " + vocales);

	}
}