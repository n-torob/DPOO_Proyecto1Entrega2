package Galeria;

import java.util.ArrayList;

public class Propietario_Artista {
	
	private String informacionContacto;
	private ArrayList<String> listaPiezas = new ArrayList<>();

	public Propietario_Artista(String informacionContacto, ArrayList<String> listaPiezas) {
		
		this.informacionContacto = informacionContacto;
		this.listaPiezas = listaPiezas;
		
	}

	public String getInformacionContacto() {
		return informacionContacto;
	}

	public void setInformacionContacto(String informacionContacto) {
		this.informacionContacto = informacionContacto;
	}

	public ArrayList<String> getListaPiezas() {
		return listaPiezas;
	}

	public void setListaPiezas(ArrayList<String> listaPiezas) {
		this.listaPiezas = listaPiezas;
	}
}
