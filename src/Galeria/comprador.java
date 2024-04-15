package Galeria;

public class comprador {
	
	private double valorInicial;
	private double limiteCompra;
	
	public comprador(double valorInicial, double limiteCompra) {
		
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
