package dataReaders;

import model.Roles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import model.Usuario;

public class UsuarioReader {
	
	public static HashMap<String, Usuario> usuarios= new HashMap<String, Usuario>();
	private static String cabecera; 
	
	public Integer cargarInformacionCuentas(String ruta) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader (new FileReader(ruta  + "Usuarios.csv"));
		String linea = br.readLine(); //cabecera
		cabecera = linea;
		linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(",");
		String nombre = partes[0].strip();
		String correo = partes[1].strip();
		String contrasena = partes[2].strip();
		String rol = partes[3].strip();
		
		Usuario usuario = new Usuario(nombre, contrasena, Roles.valueOf(rol), correo);
		
		usuarios.put(correo, usuario);
		linea = br.readLine();
		
		}
		
		br.close();
		return usuarios.size();
	}

}