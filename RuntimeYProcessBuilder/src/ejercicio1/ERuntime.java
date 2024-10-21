package ejercicio1;

import java.io.IOException;

public class ERuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		String [] ejecutarNotepad = {
				"notepadqq"	
		};
		
		Runtime.getRuntime().exec(ejecutarNotepad);
	}

}