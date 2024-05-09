package controller;

import java.util.HashMap;
import java.util.Map;

import dataReaders.PiezaReader;
import dataReaders.UsuarioReader;
import model.Pieza;
import model.PropositoVenta;
import model.Roles;
import model.Usuario;
import model.Pago;
import model.Oferta;


public class EmpleadoController {

    UsuarioReader usuarioReader = new UsuarioReader();

    HashMap<String , Usuario> usuarios = UsuarioReader.usuarios;


    public HashMap<Usuario, Double> registrarPago(String email, Double monto, String FormaPago, String Transacción){

        HashMap<Usuario, Double> pagos = new HashMap<Usuario, Double>();
        
        for (Map.Entry<String, Usuario> entry : usuarios.entrySet()) {
            String correo = entry.getKey();
            Usuario usuario = entry.getValue();
            if (correo.equals(email)) {
                Pago pago = new Pago(monto, FormaPago, Transacción);
                pagos.put(usuario, pago);
            }
        }
        return pagos;
        
    }
    
    public HashMap<Usuario, Oferta> registrarOferta(String email, String tituloPieza, Double monto, int id, String correoComprador){
        HashMap<Usuario, Oferta> ofertas = new HashMap<Usuario, Oferta>();
        for (Map.Entry<String, Usuario> entry : usuarios.entrySet()) {
            String correo = entry.getKey();
            Usuario usuario = entry.getValue();
            if (correo.equals(email)) {
                Oferta oferta = new Oferta(id, tituloPieza, correoComprador, monto);
                ofertas.put(usuario, oferta);
            }
        }
        return ofertas;
    }

}
