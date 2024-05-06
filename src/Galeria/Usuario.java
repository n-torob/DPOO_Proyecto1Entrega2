package Galeria;

public class Usuario {
	
	private String nombre;
	private String logIn;
	private String password;
	private String rol;
	private String informacionContacto;
	
	public Usuario(String nombre, String logIn, String password, String rol, String informacionContacto) {
		
		this.nombre = nombre;
		this.logIn = logIn;
		this.password = password;
		this.rol = rol;
		this.informacionContacto = informacionContacto; 
				
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLogIn() {
		return logIn;
	}
	public void setLogIn(String logIn) {
		this.logIn = logIn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getInformacionContacto() {
		return informacionContacto;
	}
	public void setInformacionContacto(String informacionContacto) {
		this.informacionContacto = informacionContacto;
	}

}
