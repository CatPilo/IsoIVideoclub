import java.util.Date;
import java.util.Vector;

public class Alquiler {

	private int alquiler_id;
	private Date fechain;
	private Date fechafin;
	private double costetotal;

	public Alquiler(int alquiler_id) {
		// TODO - Comprobar en la base de datos que el alquiler es valido,
		// y obtener sus datos (film_id, fechain, fechafin, costetotal)
		this.alquiler_id = alquiler_id;
	}

	public int getData() throws DataNotFound {
		// TODO - Mostrar el resto de los datos
        try {
    	   return read(alquiler_id);
        } catch (Exception e) {
        	throw new DataNotFound();
        }
	}
	public static int read(int alquiler_id) throws Exception{
		String l,g;
		int u = 0;
		Vector<Object> aux = null;
		String SQL_Consulta = "SELECT idfilm FROM alquiler WHERE id = '"+String.valueOf(alquiler_id)+"';";
		
		Agente a = Agente.getAgente();
		Vector<Object> res = a.select(SQL_Consulta);
		
		if (res.size() == 1){
			aux = (Vector<Object>) res.elementAt(0);
			u=(int)aux.elementAt(0);
		}
		return u;
	}
       
}

