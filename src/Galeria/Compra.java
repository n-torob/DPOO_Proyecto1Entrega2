package Galeria;

public class Compra {

	private Pieza pieza;
	private comprador comprador;
	private double precio;
	private boolean confirmacion;
	private String tipo;
	
	public Compra(Pieza pieza, comprador comprador, double precio, boolean confirmacion, String tipo) {
	
		this.pieza = pieza;
		this.comprador = comprador;
		this.precio = precio;
		this.confirmacion = confirmacion;
		this.tipo = tipo;
		
	}

	
	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public comprador getComprador() {
		return comprador;
	}

	public void setComprador(comprador comprador) {
		this.comprador = comprador;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
