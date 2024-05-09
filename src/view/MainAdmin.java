package view;

import controller.UsuarioController;
import view.LogIn;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataReaders.UsuarioReader;
import model.Roles;
import model.Usuario;
import util.Input;
import controller.PiezasController;
import dataReaders.PiezaReader;

public class MainAdmin {
    
    private static String ruta = "./src/data/";
    private UsuarioController usuarioController = new UsuarioController();

    public static void main(String[] args) {
        MainAdmin vista = new MainAdmin();
        
        UsuarioReader usuarioReader = new UsuarioReader();
        try {
            Integer nUsuarios = usuarioReader.cargarInformacionCuentas(ruta);
            System.out.println("Se cargaron " + nUsuarios + " usuarios");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        LogIn logIn = new LogIn();
        boolean inicioSesionExitoso = logIn.mostrarLogIn(Roles.ADMINISTRADOR);
        if (inicioSesionExitoso) {
            vista.ejecutarOpciones();
        }
    }

    private  void mostrarOpciones() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. ver lista de usuarios");
        System.out.println("2. ver lista de piezas");
        System.out.println("3. ver piezas bloquedas");
        System.out.println("4. ver piezas en subasta");
        System.out.println("5. ver piezas en exhibición");
        System.out.println("6. ver piezas en bodega");
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
                    break;
            
                case 2:
                    System.out.println("Lista de nombres de piezas:");
                    List<String> nombresPiezas = PiezasController.listarNombresDePiezas();
                    nombresPiezas.forEach(System.out::println); // Imprime cada nombre en una nueva línea
                    break;
            
                case 3:
                    System.out.println("Lista de piezas bloqueadas:");
<<<<<<< HEAD
<<<<<<< HEAD
                    HashMap<String, Pieza> piezasSubasta =  piezasController.consultarPiezasSubasta();
                    for (Map.Entry<String, Pieza> entry : piezasSubasta.entrySet()) {
                        String key = entry.getKey();
                        Pieza value = entry.getValue();
                        System.out.println("- " + value.getTitulo() + "," + value.getAutor());
                    }
=======
                    List<String> piezasBloqueadas = PiezasController.listarPiezasBloqueadas();
                    piezasBloqueadas.forEach(System.out::println);
>>>>>>> parent of 9712d74 (usuario)
=======
                    List<String> piezasBloqueadas = PiezasController.listarPiezasBloqueadas();
                    piezasBloqueadas.forEach(System.out::println);
>>>>>>> parent of 9712d74 (usuario)
                    break;

                case 4:
                    System.out.println("Lista de piezas en subasta:");
                    List<String> piezasSubasta = PiezasController.listarPiezasEnSubasta();
                    piezasSubasta.forEach(System.out::println);
                    break;
            
                case 5:
                    System.out.println("Lista de piezas en exhibición:");
                    List<String> piezasExhibicion = PiezasController.listarPiezasEnExhibicion();
                    piezasExhibicion.forEach(System.out::println);
                    break;
            
                case 6:
                    System.out.println("Lista de piezas en bodega:");
                    List<String> piezasBodega = PiezasController.listarPiezasEnBodega();
                    piezasBodega.forEach(System.out::println);
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

