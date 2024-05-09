package controller;

import java.util.HashMap;
import java.util.Map;

import dataReaders.PiezaReader;
import dataReaders.UsuarioReader;
import model.Pieza;
import model.PropositoVenta;
import model.Roles;
import model.Usuario;

public class EmpleadoController {

    UsuarioReader usuarioReader = new UsuarioReader();

    HashMap<String , Usuario> usuarios = UsuarioReader.usuarios;

    public HashMap<String, Pago> RegistrarPago(String email, Double monto){
        
    }
    

}
