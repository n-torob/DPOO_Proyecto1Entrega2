package model;

import java.util.ArrayList;

public class Pieza {
	
	private String titulo;
	private String tipo;
	private String materiales;
	private String peso;
	private Boolean necesitaElectricidad;
	private String anioLugarCreacion;
	private String autor;
	private String tiempoDisponible;
	private String correoDueno;
	private String detalles;
	private PropositoVenta propositoVenta;
	// REVISAR ESTOS ATRIBUTOS
	private boolean vendida;
	private boolean bloqueada;
	private boolean entrega;
	private Double precioVenta;
	private Double valorInicial;
	private Double valorMinimo;
	private Estado estado;
	
	public Pieza(String titulo, String tipo, String materiales, String peso, Boolean necesitaElectricidad, String anioLugarCreacion, String autor, String tiempoDisponible, String correoDueno, String detalles, PropositoVenta propositoVenta,Double precio,Estado estado) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.materiales = materiales;
		this.peso = peso;
		this.necesitaElectricidad = necesitaElectricidad;
		this.anioLugarCreacion = anioLugarCreacion;
		this.autor = autor;
		this.tiempoDisponible = tiempoDisponible;
		this.correoDueno = correoDueno;
		this.detalles = detalles;
		this.propositoVenta = propositoVenta;
		this.precioVenta = null;
		this.valorInicial = null;
		this.valorMinimo = null;
		this.precioVenta = precio;
		this.estado = estado;

	}
	
	public Boolean getNecesitaElectricidad() {
		return necesitaElectricidad;
	}

	public void setNecesitaElectricidad(Boolean necesitaElectricidad) {
		this.necesitaElectricidad = necesitaElectricidad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public PropositoVenta getPropositoVenta() {
		return propositoVenta;
	}

	public void setPropositoVenta(PropositoVenta propositoVenta) {
		this.propositoVenta = propositoVenta;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public boolean isNecesitaElectricidad() {
		return necesitaElectricidad;
	}
	public void setNecesitaElectricidad(boolean necesitaElectricidad) {
		this.necesitaElectricidad = necesitaElectricidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnioLugarCreacion() {
		return anioLugarCreacion;
	}
	public void setAnioLugarCreacion(String anioLugarCreacion) {
		this.anioLugarCreacion = anioLugarCreacion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTiempoDisponible() {
		return tiempoDisponible;
	}
	public void setTiempoDisponible(String tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	public String getCorreoDueno() {
		return correoDueno;
	}
	public void setCorreoDueno(String correoDueno) {
		this.correoDueno = correoDueno;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	//REVISAR ESTOS ATRIBUTOS
	public boolean isVendida() {
		return vendida;
	}
	public void setVendida(boolean vendida) {
		this.vendida = vendida;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}
	
	public boolean isEntrega() {
		return entrega;
	}
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	
	public Double getPrecioVenta() {
		return precioVenta; 
	}
	  
	public void setPrecioVenta(Double precioVenta) { 
		this.precioVenta = precioVenta; 
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
	 
	

}
