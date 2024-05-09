package model;

import java.util.LinkedList;
import java.util.List;

public class Propietario extends Usuario{


	private List<Pieza> piezasPropias;
	
	public Propietario(String nombre, String contrasena, Roles rol, String correo) {
		super(nombre, contrasena, rol, correo); 
		piezasPropias = new LinkedList<Pieza>();
	}

	public List<Pieza> getPiezas(){
		return piezasPropias;
	}
	
	public void agregarPiezaPropia(Pieza pieza){
		piezasPropias.add(pieza);
	}
		

}
