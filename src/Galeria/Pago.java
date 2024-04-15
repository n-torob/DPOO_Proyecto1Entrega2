package Galeria;
import java.util.Random;

public class Pago {

	private double monto;
	private String formaPago;
	private String detalleTransaccion;
	
	public Pago(double monto, String formaPago, String detalleTransaccion) {
		
		this.detalleTransaccion = detalleTransaccion;
		this.formaPago = formaPago;
		this.monto = monto;
	} 
	
	public double getMonto() {
		return monto;
	}
	
	public String getFormaPago() {
		return formaPago;
	}
	
	public String getDetalleTransacion() {
		return detalleTransaccion;
	}
}
