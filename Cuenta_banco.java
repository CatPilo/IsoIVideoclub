import java.util.Vector;

public class Cuenta_banco {

	private String nombre;
	private int numerocuenta;
	private double saldo;
	private Socio socio;

	public Cuenta_banco(Socio socio) {
		this.socio = socio;
		// Todo - consultar a la bbdd para obtener datos de cuenta
		// a partir de datos del socio.
		this.numerocuenta = 1234;
		this.saldo = 23.2;
	}
	
	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) throws SaldoNotEnough {
		try {
			this.saldo = saldo;
			update();
		} catch (Exception e) {
			throw new SaldoNotEnough();
		}
	}
	
	public static int read(int numerocuenta) throws Exception{
			String l,g;
			int u = 0;
			Vector<Object> aux = null;
			String SQL_Consulta = "SELECT saldo FROM cuenta_banco WHERE numerocuenta = '"+String.valueOf(numerocuenta)+"';";
			
			Agente a = Agente.getAgente();
			Vector<Object> res = a.select(SQL_Consulta);
			
			if (res.size() == 1){
				aux = (Vector<Object>) res.elementAt(0);
				return (int) aux.elementAt(0);
			}
			return 0;
		}
	
	public int update() throws Exception{		
		String SQL_Consulta = "UPDATE cuenta_banco SET saldo='"+this.saldo+"' WHERE numerocuenta='"+numerocuenta+"');";		
		Agente a = Agente.getAgente();
		return a.insert(SQL_Consulta);
	}	      
}
