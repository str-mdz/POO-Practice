/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la segunda práctica de 
Programación Orientada a Objetos:
"Fundamentos y sintaxis del lenguaje", demostración de while
*/

public class demostracionWhile{
	public static void main(String[] args){
		int i = 1; // Declaración del iterador
		System.out.println("Números del 1 al 10");
		while (i <= 10){ // While que se ejecuta con el iterador
			System.out.println("Número " + i);
			i += 1; // Aumento de iterador
		}
	}
}
	