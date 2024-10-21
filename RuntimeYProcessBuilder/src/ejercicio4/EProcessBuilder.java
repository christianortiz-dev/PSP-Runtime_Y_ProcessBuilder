package ejercicio4;

import java.io.IOException;

public class EProcessBuilder {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] ejecutarNotepad = {
            "notepadqq"
        };
        
 
        ProcessBuilder pb = new ProcessBuilder(ejecutarNotepad);
        Process proceso = pb.start();

        int estadoSalida = proceso.waitFor();
        
        if (estadoSalida == 0) {
            System.out.println("La ejecución del programa ha sido exitosa");
        } else {
            System.out.println("La ejecución del programa ha fallado");
        }

        // System.out.println(estadoSalida);
    }

}
