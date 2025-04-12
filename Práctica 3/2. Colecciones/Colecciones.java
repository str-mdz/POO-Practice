/* Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la tercera práctica de Programación Orientada a Objetos:
"Utilerías y clases de uso general", ejemplo manual de prácticas
Fecha: 06 de Septiembre del 2024
*/

import java.util.ArrayList; // Clase que crea listas dinámicas

public class Colecciones {
	public static void main(String[] args){
		ArrayList<Integer> arreglo = new ArrayList<Integer>(); // Array de enteros

		// Los siguientes valores se encolan en la lista
		arreglo.add(1); 
		arreglo.add(8);
		arreglo.add(5);
		arreglo.add(1, 9); // Se añade en la posición 1 el número 9 

		// Size devuelve el número de elementos de la lista
		System.out.println("Tamaño del array list " + arreglo.size());
		// Get devuelve el elemento del indice 3
		System.out.println("Elemento en la posición 3: " + arreglo.get(3));

		// Itera en (tipo nombre : array que se recorre)		
		for (Integer elemento : arreglo){
			System.out.println(elemento);
		}
	}
}
