import java.util.Vector;

public class BBDD {

	public static String findEnlace(int film_id) throws Exception {
			String l,g;
			String u = null;
			Vector<Object> aux = null;
			String SQL_Consulta = "SELECT enlaceencriptado FROM enlaces WHERE id = '"+film_id+"';";
			
			Agente a = Agente.getAgente();
			Vector<Object> res = a.select(SQL_Consulta);
			
			if (res.size() == 1){
				aux = (Vector<Object>) res.elementAt(0);
				return (String) aux.elementAt(1);
			}
			return u;
		}
	}