package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	
	public static String input(String mensaje) {
		try {
			
			System.out.print(mensaje);
			BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
			return lector.readLine();
			
		} catch(IOException e) {
			
			System.out.println("error de lectura");
			e.printStackTrace();
			
		}
		
		return null;
	}

}
