package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataReaders.UsuarioReader;
import model.Compra;
import model.Comprador;
import model.Oferta;
import model.Pieza;
import model.Roles;
import model.Usuario;

public class CompradorController {

	public HashMap<Usuario, List<Oferta>> ofertas = new HashMap<Usuario, List<Oferta>>();
	public ArrayList<Compra> compras = new ArrayList<>();
	public ArrayList<Pieza> piezas = new ArrayList<>();
	
	/**
	 * Constructor por defecto de CompradorController
	 * */
	public CompradorController() {
	}
	 
	public HashMap<String, Usuario> consultarCompradores(){
		
        HashMap <String, Usuario> usuarios = UsuarioReader.usuarios;
        HashMap <String, Usuario> compradores = new HashMap <String, Usuario>();
        for (Map.Entry<String, Usuario> entry : usuarios.entrySet()) {
			String correo = entry.getKey();
			Usuario usuarioMapa = entry.getValue();
			if (usuarioMapa.getRol()== Roles.CLIENTE) {
				compradores.put(correo, usuarioMapa);
			}
        }
        return compradores;
     }
	
	/**
	 * Crea la oferta para una pieza 
	 * @param pieza
	 * @param comprador
	 * @param monto
	 * @param proposito ("Subasta" o "Venta Fija")
	 * 
	 * */
	 public void crearOferta(Pieza pieza, Usuario comprador, int monto, String proposito) throws Exception {
	    	
	    	Oferta oferta = new Oferta(pieza, comprador, monto, proposito);
	 
	        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/Ofertas.csv", true))) {
	            escritor.write(pieza + "; "+ comprador + "; "+ monto + "; "+ proposito + "/n");
	        } 
	        catch (IOException e) {
	            System.out.println("Error al crear la oferta: " + e.getMessage());
	        }
	        
	        if (ofertas.containsKey(comprador)) {
	     		List<Oferta> ofertasComprador = ofertas.get(comprador);
	     		ofertasComprador.add(oferta);
	     		ofertas.put(comprador, ofertasComprador);
	     	} 
	     	else 
	     	{
	     		List<Oferta> ofertasComprador  = new ArrayList<>();
	     		ofertasComprador.add(oferta);
	     		ofertas.put(comprador, ofertasComprador);
	   		}
	 }
	 
	 /**
	 * Crea la compra para una pieza (aprobada para ser comprada)
	 * @param pieza
	 * @param comprador
	 * @param precio
	 * @param confirmación
	 * @param proposito
	 * 
	 * */
	 public void crearCompra(Pieza pieza, Comprador Comprador, double precio, boolean confirmacion, String proposito) {
	    	
	    	Compra compra = new Compra(pieza, Comprador, precio, confirmacion, proposito);
	 
	        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/Compras.csv", true))) {
	            escritor.write(pieza + "; "+ Comprador + "; "+ precio + "; "+ confirmacion + "; "+ proposito +"/n");
	        }
	        catch (IOException e) {
	            System.out.println("Error al crear la cuenta: " + e.getMessage());
	        }
	        
	        this.compras.add(compra);
	        
	 }
	 
	 /**
	 * Crea una pieza para la galeria
	 * @param pieza
	 * @param comprador
	 * @param precio
	 * @param confirmación
	 * @param proposito
	 * 
	 * */
	 public void crearPieza(String titulo, String tipo, ArrayList<String> materiales, double peso, boolean necesitaElectricidad, String anioLugarCreacion, ArrayList<String> autor, String tiempoDisponible, String dueño, String detalles) {
	    	
	    	Pieza pieza = new Pieza(titulo, tipo, materiales, peso, necesitaElectricidad, anioLugarCreacion, autor, tiempoDisponible, dueño, detalles);
	 
	        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/Piezas.csv", true))) {
	        
	            escritor.write(titulo + "; " + tipo + "; "+ materiales + "; "+ peso + "; "+ anioLugarCreacion + "; "+ autor + "; " + tiempoDisponible +  "; "+ dueño + "; "+ detalles + "; "+"/n");
	        }
	        catch (IOException e) {
	            System.out.println("Error al crear la pieza: " + e.getMessage());
	        }
	        
	        this.piezas.add(pieza);
	        
	 }

}
