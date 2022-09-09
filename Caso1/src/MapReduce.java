import java.util.List;
import java.util.Scanner;


public class MapReduce extends Thread
{
	private final static int N = 3;
	private static List<String> mensajes;


	public MapReduce ( )
	{

	}

	public static boolean termino() {
		return true;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\tCaso 1\n");

		System.out.println("Ingrese la cantidad de subprocesso N que desea: ");
		int procesos = input.nextInt();

		System.out.println("Ingrese el size de los buzones: ");
		int intermedios = input.nextInt();

		System.out.println("Ingrese el tamanio de los buzones extremos e iniciales: ");
		int extremos = input.nextInt();

		BuzonExtremo buzonInicial = new BuzonExtremo(extremos);

		
		

		ProcesoInicial inicial = new ProcesoInicial(1,buzonInicial,procesos);
		inicial.start();


		while (ejecucion){
			Buzon buzonIntermedio = new Buzon(tamanioIntermedios);
			// Aca se crean los 3 threads que van a recibir los mensajes y por donde se van a transformar
			for (int i = 0; i < 3; i++){
				ProcesoProductorConsumidor primerosThreads = new ProcesoProductorConsumidor(buzonInicial,buzonIntermedio,i+1);
				System.out.println("Se creo el thread: " + (i+1));
				primerosThreads.start();
			}
		}

	}
}