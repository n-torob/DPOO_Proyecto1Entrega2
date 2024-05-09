package controller;

import java.util.HashMap;
import dataReaders.UsuarioReader;
import model.Usuario;

public class UsuarioController {

    public HashMap<String, Usuario> consultarUsuarios(){
        HashMap <String, Usuario> usuarios = UsuarioReader.usuarios;
        return usuarios;
    }

    public void editarUsuario(String email){
        Usuario u = UsuarioReader.usuarios.get(email);
        u.setDinero(0.0);

    }

    public void registrarusuasrio(){

    }
    
}
