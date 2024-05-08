package view;

import java.util.HashMap;
import java.util.Map;

import controller.PiezasController;
import dataReaders.PiezaReader;
import model.Pieza;
import model.Roles;
import util.Input;

public class MainCliente {
	
	private static String ruta = "./src/data/";

	private PiezasController piezasController = new PiezasController();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PiezaReader piezaReader = new PiezaReader();
		MainCliente vista  =new MainCliente();
		try {
           	Integer nPiezas = piezaReader.cargarInformacionPiezas(ruta);
			System.out.println("Se cargaron " + nPiezas + " piezas");
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
        System.out.println("1. ver lista de piezas");
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
					break;
			
				default:
				System.out.println("Opcion incorrecta!");
					break;
			}
		}
	}

}
