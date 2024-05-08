package controller;

import java.util.HashMap;

import dataReaders.PiezaReader;
import model.Pieza;

public class PiezasController {
    
	public HashMap<String, Pieza> consultarPiezas(){
        HashMap<String, Pieza> piezas = PiezaReader.piezas;
        return piezas;
    }
}
