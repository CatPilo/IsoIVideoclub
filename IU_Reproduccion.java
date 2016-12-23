public class IU_Reproduccion {

	private Socio socio;
	private Gestor_Reproduccion gestor;

	public IU_Reproduccion(Socio socio, Gestor_Reproduccion gestor) {
		// TODO - Initialize interface elements
		gestor = new Gestor_Reproduccion(socio);
	}
	
	public void clickAlquiler(int alquiler_id) {
		data = gestor.comprobarAlquiler(alquiler_id);
		// TODO - mostrar datos sobre el alquiler
		link = gestor.reproduccion();
		// TODO - empezar a reproducir el video desde el link
	}

	public void cancelar() {
		// TODO - implement IU_Reproduccion.cancelar
		throw new UnsupportedOperationException();
	}

}
