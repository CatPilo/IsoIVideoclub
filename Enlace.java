import java.util.Vector;

public class Enlace {

	private String enlaceEncriptado;
    private String enlacedesEncriptado;
    private int film_id;

    public String desencriptarEnlace(String link) {
		// TODO: Implementar descifrado.
    	return link;
    }

	public Enlace(int film_id) {
		this.film_id = film_id;
	}

	public void notFound() {
		// TODO - implement Enlace.notFound
		throw new UnsupportedOperationException();
	}

	public String getEnlace() {
		try {
			return desencriptarEnlace(BBDD.findEnlace(film_id));
		} catch (Exception e) {
			return null;
		}
	}
}
