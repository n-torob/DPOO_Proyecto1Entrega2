package model;

import java.util.LinkedList;
import java.util.List;

public class Comprador extends Usuario{

	/**
	 * Atributo que indica el monto maximo a gastar
	 * */
	private double montoMaximo;
	/**
	 * Lista de las piezas que son propiedad del usuario
	 * */
	private List<Pieza> piezasPropias;
	
	public Comprador(String nombre, String contrasena, Roles rol, String correo, Double dinero) {
		super(nombre, contrasena, rol, correo, dinero); 
		piezasPropias = new LinkedList<Pieza>();
	}

	public double getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(double montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	public List<Pieza> getPiezas(){
		return piezasPropias;
	}
	
	public void agregarPiezaPropia(Pieza pieza){
		piezasPropias.add(pieza);
	}
		

}
