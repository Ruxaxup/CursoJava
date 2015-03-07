//package define en que carpeta está ubicada nuestra clase.
package paquete;
/*
 * La clase definida como public  deberá llamarse igual que el
 * archivo.
 * Solo puede existir una clase public por archivo
 */
public class HolaMundo {
	/**
	 * Método principal. Aquí inicia la ejecución del
	 * programa.
	 * @param comoSea - argumentos indicados desde línea de comandos
	 * 				al momento de ejecutar cualquier programa.
	 * 				Estos argumentos son del tipo String, es decir,
	 * 				manejan cadenas de caracteres o palabras o sentencias.
	 * 				String no es un tipo de dato sino una clase implementada
	 * 				por Java. Puede llamarse como el usuario lo desee, pero 
	 * 				se recomienda dejarse como 'args' ya que representa a la
	 * 				palabra argumentos.
	 */
	public static void main(String[] comoSea){
		/*
		 * La clase System contiene un objeto llamado 'out' el cual
		 * contiene un método llamado 'println' que permite imprimir
		 * en la consola de ejecución agregando un salto de línea.
		 * También es posible especificar el salto de línea con la
		 * diagonal invertida seguida de una 'n': \n, al final de 
		 * la cadena de caracteres.
		 * Una cadena de caracteres se escribe dentro de dos comillas dobles.
		 */
		System.out.print("Hola mundo\n");
		System.out.println("Otra cadena a imprimir");
	}
}
/*
 * Sin embargo, es posible declarar múltiples clases en el 
 * mismo archivo, pero por fines prácticos esto no es deseable.
 * Se recomienda siempre tener una clase por archivo, así sean
 * 500.
 */
class OtraClase{
	
}