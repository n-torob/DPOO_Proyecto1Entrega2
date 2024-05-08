package controller;

import java.util.HashMap;
import java.util.List;

import dataReaders.PiezaReader;
import model.Pieza;

public class PiezasController {
    
	public HashMap<String, Pieza> consultarPiezas(){
        HashMap<String, Pieza> piezas = PiezaReader.piezas;
        return piezas;
    }

    public static List<String> listarNombresDePiezas() {
        return PiezaReader.leerNombresDePiezas();
    }

    public static List<String> listarPiezasBloqueadas() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public static List<String> listarPiezasEnsubasta() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public static List<String> listarPiezasEnExhibicion() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public static List<String> listarPiezasEnbodega() {
        return PiezaReader.listarPiezasBloqueadas();
    }

}
