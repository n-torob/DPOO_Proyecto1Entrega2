package dataReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import model.Pieza;
import model.Roles;
import model.Usuario;

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
		String necesitaElectricidad = partes[4].strip();
		String anioLugarCreacion = partes[5].strip();
		String autor = partes[6].strip();
		String tiempoDisponible = partes[7].strip();
		String dueño = partes[8].strip();
		String detalles = partes[9].strip();
		
		// Usuario usuario = new Usuario(nombre, contrasena, Roles.valueOf(rol), correo, dinero);

		Pieza pieza = new Pieza(titulo, tipo, materiales, peso, necesitaElectricidad, anioLugarCreacion, autor, tiempoDisponible, dueño, detalles);
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

}
