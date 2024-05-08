package view;

import util.Input;
import controller.LogInController;
import model.Roles;

public class LogIn {
	private LogInController logInController = new LogInController();
	
	public Boolean mostrarLogIn(Roles rol) {
		
		boolean continuar = true;
		while (continuar) {
			
			String correo = Input.input("ingresar Correo ");
			String contrasena = Input.input("ingresar Contraseña: ");
			
			try {
				Boolean exito = logInController.login(correo, contrasena, rol);
				if (exito) {
					System.out.println("Bienvenido");
					continuar = false;
					return true;
				} else {
					System.out.println("Algo no esta bien, por favor intenta de nuevo");
					return false;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return false;
			}
			
		}
		return false;
		
	}

}