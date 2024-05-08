package view;

import java.util.HashMap;
import java.util.Map;

import controller.PiezasController;
import dataReaders.PiezaReader;
import dataReaders.UsuarioReader;
import model.Pieza;
import model.Roles;
import util.Input;

public class MainCliente {
	
	private VistaCrearPieza vistaCrearPieza = new VistaCrearPieza();
	private static String ruta = "./src/data/";

	private PiezasController piezasController = new PiezasController();
	public static void main(String[] args) {
		
		
		PiezaReader piezaReader = new PiezaReader();
		UsuarioReader usuarioReader = new UsuarioReader();
		MainCliente vista  =new MainCliente();
		try {
           	Integer nPiezas = piezaReader.cargarInformacionPiezas(ruta);
           	Integer nUsuarios = usuarioReader.cargarInformacionCuentas(ruta);
			System.out.println("Se cargaron " + nPiezas + " piezas");
			System.out.println("Se cargaron " + nUsuarios + " usuarios");
        } 
		catch (Exception e) {
            e.printStackTrace();
        }

		LogIn logIn = new LogIn();
		boolean inicioSesionExitoso = logIn.mostrarLogIn(Roles.CLIENTE);
        if (inicioSesionExitoso) {
            vista.ejecutarOpciones();
        }
	}

	private void mostrarOpciones() {
		System.out.println("Seleccione una opción:");
        System.out.println("1. ver lista de piezas totales");
        System.out.println("2. ver lista de piezas de subasta");
        System.out.println("3. ver lista de piezas de venta");
        System.out.println("4. agregar nueva Pieza");
        System.out.println("4. Hacer oferta sobre pieza en subasta");
        System.out.println("4. Hacer compra sobre pieza en venta fija");
	}

	private void ejecutarOpciones(){
		Boolean continuar = true;
		while (continuar) {
			mostrarOpciones();
			Integer opcion = Integer.parseInt( Input.input("Ingrese opcion: "));
			switch (opcion) {
				case 1:
					System.out.println("Opcion 1 seleccionada");
					HashMap<String, Pieza> piezas =  piezasController.consultarPiezas();
					for (Map.Entry<String, Pieza> entry : piezas.entrySet()) {
						String key = entry.getKey();
						Pieza value = entry.getValue();
						System.out.println("- " + value.getTitulo() + "," + value.getAutor());
						
					}
					break;
				case 2:
				System.out.println("Opcion 2 seleccionada");
				HashMap<String, Pieza> piezasSubasta =  piezasController.consultarPiezasSubasta();
				for (Map.Entry<String, Pieza> entry : piezasSubasta.entrySet()) {
					String key = entry.getKey();
					Pieza value = entry.getValue();
					System.out.println("- " + value.getTitulo() + "," + value.getAutor());
					
				}
					break;
				case 3:
					System.out.println("Opcion 3 seleccionada");
					HashMap<String, Pieza> piezasVenta =  piezasController.consultarPiezasVenta();
					for (Map.Entry<String, Pieza> entry : piezasVenta.entrySet()) {
						String key = entry.getKey();
						Pieza value = entry.getValue();
						System.out.println("- " + value.getTitulo() + "," + value.getAutor());
						
					}
						break;
				case 4:
					System.out.println("Opcion 4 seleccionada");
					vistaCrearPieza.mostraMenuCrearPieza();
						break;
				default:
				System.out.println("Opcion incorrecta!");
					break;
			}
		}
	}

}
