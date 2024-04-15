package Galeria;

public class comprador extends Usuario{
	
	private double valorInicial;
	private double limiteCompra;
	
	public comprador(double valorInicial, double limiteCompra,String nombre, String logIn, String password, String rol, String informacionContacto) {
		
		super(nombre, logIn, password, rol, informacionContacto);
		this.valorInicial = valorInicial;
		this.limiteCompra = limiteCompra;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getLimiteCompra() {
		return limiteCompra;
	}

	public void setLimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}
}
