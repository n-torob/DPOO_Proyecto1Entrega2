package controller;

import java.util.HashMap;
import dataReaders.UsuarioReader;
import model.Usuario;
import model.Roles;

public class UsuarioController {

    public HashMap<String, Usuario> consultarUsuarios(){
        HashMap <String, Usuario> usuarios = UsuarioReader.usuarios;
        return usuarios;
    }

    public void editarUsuario(String email){
        Usuario u = UsuarioReader.usuarios.get(email);
        
    }

    public void registrarusuasrio(String nombre, String contrasena, Roles rol, String correo){
        Usuario u = new Usuario(nombre, contrasena, rol, correo);
        UsuarioReader.usuarios.put(correo, u);

    }
    
}
