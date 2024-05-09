package controller;

import java.util.HashMap;
import java.util.Map;

import dataReaders.PiezaReader;
import model.Pieza;
import model.PropositoVenta;
import model.Roles;
import model.Usuario;

public class PiezasController {
    
	private PiezaReader piezaReader = new PiezaReader();
	public HashMap<String, Pieza> consultarPiezas(){
        HashMap<String, Pieza> piezas = PiezaReader.piezas;
        return piezas;
    
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
	 public void crearPieza(Pieza pieza) {
	    	
	       PiezaReader.piezas.put(pieza.getTitulo(), pieza);	
	       try {
	    	   piezaReader.reescribirInformacionPiezas("./src/data/");
	       }
	       catch (Exception e)
	       {
	    	   System.out.println(e.getMessage());
	    	   
	       }
	       
	 }
	 public HashMap<String, Pieza>consultarTodasLasPiezas(){
		HashMap <String, Pieza> piezas = new HashMap <String, Pieza>();
		return piezas;
	 }
	 
	 public HashMap<String, Pieza> consultarPiezasSubasta(){
		 	HashMap <String, Pieza> piezasSubasta = new HashMap <String, Pieza>();
	        for (Map.Entry<String, Pieza> entry : PiezaReader.piezas.entrySet()) {
				String titulo = entry.getKey();
				Pieza pieza = entry.getValue();
				if (pieza.getPropositoVenta().equals(PropositoVenta.SUBASTA)) {
					piezasSubasta.put(titulo, pieza);
				}
	        }
	        
	        return piezasSubasta;
	    
	    }
	 public HashMap<String, Pieza> consultarPiezasVenta(){
		 HashMap <String, Pieza> piezasVenta = new HashMap <String, Pieza>();
	        for (Map.Entry<String, Pieza> entry : PiezaReader.piezas.entrySet()) {
				String titulo = entry.getKey();
				Pieza pieza = entry.getValue();
				if (pieza.getPropositoVenta().equals(PropositoVenta.VENTA_FIJA)) {
					piezasVenta.put(titulo, pieza);
				}
	        }
	        
	        return piezasVenta;
	    
	    }
	 
	 
}
