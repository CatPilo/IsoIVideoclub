public class Gestor_Reproducción {

	private Socio socio;
	private Alquiler alquiler;
	
	public Gestor_Reproduccion(Socio socio) {
		this.socio = socio;
	}
	
	public String comprobarAlquiler(int alquiler_id) {
	    this.alquiler = new Alquiler(alquiler_id);
		return alquiler.getData();
	}

	public void obtenerEnlace() {
		// TODO - implement Gestor_Reproducción.obtenerEnlace
		throw new UnsupportedOperationException();
	}

	public Enlace reproduccion() {
		enlace Enlace = new Enlace(film_id);
	    return 
	}

	public void DaranotFound() {
		// TODO - implement Gestor_Reproducción.DaranotFound
		throw new UnsupportedOperationException();
	}

}
