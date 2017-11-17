/**
 * 
 */
package tarea03;

/**
 * @author crosanom
 *
 */

// Crear la clase Posición

public class Posicion {

	/*
	 * Atributos de la clase privados podremos acceder a los mismos con los
	 * metodos get y set.
	 * 
	 */

	private int fila;
	private char columna;

	// Constructor por defecto

	public Posicion() {

	}

	/**
	 * Crea un constructor para esta clase que acepte como parámetros la fila y
	 * la columna y que los asigne a los atributos si son correctos (las filas
	 * van del 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambos
	 * inclusive-) y si no le ponga un valor por defecto (1 para fila
	 * incorrecta, 'a' para columna incorrecta) e informe de dicho problema. Haz
	 * un commit.
	 */
	// Sobrecarga de constructor Posición, ahora acepta como parámetros filas y
	// columnas

	public Posicion(int fila, char columna) { //
		/**
		 * Crea un constructor para esta clase que acepte como parámetros la
		 * fila y la columna y que los asigne a los atributos si son correctos
		 * (las filas van del 1 al 8 -ambos inclusive- y las columnas de la 'a'
		 * a la 'h' -ambos inclusive-) y si no le ponga un valor por defecto (1
		 * para fila incorrecta, 'a' para columna incorrecta) e informe de dicho
		 * problema. Haz un commit.
		 */
		// validamos la entrada de filas con un if-else

		if (fila < 1 || fila > 8) {
			this.fila = fila; // que diferencia hay entre fila y this.fila ? 
		} else {
			this.fila = 1; 
		}


		// validamos la entrada de columnas con un switch


switch ( columna) {
	
	case 'a':
		this.columna=columna;
		break;
	case 'b':
		this.columna=columna;
		break;
	case 'c':
		this.columna=columna;
		break;
	case 'd':
		this.columna=columna;
	break;
	case 'e':
		this.columna=columna;
		break;
	case 'f':
		this.columna=columna;
		break;
	case 'g':
		this.columna=columna;
		break;
	case 'h':
		this.columna=columna;
		break;
	default :
		this.columna='a';
		break;
	}// cierre de switch
	
		
         
			
			
		}
		
		

	}

