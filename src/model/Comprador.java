package model;

import java.util.LinkedList;
import java.util.List;
import model.Pago;

public class Comprador extends Usuario{

	private List<Pieza> piezasPropias;
	private List<Pago> MetodosPago;
	
	public Comprador(String nombre, String contrasena, Roles rol, String correo) {
		super(nombre, contrasena, rol, correo); 
		piezasPropias = new LinkedList<Pieza>();
		MetodosPago = new LinkedList<Pago>();
	}

	public List<Pieza> getPiezas(){
		return piezasPropias;
	}
	
	public void agregarPiezaPropia(Pieza pieza){
		piezasPropias.add(pieza);
	}
	
	public void metodosPago(model.Pago clasePago){
		Bolsillo=Pago(Monto)
	}

}
