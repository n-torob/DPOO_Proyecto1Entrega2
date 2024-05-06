package Galeria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class sistema {
	
	public ArrayList<Usuario> usuarios = new ArrayList<>();
	public ArrayList<Pieza> piezas = new ArrayList<>();
	public ArrayList<Compra> compras = new ArrayList<>();
	public ArrayList<comprador> compradores = new ArrayList<>();
	
    public void crearCuenta(String nombre, String logIn, String password, String rol, String informacionContacto) {
    	
    	Usuario usuario = new Usuario(nombre, logIn, password, rol, informacionContacto);
    	
        String nombreArchivo = "Cuentas.txt";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/" + nombreArchivo, true))) {
        	escritor.write(nombre + ";" + logIn + ";" + password + ";" + rol + ";" + informacionContacto );
            escritor.newLine();
        } catch (IOException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
       }
        
        this.usuarios.add(usuario);
        
    }
	public void cargarInformacionCuentas() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader (new FileReader("./data/cuentas.txt"));
		String linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(";");
		String nombre = partes[0];
		String logIn = partes[1];
		String password = partes[2];
		String rol = partes[3];
		String informacionContacto = partes[4];
		
		Usuario usuario = new Usuario(nombre, logIn, password, rol, informacionContacto);
		
		this.usuarios.add(usuario);
		linea = br.readLine();
		
		}
		
		br.close();
	}
	
	public void crearPieza(String tipo, ArrayList<String> materiales, double peso, boolean necesitaElectricidad, String nombre, String anioLugarCreación, ArrayList<String> autor, String tiempoDisponible, String dueno, String detalles) {
    	
    	Pieza pieza = new Pieza(tipo, materiales, peso, necesitaElectricidad, nombre, anioLugarCreación, autor, tiempoDisponible, dueno, detalles);
    	
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/" + "Piezas.txt", true))) {
            escritor.write(tipo + "; " + materiales + "; " + peso + "; " + necesitaElectricidad + "; " + nombre + "; " + anioLugarCreación + "; " + autor + "; " + tiempoDisponible + "; " + dueno + "; " + detalles+ "/n");
        } catch (IOException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
       }
        
        this.piezas.add(pieza);
        
    }
	public void cargarInformacionPiezas() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader (new FileReader("./data/cuentas.txt"));
		String linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(";");
		String tipo = partes[0];
		ArrayList<String> materiales = new ArrayList<>();
		String[] material = partes[1].split(",");
		for (String a : material) {
			materiales.add(a.trim());
		}
		double peso = Double.parseDouble(partes[2]);
		boolean necesitaElectricidad = Boolean.parseBoolean(partes[3]);
		String nombre = partes[4];
		String anioLugarCreación = partes[5];
		ArrayList<String> autor = new ArrayList<>();
		String[] autores = partes[6].split(",");
		for (String a : autores) {
			autor.add(a.trim());
		}
		String tiempoDisponible = partes[7];
		String dueno = partes[8];
		String detalles = partes[9];

		
		Pieza pieza = new Pieza(tipo, materiales, peso, necesitaElectricidad, nombre, anioLugarCreación, autor, tiempoDisponible, dueno, detalles);
		
		this.piezas.add(pieza);
		linea = br.readLine();
		
		}
		
		br.close();
	} 
	
    public void crearCompra(Pieza pieza, comprador Comprador, double precio, boolean confirmacion, String tipo) {
    	
    	Compra compra = new Compra(pieza, Comprador, precio, confirmacion, tipo);
 
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("./data/Compra.txt", true))) {
            escritor.write(pieza + "; "+ Comprador + "; "+ precio + "; "+ confirmacion + "; "+ tipo +"/n");
        } catch (IOException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
       }
        
        this.compras.add(compra);
        
    }
	public void cargarInformacionCompra() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader (new FileReader("./data/Compra.txt"));
		String linea = br.readLine();
		while (linea != null) {
		String[] partes = linea.split(";");
		String nombre = partes[0];
		String logIn = partes[1];
		double precio = Double.parseDouble(partes[2]);
		boolean confirmacion = Boolean.parseBoolean(partes[3]);
		String tipo = partes[4];
		
		
		
		comprador C = null;
		Pieza P = null;
		
		for(comprador C1: compradores) {
			if(C1.getLogIn().equals(logIn)) {
				C = C1;
			}
		}
		
		for(Pieza P1: piezas) {
			if(P1.getNombre().equals(nombre)) {
				P = P1;
			}
		}
		
		Compra compra = new Compra(P, C, precio, confirmacion, tipo);
		
		this.compras.add(compra);
		linea = br.readLine();
		
		}
		
		br.close();
		

	}
	
	public boolean IngresarCuenta(String nombreUsuario, String contraseña) {
		for(Usuario usuario: this.usuarios) {
			if(nombreUsuario == usuario.getLogIn() && contraseña == usuario.getPassword()) {
				return true; 
			}
		}
		return false;
	}

}


        

        

