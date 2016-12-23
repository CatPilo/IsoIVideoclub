public class Alquiler {

	private int alquiler_id;
	private int film_id;
	private date fechain;
	private date fechafin;
	private double costetotal;

	public Alquiler(int alquiler_id) {
		// TODO - Comprobar en la base de datos que el alquiler es valido,
		// y obtener sus datos (film_id, fechain, fechafin, costetotal)
		this.alquiler_id = alquiler_id;
	}

	public String getData() {
		// TODO - Mostrar el resto de los datos
	    return Integer.toString(alquiler_id);
	}

	public int getFilm_id() {
		return film_id;
	}

}
