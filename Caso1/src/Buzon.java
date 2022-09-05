import java.util.List;
import java.util.LinkedList;

public class Buzon {

	private List<String> buzon;
	private int size;

	public Buzon(int size ) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.buzon = new LinkedList<String>();


	}

	public synchronized boolean lleno()
	{
		return this.buzon.size()>0;
	}

	public synchronized void recibirMensaje(String mensaje)
	{
		while (this.buzon.size()==this.size) {
			try {
				wait();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}


		}
		this.buzon.add(mensaje);
		notify();
	}

	public synchronized String enviarMensaje()
	{
		while (this.buzon.size()==0) {
			try {
				wait();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}


		}
		String mensaje = this.buzon.remove(0);
		notify();
		return mensaje;

	}

}
