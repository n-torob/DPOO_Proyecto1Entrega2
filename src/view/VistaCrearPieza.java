package view;

import controller.PiezasController;
import model.Pieza;
import model.PropositoVenta;
import util.Input;

public class VistaCrearPieza {

	private PiezasController piezaController = new PiezasController();
	public VistaCrearPieza() {
	}
	
	public void mostraMenuCrearPieza()
	{
		String titulo = Input.input("Ingrese titulo: ");
		String tipo = Input.input("Ingrese tipo de arte: ");
		String materiales = Input.input("Ingrese materiales entre comillas : ");
		String peso = Input.input("Ingrese peso con kg: ");
		Boolean necesitaElectricidad = Boolean.parseBoolean(Input.input("Ingrese true si necesita electricidad, de lo contrario false: "));
		String anioLugarCreacion = Input.input("Ingrese año y lugar de creacion: ");
		String autor = Input.input("Ingrese autor(es): ");
		String tiempoDisponible =Input.input("Ingrese el tiempo disponible: ");
		String dueno = Input.input("Ingrese el dueño actual de la pieza: ");
		String detalles = Input.input("Ingrese descripción de la pieza: ");
		PropositoVenta propositoVenta = PropositoVenta.valueOf(Input.input("Ingrese si es SUBASTA o VENTA_FIJA: "));
		Pieza nuevaPieza = new Pieza (titulo, tipo, materiales, peso, necesitaElectricidad, anioLugarCreacion, autor, tiempoDisponible, dueno, detalles, propositoVenta);
		piezaController.crearPieza(nuevaPieza);
		//CONFIRMACION ADMINISTRADOR
	}

}
