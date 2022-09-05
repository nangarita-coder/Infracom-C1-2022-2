
public class Proceso extends Thread {
	private int id;
	private int N;
	private int M;
	private Buzon buz;
	private String mensaje;

	public Proceso( int id , Buzon buz) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.buz = buz;
		
	}
	private void enviar(String mensaje)
	{
		this.buz.recibirMensaje(mensaje + "T"+ N + M );
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
