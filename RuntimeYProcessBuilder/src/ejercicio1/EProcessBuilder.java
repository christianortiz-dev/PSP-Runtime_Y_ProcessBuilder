package ejercicio1;

import java.io.IOException;

public class EProcessBuilder {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] ejecutarNotepad = {
            "notepadqq"
        };

        ProcessBuilder pb = new ProcessBuilder(ejecutarNotepad);
        pb.start();
    }

}
