public class Gestor_Reproducción {

	private Socio socio;
	private Alquiler alquiler;
	
	public Gestor_Reproducción(Socio socio) {
		this.socio = socio;
	}
	
	public int comprobarAlquiler(int alquiler_id) {
	    this.alquiler = new Alquiler(alquiler_id);
	    try {
	    	return alquiler.getData();
	    } catch (DataNotFound e){
	    		return -1;
	    }
	}

	public void obtenerEnlace() {
		// TODO - implement Gestor_Reproducción.obtenerEnlace
		throw new UnsupportedOperationException();
	}

	public String reproduccion(int film_id) {
		Enlace enlace = new Enlace(film_id);
	    return enlace.getEnlace();
	}

	public void DaranotFound() {
		// TODO - implement Gestor_Reproducción.DaranotFound
		throw new UnsupportedOperationException();
	}

}
