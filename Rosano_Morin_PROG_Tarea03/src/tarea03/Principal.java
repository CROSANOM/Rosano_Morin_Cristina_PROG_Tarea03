package tarea03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

public class Principal {

	public static void main(String[] args) {

		String colorRey;

		/*
		 * validar que el usuario introduce correctamente el color ahora mismo
		 * no me funciona la validación do {
		 * 
		 * System.out.println("INTRODUCE color "); color = Entrada.cadena();
		 * 
		 * // Mensaje recordartorio de entrada. if (color !="blanco" ||
		 * color!="negro") {
		 * System.out.println("error rey solo puede ser Blanco o Negro"); }
		 * 
		 * } while (color !="blanco" || color!="negro");
		 */


		
		System.out.println("Dame un color para el rey ");
		colorRey = Entrada.cadena();
		// String colorIncorrecto;

		Pattern pat = Pattern.compile("(blanco|Negro)+");
		Matcher mat = pat.matcher(colorRey);
		if (mat.matches()) {
			System.out.println("COLOR ES CORRECTO");

		
		} else { // deberia de haber usado un do while pero no daba con la
					// tecla.
			System.out.println("COLOR ES INCORRECTO");
			System.out.println("RECUERDA QUE el color del Rey puede ser blanco o negro");
			System.out.println("Dame un color para el rey");
			colorRey = Entrada.cadena();
		}

		
		// Crear un rey usando el constructor de la clase Rey
		
		System.out.println("comprobar en que parte del codigo se sale");
		
		Rey miFiguraRey =new Rey ();
		miFiguraRey.getColor();
		System.out.println("el rey es"+miFiguraRey.color);
		

		
		
		

	}// main

}
// fin class
