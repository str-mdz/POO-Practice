/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la segunda práctica de Programación Orientada a Objetos:
"Fundamentos y sintaxis del lenguaje", programa Menú de calculos
Para el 29 de Agosto del 2024
*/

import java.util.Scanner;
public class Menu {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Declaración de variables para la suma
		int n1, n2, suma, opcion;
		//Declaración de variables para la casa de cambio
		float peso, dolar, libra, euro, yen;
		//Declaración de variables para el ISR

		do{
			//Menú para el usuario
			System.out.println("\n=====MENÚ=====");
			System.out.println("Ingresa la opción que desees");
			System.out.println("1. Suma de impares");
			System.out.println("2. Cálculo de ISR");
			System.out.println("3. Casa de cambio");
			System.out.println("4. Salir");
			opcion = sc.nextInt();

			switch(opcion){
				case 1:
					System.out.println("Ingresa el primer número");
					n1 = sc.nextInt();
					System.out.println("Ingresa el segundo número");
					n2 = sc.nextInt();
					if (n1 % 2 != 0){ // If que realiza la primera verificación
						if (n2 % 2 != 0){ // If anidado que realiza la segunda verificación
							suma = n1 + n2;
							System.out.println("La suma de "+ n1 + " y " + n2 + " es de " + suma);
						} else {
							System.out.println(n2 + " no es impar");
						}	
					} else { 
						System.out.println(n2 + " no es impar");	
					}
					break;
				case 2:
					// Ingreso de datos
					System.out.println("I S R"); 
					System.out.println("Ingresa tu ingreso anual");
					double ingreso = sc.nextDouble();
					System.out.println("Ingresa tu gasto anual");
					double gasto = sc.nextDouble();
					// Declaración de variables double para guardar los calculos
					double neto = ingreso - gasto; 
					double isr;

					// Formula para calcular ISR en If's anidados
					if (ingreso <= 10000){
			            isr = ingreso * 0.05;
			        } else if (ingreso <= 20000){
			            isr = 500 + (ingreso - 10000) * 0.10;
			        } else if (ingreso<= 40000) {
			            isr = 1500 + (ingreso - 20000) * 0.15;
			        } else {
			            isr = 4500 + (ingreso - 40000) * 0.20;
			        }
			        System.out.printf("Tu ISR es de " + isr + "\n");
					break;

				case 3: 
					// Ingreso de casa de cambio, char para el menu secundario
					char opcion2;
					double dinero;
					double convertido;
					do {
						System.out.println("\n=== m e n ú ===");
						System.out.println("Ingresa la opción que desees");
						System.out.println("a. Peso a Dolar");
						System.out.println("b. Dolar a Libra");
						System.out.println("c. Euro a Yen");
						System.out.println("d. Salir");
						opcion2 = sc.next().charAt(0);

						switch(opcion2){ // Switch que clasifica las opciones para  realizar la operación
							case 'a':
							System.out.println("Ingresa los pesos que tienes");
							dinero = sc.nextDouble();
							convertido = dinero * 19.71;
							System.out.println(dinero + " pesos en dolares son " + convertido);
							break;

							case 'b':
								System.out.println("Ingresa los dolares que tienes");
								dinero = sc.nextDouble();
								convertido = dinero * 0.75;
								System.out.println(dinero + " dolares en libras son " + convertido);
								break;

							case 'c':
								System.out.println("Ingresa los euros que tienes");
								dinero = sc.nextDouble();
								convertido = dinero * 161.10;
								System.out.println(dinero + " euros en yenes son " + convertido);
								break; 
							case 'd':
								System.out.println("Saliendo...");
								break;
							default:
								System.out.println("Ingresa una opción valida");
								break;

						}
						
					} while(opcion2 != 'd'); // do While para repetir el menú secundario hasta que el usuario quiera
				
				default:
					System.out.println("Ingresa una opción valida");
					break;
				}

		}while (opcion != 4); // do While para repetir el menú principal hasta que el usuario quiera

		sc.close();
	}
}