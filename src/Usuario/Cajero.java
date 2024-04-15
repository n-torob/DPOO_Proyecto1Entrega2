package Usuario;



public class Cajero {

	private String Id;
	
	private String metodoPago;
	
	public boolean registrarPago(String nombreUsuario, float costo) {
		
		usuario balance = new usuario(nombreUsuario);
		
		balance.getBalance();
		
		if (balance < costo ) {
			
		}
		
		else {
			
		}
		
		
		
	}
	
	
	
	
	
}
