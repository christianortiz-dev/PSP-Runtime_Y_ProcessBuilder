package ejercicio2;

import java.io.IOException;

public class EProcessBuilder {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] ejecutarNotepad = {
            "firefox",
            "www.google.com"
        };
        
        ProcessBuilder pb = new ProcessBuilder(ejecutarNotepad);
        Process proceso = pb.start();

	        int estadoSalida = proceso.waitFor();
	        System.out.println(estadoSalida);
    }

}
