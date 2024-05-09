package model;

import model.Roles;

public class Usuario {
	
	private String nombre;
	private String contrasena;
	private Roles rol;
	private String correo;
    private Double dinero;

	public Usuario(String nombre, String contrasena, Roles rol, String correo) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.rol = rol;
		this.correo = correo;

	}
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Roles getRol() {
		return rol;
	}
	public void setRol(Roles rol) {
		this.rol = rol;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

}

