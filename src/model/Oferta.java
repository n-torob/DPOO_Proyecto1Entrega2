package model;

public class Oferta {
	/**
	 * Atributo que identifica cada oferta
	 * */
	private Integer id;

	/**
	 * Atributo que relaciona una pieza con la oferta
	 * */
	private String tituloPieza;
	/**
	 * Atributo que relaciona un comprador con la oferta
	 * */
	private String correoComprador;
	/**
	 * Atributo que relaciona un monto con la oferta
	 * */
	private Double monto;
	
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
	public Oferta (Integer id, String tituloPieza, String correoComprador, Double monto) {
		
		this.id = id;
		this.tituloPieza = tituloPieza;
		this.correoComprador = correoComprador;
		this.monto = monto;
	
	}

	public String getTituloPieza() {
		return tituloPieza;
	}

	public void setTituloPieza(String tituloPieza) {
		this.tituloPieza = tituloPieza;
	}

	public String getCorreoComprador() {
		return correoComprador;
	}

	public void setCorreoComprador(String correoComprador) {
		this.correoComprador = correoComprador;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

}
