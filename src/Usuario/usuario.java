package Usuario;

public class usuario {
	
	protected String nombre;
	
	private String login;
	
	private String password;
	
	public String rol;
	
	public String informacionContacto;
	
	public usuario( String nombre, String login, String password, String rol, String informacionContacto) {
	
		this.nombre = nombre;
		
		this.login = login;
		
		this.password = password;
		
		this.rol = rol;
		
		this.informacionContacto = informacionContacto;
		
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	
	public String getRol() {
		
		return this.rol;
		
	}
	
	
}
