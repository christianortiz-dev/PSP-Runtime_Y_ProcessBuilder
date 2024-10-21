package ejercicio3;

import java.io.IOException;

public class EProcessBuilder {

    public static void main(String[] args) {

        try {

            ProcessBuilder builder = new ProcessBuilder("ping", "-c", "4", "www.google.com");
            Process proceso = builder.start();
            
            proceso.getInputStream().transferTo(System.out);            

            int estadoSalida = proceso.waitFor();
            System.out.println("Salida del proceso: " + estadoSalida);
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
