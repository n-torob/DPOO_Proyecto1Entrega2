package controller;

import java.util.Random;

import dataReaders.OfertaReader;
import model.Oferta;
import model.Pieza;
import model.PropositoVenta;
import model.Usuario;

public class OfertaController {

	private OfertaReader ofertaReader = new OfertaReader();
	public OfertaController() {
	}
	
	public void crearOferta (Pieza pieza, Usuario comprador, Double monto)
	{
		if (pieza.isBloqueada() == false && pieza.getPropositoVenta().equals(PropositoVenta.SUBASTA)) {
    		
			Random random = new Random();
	        int min = 1; 
	        int max = 100; 
	        int id = random.nextInt(max - min + 1) + min;
	        boolean verificar = false;
	        Oferta nuevaOferta ;
	        while (!verificar) {
	        	if (ofertaReader.ofertas.containsKey(id)) {
	        		
	    	        id = random.nextInt(max - min + 1) + min;
	        	}	
	        	else {
	        		verificar = true;
	        	}
	        }
	        Integer idNuevo = (Integer) id;
	    	
	        nuevaOferta = new Oferta(idNuevo, pieza.getTitulo(), comprador.getCorreo(), monto);	
	    	pieza.setBloqueada(true);
	    	ofertaReader.ofertas.put(id, nuevaOferta);
	    	//ADMINISTRADOR DEBE VERIFICAR
		}
	}

}
