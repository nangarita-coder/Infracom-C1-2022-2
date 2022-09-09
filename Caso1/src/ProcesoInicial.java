import java.util.Iterator;
import java.util.List;

public class ProcesoInicial extends Thread {
	private int id;
	private Buzon buz;
	private int mensajes;
	

	public ProcesoInicial( int id , Buzon buz, int mensajes ) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.buz = buz;
		this.mensajes = mensajes;
		
	
	}
	
	private void enviar(String mensaje)
	{
		this.buz.recibirMensaje(mensaje);
	}
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < mensajes; i++) {
			
			this.enviar("M1");
			
		}
	}
}
