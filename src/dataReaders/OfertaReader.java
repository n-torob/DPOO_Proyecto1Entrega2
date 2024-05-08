package dataReaders;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Oferta;
import model.Pieza;
import model.PropositoVenta;
import model.Usuario;

public class OfertaReader {

	public static HashMap<Integer, Oferta> ofertas = new HashMap<Integer, Oferta>();
	private static String cabecera; 
	public OfertaReader() {
	}
	
	public Integer cargarInformacionOfertas(String ruta) throws Exception {
		BufferedReader br = new BufferedReader (new FileReader(ruta  + "Ofertas.csv"));
		String linea = br.readLine(); //cabecera
		cabecera = linea;
		linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(",");
		Integer id = Integer.parseInt(partes[0].strip());
		String tituloPieza = partes[1].strip();
		String correoComprador = partes[2].strip();
		Double monto = Double.parseDouble(partes[3].strip());

		Oferta oferta = new Oferta (id, tituloPieza,correoComprador,monto);
        if (ofertas.containsKey(id)){
            throw new Exception("Error cargando datos: Ofertas con id unico (numero) duplicado");
        } else {
            ofertas.put(id, oferta);
        }

		linea = br.readLine();
		
		}
		
		br.close();
		return ofertas.size();
	}
	
	public void reescribirInformacionPiezas (String ruta) throws FileNotFoundException, IOException {
			FileWriter editor = new FileWriter (ruta + "Ofertas.csv");
			String cabecera = "ID,tituloPieza,correoComprador,monto";
			editor.write(cabecera + "\n");
			// ArrayList‹String > data = new ArrayList‹>();
			for (Oferta oferta: ofertas.values ( )) {
			String row = oferta.getId() + "," + oferta.getTituloPieza() + "," + oferta.getCorreoComprador() + "," + oferta.getMonto();
			// data.add(row + "\n");
			editor.append (row + "\n");	
			}
			editor.flush();
			editor.close();
	}

}
	
	


