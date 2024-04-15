package Galeria;

import java.util.ArrayList;

public class Escultura  extends Pieza{
	
	private float alto;
	private float ancho;
	private float profundidad;
	
	public Escultura(float alto, float ancho, float profundidad, String tipo, ArrayList<String> materiales, double peso, boolean necesitaElectricidad, String nombre, String anioLugarCreación, ArrayList<String> autor, String tiempoDisponible, String dueno, String detalles) {
		super(tipo, materiales, peso, necesitaElectricidad, nombre, anioLugarCreación, autor, tiempoDisponible, dueno, detalles);
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	
	
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

}
