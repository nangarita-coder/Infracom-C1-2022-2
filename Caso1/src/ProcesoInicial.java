import java.util.Iterator;
import java.util.List;

public class ProcesoInicial extends Thread {
	private int id;
	private int N;
	private int M;
	private Buzon buz;
	private String mensaje;
	private List<String> mensajes;

	public ProcesoInicial( int id , Buzon buz, List<String> mensajes ) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.buz = buz;
		this.mensajes = mensajes;
		
	
	}
	
	private void enviar(String mensaje)
	{
		this.buz.recibirMensaje("M1");
	}
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < mensajes.size(); i++) {
			String actual = mensajes.get(i);
			this.enviar(actual);
			
		}
	}
}
