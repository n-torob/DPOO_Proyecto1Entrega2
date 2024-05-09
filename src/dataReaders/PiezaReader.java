package dataReaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import model.Estado;
import model.Pieza;
import model.PropositoVenta;
import model.Roles;
import model.Usuario;
import model.Estado;

public class PiezaReader {
    public static HashMap<String, Pieza> piezas= new HashMap<String, Pieza>();
	private static String cabecera; 
	
	public Integer cargarInformacionPiezas(String ruta) throws Exception {
		BufferedReader br = new BufferedReader (new FileReader(ruta  + "Piezas.csv"));
		String linea = br.readLine(); //cabecera
		cabecera = linea;
		linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(",");
		String titulo = partes[0].strip();
		String tipo = partes[1].strip();
		String materiales = partes[2].strip();
		String peso = partes[3].strip();
		Boolean necesitaElectricidad = Boolean.parseBoolean(partes[4].strip());
		String anioLugarCreacion = partes[5].strip();
		String autor = partes[6].strip();
		String tiempoDisponible = partes[7].strip();
		String dueno = partes[8].strip();
		String detalles = partes[9].strip();
		PropositoVenta propositoVenta = PropositoVenta.valueOf(partes[10].strip());
		Double precioVenta = Double.parseDouble(partes[11].strip());
        Estado estado = Estado.valueOf(partes[12].strip());
 

		Pieza pieza = new Pieza(titulo, tipo, materiales, peso, necesitaElectricidad, anioLugarCreacion, autor, tiempoDisponible, dueno, detalles, propositoVenta, precioVenta, estado);
        if (piezas.containsKey(titulo)){
            throw new Exception("Error cargando datos: Piezas con id unico (titulo) duplicado");
        } else {
            piezas.put(titulo, pieza);
        }

		linea = br.readLine();
		
		}
		
		br.close();
		return piezas.size();
	}
	
	public void reescribirInformacionPiezas (String ruta) throws FileNotFoundException, IOException {
			FileWriter editor = new FileWriter (ruta + "Piezas.csv");
			String headers = "nombre,tipo,materiales,peso,necesitaElectricidad,anioLugarDeCreacion,autor,tiempoDisponible,dueno,detalles,propositoVenta,precioVenta";
			editor.write(headers + "\n");
			// ArrayList‹String > data = new ArrayList‹>();
			for (Pieza pieza: piezas.values ( )) {
			String row = pieza.getTitulo() + "," + pieza.getTipo() + "," + pieza.getDetalles() + "," + pieza.getPeso() + "," + pieza.isNecesitaElectricidad() + "," + pieza.getAnioLugarCreacion() + "," + pieza.getAutor() 
			+ "," + pieza.getTiempoDisponible() + "," + pieza.getCorreoDueno() + "," + pieza.getDetalles() + "," + pieza.getPropositoVenta() + "," + pieza.getPrecioVenta();
			// data.add(row + "\n");
			editor.append (row + "\n");	
			}
			editor.flush();
			editor.close();
	}

}
