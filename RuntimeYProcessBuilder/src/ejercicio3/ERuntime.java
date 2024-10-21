package ejercicio3;

import java.io.IOException;
import java.io.InputStream;

public class ERuntime {

    public static void main(String[] args) {

        try {
            String[] comando = {"ping", "-c", "4", "www.google.com"};
            
            Process proceso = Runtime.getRuntime().exec(comando);
            
            InputStream inputStream = proceso.getInputStream();
            inputStream.transferTo(System.out);

            int estadoSalida = proceso.waitFor();
            System.out.println("Salida del proceso: " + estadoSalida);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
