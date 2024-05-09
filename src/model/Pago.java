package model;

	public class Pago {

		private double Monto;
		private String FormaPago;
		private String Transacción;
		
	    public Pago(double Monto, String FormaPago, String Transacción) {
		
			this.Monto = Monto;
			this.FormaPago = FormaPago;
			this.Transacción = Transacción;
			
		}

	    public double getMonto() {
			return Monto;
		}

	    public void setMonto(double Monto) {
			this.Monto = Monto;
	    }

		public void setFormaPago(String FormaPago) {
			this.FormaPago = FormaPago;
	    }

	    public String getFormaPago() {
			return FormaPago;
		}

		public void setTransacción(String Transacción) {
			this.Transacción = Transacción;
	    }

	    public String getTransacción() {
			return Transacción;
		}

		
	}