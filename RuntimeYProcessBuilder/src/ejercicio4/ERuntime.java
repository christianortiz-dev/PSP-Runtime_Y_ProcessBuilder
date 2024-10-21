package ejercicio4;

import java.io.IOException;

public class ERuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		String [] ejecutarNotepad = {
				"notepadqq"	
		};
		
		Process proceso = Runtime.getRuntime().exec(ejecutarNotepad);

		int estadoSalida = proceso.waitFor();
		
		if (estadoSalida == 1) {
			System.out.println("La ejecución del programa ha sido exitosa");
		} else {
			System.out.println("La ejecución del programa ha fallado");
		}
//		System.out.println(estadoSalida);

	}

}
