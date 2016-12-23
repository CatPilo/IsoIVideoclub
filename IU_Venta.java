public class IU_Venta {

	public IU_Venta(Socio socio) {
		this.Socio = socio;
		mostrarVentas();
	}

	// Pruebas
	public void mostrarVentas() {
		Console co = System.console();
		while(true) {
			System.out.println("Ventas disponibles: ");
			System.out.println("1 - Coste: 1€");
			System.out.println("2 - Coste: 3€");
			System.out.println("Introduzca el numero de lo que le interese comprar: ");
			switch(co.readLine()) {
			case "1":
				clickVenta(1.0);
				break;
			case "2":
				clickVenta(3.0);
				break;
			default:
				System.out.println("No se ha seleccionado ninguna venta. Saliendo de la interfaz de ventas...");
				break;
			}
		}
	}
			
	public void clickVenta(double coste) {
	    Gestor_Pagos gestor = new Gestor_Pagos(socio);
		gestor.login();
		if(gestor.peticionCobro(coste)) {
			System.out.println("Transaccion realizada con exito");
		} else {
			System.out.println("Error en la transaccion: Saldo insuficiente");
		}
	}

	public void cancelar() {
		// TODO - implement IU_Venta.cancelar
		throw new UnsupportedOperationException();
	}

}
