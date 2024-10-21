package ejercicio2;

import java.io.IOException;

public class ERuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		String [] ejecutarNotepad = {
				"firefox",
				"www.google.com"
			};
			
			Process proceso = Runtime.getRuntime().exec(ejecutarNotepad);

			int estadoSalida = proceso.waitFor();
			System.out.println(estadoSalida);
	}

}
