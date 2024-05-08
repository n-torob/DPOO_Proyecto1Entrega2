package model;

import java.util.ArrayList;

public class Pieza {
	
	private String titulo;
	private String tipo;
	private ArrayList<String> materiales = new ArrayList<>();
	private double peso;
	private boolean necesitaElectricidad;
	private String anioLugarCreación;
	private ArrayList<String> autor = new ArrayList<>();
	private String tiempoDisponible;
	private String dueño;
	private String detalles;
	private boolean vendida;
	private boolean bloqueada;
	private boolean valorFijo;
	private boolean entrega;
	
	public Pieza( String titulo,String tipo, ArrayList<String> materiales, double peso, boolean necesitaElectricidad, String anioLugarCreación, ArrayList<String> autor, String tiempoDisponible, String dueño, String detalles) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.materiales = materiales;
		this.peso = peso;
		this.necesitaElectricidad = necesitaElectricidad;
		this.anioLugarCreación = anioLugarCreación;
		this.autor = autor;
		this.tiempoDisponible = tiempoDisponible;
		this.dueño = dueño;
		this.detalles = detalles;

	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<String> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<String> materiales) {
		this.materiales = materiales;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
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
	public String getAñoLugarCreación() {
		return anioLugarCreación;
	}
	public void setAñoLugarCreación(String añoLugarCreación) {
		this.anioLugarCreación = añoLugarCreación;
	}
	public ArrayList<String> getAutor() {
		return autor;
	}
	public void setAutor(ArrayList<String> autor) {
		this.autor = autor;
	}
	public String getTiempoDisponible() {
		return tiempoDisponible;
	}
	public void setTiempoDisponible(String tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
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
	public boolean isValorFijo() {
		return valorFijo;
	}
	public void setValorFijo(boolean valorFijo) {
		this.valorFijo = valorFijo;
	}
	public boolean isEntrega() {
		return entrega;
	}
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

}
