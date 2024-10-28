package ejercicio1;

import java.util.Scanner;

public class TransformadorSRTaXML {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ruta;
		
		System.out.println("Dime la ruta completa y el nombre del archivo .srt");
		ruta = sc.nextLine();
		
		MetodoTransformador t = new MetodoTransformador();
		t.transformarSRT(ruta);
		
		
		
	}
	
}
