package Galeria;



public class Cajero extends Usuario {

	private String Id;
	
	private String metodoPago;
	
	public Cajero(String Id, String metodoPago){
		
		this.Id = Id;
		this.metodoPago = metodoPago;
	}
	
	public boolean registrarPago(String nombreUsuario, double costo) {
		
		comprador  LimiteCompra = new comprador();
		
		LimiteCompra.getLimiteCompra();
		
		if (LimiteCompra < costo ) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
		
		
	}
	
	
	
	
	
}
