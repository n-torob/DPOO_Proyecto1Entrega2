package view;

import controller.UsuarioController;
import view.LogIn;
import java.util.HashMap;
import java.util.Map;

import dataReaders.UsuarioReader;
import model.Pieza;
import model.Roles;
import model.Usuario;
import util.Input;
import controller.PiezasController;
import dataReaders.PiezaReader;
import model.Estado;
import controller.EmpleadoController;


public class MainEmpleado {
    
    private static String ruta = "./src/data/";
    private UsuarioController usuarioController = new UsuarioController();
    private PiezasController piezasController = new PiezasController();

    public static void main(String[] args) {
        MainEmpleado vista = new MainEmpleado();
        
        UsuarioReader usuarioReader = new UsuarioReader();
        PiezaReader piezaReader = new PiezaReader();
        try {
            Integer nUsuarios = usuarioReader.cargarInformacionCuentas(ruta);
            System.out.println("Se cargaron " + nUsuarios + " usuarios");
            Integer nPiezas = piezaReader.cargarInformacionPiezas(ruta);
            System.out.println("Se cargaron " + nPiezas + " piezas");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        LogIn logIn = new LogIn();
        boolean inicioSesionExitoso = logIn.mostrarLogIn(Roles.EMPLEADO);
        if (inicioSesionExitoso) {
            vista.ejecutarOpciones();
        }
    }

    private  void mostrarOpciones() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. ver lista de usuarios");
        System.out.println("2. ver lista de piezas");
        System.out.println("3. ver piezas en subasta");
        System.out.println("4. ver piezas en exhibición");
        System.out.println("5. ver piezas en bodega");
        System.out.println("5. registrar pago");
        System.out.println("7. salir");
    }

    private void ejecutarOpciones(){
        boolean continuar = true;
        while (continuar) {
            mostrarOpciones();
            Integer opcionSeleccionada = Integer.parseInt( Input.input("Ingrese opcion :"));
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("ver lista de usuarios");
                    HashMap<String, Usuario> usuarios = this.usuarioController.consultarUsuarios();
                    for (Usuario usuario:usuarios.values()){
                        System.out.println(usuario.getNombre());
                    }
                    break;
            
                case 2:
                    System.out.println("Lista de nombres de piezas:");
                    //List<String> nombresPiezas = PiezasController.listarNombresDePiezas();
                    //nombresPiezas.forEach(System.out::println); // Imprime cada nombre en una nueva línea
                    HashMap <String, Pieza> piezas = piezasController.consultarPiezas();
                    for (Pieza pieza:piezas.values()){
                        System.out.println(pieza.getTitulo());
                    }
                    break;
            
                case 3:
                    System.out.println("Lista de piezas en subasta:");
                    HashMap<String, Pieza> piezasSubasta =  piezasController.consultarPiezasSubasta();
                    for (Map.Entry<String, Pieza> entry : piezasSubasta.entrySet()) {
                        String key = entry.getKey();
                        Pieza value = entry.getValue();
                        System.out.println("- " + value.getTitulo() + "," + value.getAutor());
					
				    }
                    break;
            
                case 4:
                    System.out.println("Lista de piezas en exhibición:");
                    HashMap<String, Pieza> piezasExhibicion =  piezasController.consultarPiezasExhibicion();
                    for (Map.Entry<String, Pieza> entry : piezasExhibicion.entrySet()) {
                        String key = entry.getKey();
                        Pieza value = entry.getValue();
                        System.out.println("- " + value.getTitulo() + "," + value.getAutor());
					
				    }
                    break;
            
                case 5:
                    System.out.println("Lista de piezas en bodega:");
                    HashMap<String, Pieza> piezasBodega =  piezasController.consultarPiezasSubasta();
                    for (Map.Entry<String, Pieza> entry : piezasBodega.entrySet()) {
                        String key = entry.getKey();
                        Pieza value = entry.getValue();
                        System.out.println("- " + value.getTitulo() + "," + value.getAutor());
					
				    }
                    break;
				// ...

				case 6:
					System.out.println("Registrar pago");
					String email = Input.input("Ingrese el email del usuario:");
					Double monto = Double.parseDouble(Input.input("Ingrese el monto del pago:"));
					String formaPago = Input.input("Ingrese forma de pago:");
					String transaccion = Input.input("Ingrese estado de la transacción:");
					HashMap<Usuario, Double> pagos = new EmpleadoController.registrarPago(email, monto, formaPago, transaccion);
					for (Map.Entry<Usuario, Double> entry : pagos.entrySet()) {
						Usuario key = entry.getKey();
						Double value = entry.getValue();
						System.out.println("- " + key.getNombre() + "," + value);
					}
					break;
            
                case 7:
                    System.out.println("adios!");
                    continuar=false;
                    break;
            
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }
        }
    }


}

