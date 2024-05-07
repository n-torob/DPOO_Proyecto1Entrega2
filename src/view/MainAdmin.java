package view;

import view.LogIn;

import java.io.FileNotFoundException;
import java.io.IOException;

import dataReaders.UsuarioReader;
import model.Roles;

public class MainAdmin {
	
	private static String ruta = "./src/data/";

	public static void main(String[] args) {
		MainAdmin vista = new MainAdmin();
		// TODO Auto-generated method stub
		
		UsuarioReader usuarioReader = new UsuarioReader();
		try {
			Integer nUsuarios = usuarioReader.cargarInformacionCuentas(ruta);
			System.out.println("Se cargaron " + nUsuarios + " usuarios");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		LogIn logIn = new LogIn();
		logIn.mostrarLogIn(Roles.ADMINISTRADOR);
		

	}

}

