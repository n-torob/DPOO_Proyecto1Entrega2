package model;

public class Oferta {
	/**
	 * Atributo que relaciona una pieza con la oferta
	 * */
	private Pieza pieza;
	/**
	 * Atributo que relaciona un comprador con la oferta
	 * */
	private Usuario comprador;
	/**
	 * Atributo que relaciona un monto con la oferta
	 * */
	private int monto;
	/**
	 * Atributo que relaciona el propóstio de la oferta, ya sea para una pieza en venta fija o de subasta
	 * */
	private String proposito;
	/**
	 * Atributo que relaciona el propietario de la pieza 
	 * */
	//private String nombreAutor; CAMBIAR CUANDO SEPA SI PROPIETARIO ES UNA CLASE O QUE 
	/**
	 * Inicializa los atributos según los parámetros
	 * @param pieza
	 * @param comprador
	 * @param monto
	 * */
	public Oferta (Pieza pieza, Usuario comprador, int monto, String proposito) {
		
		this.pieza = pieza;
		this.comprador = comprador;
		this.monto = monto;
		this.proposito = proposito;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Usuario getComprador() {
		return comprador;
	}

	public void setComprador(Usuario comprador) {
		this.comprador = (Comprador) comprador;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	public String getProposito() {
		return proposito;
	}
	
	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	
	

}
