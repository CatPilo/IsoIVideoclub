public class Gestor_Pagos {

	private Socio socio;
	private Cuenta_banco cuenta;

	public Gestor_Pagos(Socio socio) {
		this.socio = socio;
	}

	public boolean peticionCobro(double coste) throws SaldoNotEnough {
	    if(comprobarSaldo(coste)) {
			cuenta.setsaldo(cuenta.getsaldo() - coste);
			return true;
		} else {
			return false;
		}
	}

	public boolean comprobarSaldo(double coste) {
	    return cuenta.getsaldo() >= coste;
	}

	public void login() {
		this.cuenta = new Cuenta_banco(socio);
	}

}
