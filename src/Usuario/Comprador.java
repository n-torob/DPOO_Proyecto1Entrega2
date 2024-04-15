package Usuario;
import java.util.*;


public class Comprador extends usuario {
	
	/** Lista de transacciones que ha hecho el usuario(Comprador) **/
	public ArrayList<Integer> compras; 
	
	/** Esta variable es la cantidad maxima de dinero que un usuario(Comprador) tiene para hacer cualquier tipo de transaccion **/
	public double limiteCompra;  
	
	public Comprador(String nombre) {
		
		super(nombre);
		
		this.compras = compras;
        
		this.limiteCompra = limiteCompra;
    }
	
	public void setCompra(Integer compra){
		
		Comprador.this.compras.add(compra);
		
	}
	
}
