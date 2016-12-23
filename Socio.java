import java.util.Vector;

public class Socio {

	private String nombreusuario;
	private String nombrereal;
	private String contrasenia;
	private String nacionalidad;

	public Socio(String nombreusuario, String nombrereal, String contrasenia, String nacionalidad) {
            this.nombreusuario=nombreusuario;
            this.nombrereal=nombrereal;
            this.contrasenia=contrasenia;
            this.nacionalidad=nacionalidad;         
	}

	public void getContraseña() {
		// TODO - implement Socio.getContraseña
		throw new UnsupportedOperationException();
	}

	public void getNombreusuario() {
		// TODO - implement Socio.getNombreusuario
		throw new UnsupportedOperationException();
	}

	public static Socio read(String login, String password) throws Exception{
		String l,g;
		Socio u = null;
		Vector<Object> aux = null;
		String SQL_Consulta = "SELECT nombreusuario, contrasenia FROM Socio WHERE login = '"+login+"' AND pass = '"+password+"';";
		
		Agente a = Agente.getAgente();
		Vector<Object> res = a.select(SQL_Consulta);
		
		if (res.size() == 1){
			aux = (Vector<Object>) res.elementAt(0);
			u = new Socio((String) aux.elementAt(0), (String) aux.elementAt(1), (String) aux.elementAt(2), (String) aux.elementAt(3));
		}
		return u;
	}
	
	//Inserción de un nuevo usuario en la base de datos
	public int insert() throws Exception{
		/*Debe implementarse la l�gica para insertar el contenido de un objeto usuario en la base de datos
		 *Los objetos de la capa de dominio se comunican con el agente para enviarle sus peticiones
		 *AYUDA1: la consulta para realizar la inserci�n es la siguiente
		 * "INSERT INTO usuario VALUES('"+this.mLogin+"','"+this.mPassword+"');"
		 *AYUDA2: Del mismo modo que para consultar la informaci�n, el agente provee de un m�todo "select",
		 *para hacer una inserci�n el agente provee de un m�todo "insert"
		 */
		String SQL_Consulta = "INSERT INTO usuario VALUES('"+this.nombreusuario+"','"+this.contrasenia+"','"+this.nombrereal+"','"+this.nacionalidad+"');";		
		Agente a = Agente.getAgente();
		return a.insert(SQL_Consulta);
	}

}
