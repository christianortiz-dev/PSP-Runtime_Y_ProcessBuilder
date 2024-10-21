package ejercicio5;

import java.io.IOException;
import java.io.InputStream;

public class ERuntime {

    public static void main(String[] args) {

        try {

            String[] comando = {"/bin/sh", "-c", "ls"};
            
            Process proceso = Runtime.getRuntime().exec(comando);
            
            InputStream inputStream = proceso.getInputStream();
            inputStream.transferTo(System.out);

            int estadoSalida = proceso.waitFor();
            System.out.println("\nSalida del proceso: " + estadoSalida);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
