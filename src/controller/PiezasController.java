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

    public List<String> listarNombresDePiezas() {
        return PiezaReader.leerNombresDePiezas();
    }

    public List<String> listarPiezasBloqueadas() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public List<String> listarPiezasEnsubasta() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public List<String> listarPiezasEnExhibicion() {
        return PiezaReader.listarPiezasBloqueadas();
    }

    public List<String> listarPiezasEnbodega() {
        return PiezaReader.listarPiezasBloqueadas();
    }

}
