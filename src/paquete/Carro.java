package paquete;

/**
 * Comentarios de documentación inician con diagonal
 * y doble asterisco.
 * @author Jiménez González Gustavo Adrián
 *
 */
public class Carro {	
	//Atributos
	/**
	 * Ocultamiento de información.
	 * -Los atributos de la clase se establecen como privados.
	 */
	public int llantas;
	private int ventanas;
	private String color;
	private float kilometraje;
	private float gasolina;
	
	//Constructor
	/**
	 * El método constructor es el primer en llamarse al
	 * crear un objeto.
	 */
	public Carro(){
		System.out.println("Este es mi nuevo carro.");
	}
	
	//Métodos
	/**
	 * Encapsulamiendo llantas.
	 * @return regresa el valor entero del atributo llantas.
	 */
	public int getLlantas(){
		return llantas;
	}
	/**
	 * Encapsulamiento kilometraje.
	 * @return regresa el valor flotante del atributo kilómetro;
	 */
	public float getKilometraje(){
		return kilometraje;
	}
	/**
	 * Encapsulamiento gasolina.
	 * @return regresa el valor flotante del atributo gasolina.
	 */
	public float getGasolina(){
		return gasolina;
	}
	/**
	 * Encapsulamiento kilometraje.
	 * @param kilometraje - establece un valor flotante al atributo
	 * 					kilometraje.
	 */
	public void setKilometraje(float kilometraje){
		this.kilometraje = kilometraje;
	}
	/**
	 * Encapsulamiento gasolina.
	 * @param gasolina - establece un valor flotante al atributo
	 * 					gasolina.
	 */
	public void setGasolina(float gasolina){
		this.gasolina = gasolina;
	}
	/**
	 * Encapsulamiento llantas.
	 * @param llantas - establece un valor entero al atributo
	 * 					llantas.
	 */
	public void setLlantas(int llantas){
		this.llantas = llantas;
	}
	/**
	 * Imprime un mensaje indicando una acción realizada.
	 */
	public void cambiarVelocidad(){
		System.out.println("Cambié de velocidad.");
	}
	/**
	 * Imprime un mensaje indicandno una acción realizada.
	 */
	public void girarVolante(){
		System.out.println("Giré el volante");
	}
	/**
	 * Imprime un mensaje indicandno una acción realizada.
	 */
	public void prenderLuces(){
		System.out.println("Prendí las luces");
	}
	/**
	 * Imprime un mensaje indicandno una acción realizada.
	 */
	public void acelerar(){
		System.out.println("Siento la velocidad");
	}	
}
