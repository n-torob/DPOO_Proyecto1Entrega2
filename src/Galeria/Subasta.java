package Galeria;

import java.util.ArrayList;

public class Subasta {
	
	private ArrayList<String> disponibilidad = new ArrayList<>();
	private double valorInicial;
	private double valorMinimo;
	
	public Subasta(ArrayList<String> disponibilidad, double valorInicial,double valorMinimo) {
		
		this.disponibilidad = disponibilidad;
		this.valorInicial = valorInicial;
		this.valorMinimo = valorMinimo;
		
	}
}
