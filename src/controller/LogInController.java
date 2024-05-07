package controller;
import java.util.HashMap;

import dataReaders.UsuarioReader;
import model.Roles;
import model.Usuario;

public class LogInController {
	
	UsuarioReader usuarioReader = new UsuarioReader();
	
	public Boolean login(String email, String p, Roles rol ) throws Exception {
		HashMap<String , Usuario> usuarios = UsuarioReader.usuarios;
		
		Usuario usuario = usuarios.get(email);
		if (usuario != null) {
			String upass = usuario.getContrasena();
			if (upass.equals(p)) {
				if (rol.equals(usuario.getRol())) {
					return true;
				} else {
					throw new Exception("Rol no permitido");
				}
				
			} else {
				throw new Exception("Contraseña incorrecta");
			}
			
		} else {
			throw new Exception("No existe el usuario");
		}
		
	}
	
}

