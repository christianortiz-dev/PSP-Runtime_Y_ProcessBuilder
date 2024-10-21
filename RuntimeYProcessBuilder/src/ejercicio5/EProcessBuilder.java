package ejercicio5;

import java.io.IOException;

public class EProcessBuilder {

    public static void main(String[] args) {

        try {
            ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "ls");
            Process proceso = pb.start();

            proceso.getInputStream().transferTo(System.out);

            int estadoSalida = proceso.waitFor();
            System.out.println("\nSalida del proceso: " + estadoSalida);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
