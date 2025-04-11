/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la segunda práctica de Programación Orientada a Objetos:
"Fundamentos y sintaxis del lenguaje", programa Figuras Geometricas
Fecha: 22 de Agosto del 2024
*/

import java.util.Scanner;
public class FigurasGeometricas {
	public static void main(String[] args) {
		float area;
		int opcion;
		final float PI = 3.14159f;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Elige la opción");
			System.out.println("1.-Área de círculo");
			System.out.println("2.-Área de triángulo");
			System.out.println("3.-Área de cuadrado");
			System.out.println("4.- Salir");
			opcion = sc.nextInt();
			switch (opcion){
			case 1:
				//Círculo
				System.out.println("Seleccionó el círculo");
				float radio = 15;
				area = PI * radio * radio;
				break;
			case 2:
				//Triángulo
				System.out.println("Selecccionó el triángulo");
				float base = 8, altura = 5;
				area = (base * altura)/2;
				break;
			case 3:
				//Cuadrado
				System.out.println("Seleccionó el cuadrado");
				float lado = 10;
				area = lado * lado;
				break;
			case 4:
			//Salir
				System.out.println("Hasta luego");
				continue;
			default:
				//Ninguno de los anteriores
				System.out.println("Su elección no es correcta");
				continue;
			}
			System.out.println("El área es: " + area);
		} while (opcion != 4);
		sc.close();
	}
}
	
