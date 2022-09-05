import java.util.Iterator;
import java.util.List;

public class Proceso extends Thread {
	private int id;
	private int N;
	private int M;
	private Buzon buz1;
	private Buzon buz2;
	private String mensaje;
	private List<String> mensajes;

	public Proceso( int id , Buzon buzEntrada, Buzon buzSalida) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.buz1 = buzEntrada;
		this.buz2 = buzSalida;
	}
	
	private void imprimir(String mensaje)
	{
		String prot = "El porceso con id "+ id +" recibio el mensaje "+mensaje;
		System.out.println(prot);
	}
	
	private void enviar(String mensaje)
	{
		this.buz2.recibirMensaje(mensaje + "T"+ N + M );
	}
	@Override
	public void run() {
		
		while (MapReduce.termino()) {
			type type = (type) en.nextElement();
			
		}
	}
}
