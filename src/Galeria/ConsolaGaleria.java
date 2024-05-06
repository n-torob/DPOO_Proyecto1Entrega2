package Galeria;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ConsolaGaleria {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ConsolaGaleria consola = new ConsolaGaleria();
		consola.ejecutarOpcion();
	}
		
		public void ejecutarOpcion() throws FileNotFoundException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		sistema sis = new sistema();
	    boolean salir = false;
	    


	    while (!salir) {
	    	try {
	    		
	    	
		    sis.cargarInformacionCuentas();

	    	System.out.println("Bienvenido a la galería de arte. Por favor, elige una opción:");
	        System.out.println("1. Ingresar");
	        System.out.println("2. Crear Cuenta");
	        System.out.println("3. Salir");
	        System.out.print("Opción: ");

	        int opcion = scanner.nextInt();
	        scanner.nextLine();

	        switch (opcion) {
	            case 1:
	               System.out.println("Nombre de Usuario: ");
	               String nombreUsuario = scanner.nextLine();
	               
	               System.out.println("Contraseña: ");
	               String contraseña = scanner.nextLine();
	               
	               System.out.println("ROL: ");
	               String ROL = scanner.nextLine();
	               
	               System.out.println("iniciando sesión");
	               
	               break;
	            case 2:
		            System.out.println("Nombre : ");
		            String crearNombre = scanner.nextLine();
		            
		            System.out.println("Log In: ");
		            String crearLogIn = scanner.nextLine();

		              
		            System.out.println("password: ");
		            String crearpassword = scanner.nextLine();
		              
		            System.out.println("ROL: ");
		            String crearROL = scanner.nextLine();
		            
		            System.out.println("Información De Contacto: ");
		            String crearInformacionContacto = scanner.nextLine();
		               
		            System.out.println("Cuenta Creada");
		            
		            
		            sis.crearCuenta(crearNombre,crearLogIn, crearpassword, crearROL, crearInformacionContacto);
		               
		               break;
	            case 3:
	            	System.out.println("Mostrando piezas en subasta...");
		               // Aquí iría la lógica para mostrar piezas en subasta
		               break;
	            default:
	                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
	                break;
	          }
	       } catch (NumberFormatException e) {
               System.out.println("Debe seleccionar uno de los números de las opciones.");
	    }
	    
//	      scanner.close();
	      
	    }	
	}
        
}
        


