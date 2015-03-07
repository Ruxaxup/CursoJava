package paquete;
/**
 * Clase que hace uso de la clase Carro para demostración.
 * @author Jiménez González Gustavo Adrián
 *
 */
public class Principal {
	/**
	 * Método principal. Aquí inicia la ejecución del
	 * programa.
	 * @param args - argumentos indicados desde línea de comandos
	 * 				al momento de ejecutar cualquier programa.
	 * 				Estos argumentos son del tipo String, es decir,
	 * 				manejan cadenas de caracteres o palabras o sentencias.
	 * 				String no es un tipo de dato sino una clase implementada
	 * 				por Java.
	 */
	public static void main(String[] args){
		//Variable de referencia carro del tipo Carro.
		Carro carro;
		/*Instancia de la variable de referencia usando 'new'
		 * y el constructor indicado en la clase Carro.
		 * Sin eso no se podrá hacer uso del objeto.
		 * Le da vida al objeto.
		 */
		carro = new Carro();
		//invocación a diferentes métodos del objeto carro.
		carro.acelerar();
		carro.prenderLuces();
		carro.cambiarVelocidad();
		carro.girarVolante();
		//Invocación a uno de los métodos de encapsulamiento		
		int llantas = carro.getLlantas();
		//Uso de la clase System para impresión de mensajes
		System.out.print("Número de llantas: ");
		//Impresión de una variable
		System.out.println(llantas);
		//println permite salto de línea, mientras que print no.
		//Se puede imprimir directamente si el método regresa un valor.
		System.out.println(carro.getGasolina());		
	}
}
