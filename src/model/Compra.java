package model;

public class Compra {

	private Pieza pieza;
	private Comprador comprador;
	private double precio;
	private boolean confirmacion;
	private String proposito;
	
	public Compra(Pieza pieza, Comprador comprador, double precio, boolean confirmacion, String proposito) {
	
		this.pieza = pieza;
		this.comprador = comprador;
		this.precio = precio;
		this.confirmacion = confirmacion;
		this.proposito = proposito;
		
	}

	
	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
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

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
}
