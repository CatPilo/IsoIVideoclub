public class Cuenta_banco {

	private String nombre;
	private int numerocuenta;
	private double saldo;
	private Socio socio;

	public Cuenta_banco(Socio socio) {
		this.socio = socio;
		// Todo - consultar a la bbdd para obtener datos de cuenta
		// a partir de datos del socio.
		this.numerocuenta = 1234;
		this.saldo = 23.2;
	}
	
	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

}
