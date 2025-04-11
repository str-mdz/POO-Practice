/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la segunda práctica de 
Programación Orientada a Objetos:
"Fundamentos y sintaxis del lenguaje", demostración de do while
*/

public class demostracionDoWhile{
	public static void main(String[] args){
		int i = 10;
		do { // Bucle que se ejecuta al menos una vez
			System.out.println("Faltan " + i + " segundos");
			i -= 1; // Disminución de i
		}while(i >= 0); // Condición
	}
}

