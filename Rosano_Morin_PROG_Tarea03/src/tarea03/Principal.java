package tarea03;

import utilidades.Entrada;

public class Principal {

	static String colorElegido ="";
	static Rey miFicha;
	//static Color color = null;
	static int opcion ;
	//static Direccion direccion = null;	
	
	public static void main(String[] args) {

		
		 //* validar que el usuario introduce correctamente el color ahora mismo
		 // no me funciona la validación

		
		/**
		 * Pedir color por teclado.
		 * Crear ficha.
		 * Menu de mover ficha hasta salir.
		 * Mostrar en pantalla movimientos.
		 */
		
		
		System.out.println("Que color vas a jugar? Blanco o Negro?");
		colorElegido = Entrada.cadena();
		
		// Crear ficha del color elegido.
		miFicha = new Rey(Color.valueOf(colorElegido));
				
		do {
		
			System.out.println("Elige opción:"
							+ "\n1.- Norte" +
					   	      "\n2.- Sur"   +
							  "\n3.- Este"  +
							  "\n4.- Oeste" +
							  "\n0.- Salir");
			
			//Recoger un entero por consola
			opcion = Entrada.entero(); 

			//Ejemplo de switch case en Java
			switch(opcion){
			case 1: 
				miFicha.mueve(Direccion.NORTE);
				break;
			case 2:
				miFicha.mueve(Direccion.SUR);
				break;
			case 3:
				miFicha.mueve(Direccion.ESTE);
				break;
			case 4:
				miFicha.mueve(Direccion.OESTE);
				break;
			default:
				break;
				
			}
			
		} while (opcion != 0) ;
		
		
			
	}// main

}
// fin class
