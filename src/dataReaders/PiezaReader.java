package dataReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		String estado = partes[10].strip();
		
		// Usuario usuario = new Usuario(nombre, contrasena, Roles.valueOf(rol), correo, dinero);

		Pieza pieza = new Pieza(titulo, tipo, materiales, peso, necesitaElectricidad, anioLugarCreacion, autor, tiempoDisponible, dueño, detalles,estado);
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

	public static List<String> leerNombresDePiezas() {
        List<String> nombres = new ArrayList<>();
        String path = "./Piezas.csv"; // Ruta del archivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Asumiendo que el CSV usa comas como separador
                if (values.length > 0) {
                    nombres.add(values[0]); // Agrega el primer elemento de cada línea, que es el nombre
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nombres;

	}

	public static List<String> listarPiezasBloqueadas() {
        return leerPiezasPorEstado("bloqueada");
    }

    public static List<String> listarPiezasEnSubasta() {
        return leerPiezasPorEstado("subasta");
    }

    public static List<String> listarPiezasEnExhibicion() {
        return leerPiezasPorEstado("exhibición");
    }

    public static List<String> listarPiezasEnBodega() {
        return leerPiezasPorEstado("bodega");
    }

    private static List<String> leerPiezasPorEstado(String estado) {
        List<String> titulos = new ArrayList<>();
        String path = "./Piezas.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 10 && estado.equalsIgnoreCase(values[10].strip())) {
                    titulos.add(values[0].strip());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return titulos;
    }

}
