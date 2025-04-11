/*Nombre: Mendoza Camacho, Estrella de Maria
Programa perteneciente a la segunda práctica de 
Programación Orientada a Objetos:
"Fundamentos y sintaxis del lenguaje", demostración de Switch
*/

public class demostracionSwitch{
	public static void main(String[] args){
		// Declaración de caracteres
		char a = 'a';
		char b = 'b';
		char c = 'c';
		char d = 'd';
		char opcion = 'c'; // Opción de Switch

		switch( opcion ){ // Opciones de caracteres
			case 'a':
				System.out.println("Ingresaste la letra a");
                break;
            case 'b':
				System.out.println("Ingresaste la letra b");
                break;
            case 'c':
				System.out.println("Ingresaste la letra c");
                break;
            case 'd':
				System.out.println("Ingresaste la letra d");
                break;
            default:
				System.out.println("No está la letra que ingresaste");
                break;
		}


	}
}
