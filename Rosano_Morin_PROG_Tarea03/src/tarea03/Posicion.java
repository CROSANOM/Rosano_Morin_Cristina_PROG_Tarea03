/**
 * 
 */
package tarea03;

/**
 * @author crosanom
 *
 */

// Crear la clase Posici�n

public class Posicion {// clase inicio

	/*
	 * Atributos de la clase privados podremos acceder a los mismos con los
	 * metodos get y set.
	 * 
	 */

	private int fila;
	private char columna;

	// Constructor por defecto

	public Posicion() {// constructor inicio

	}// cierre constructor

	/**
	 * Crea un constructor para esta clase que acepte como par�metros la fila y
	 * la columna y que los asigne a los atributos si son correctos (las filas
	 * van del 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambos
	 * inclusive-) y si no le ponga un valor por defecto (1 para fila
	 * incorrecta, 'a' para columna incorrecta) e informe de dicho problema. Haz
	 * un commit.
	 */
	// Sobrecarga de constructor Posici�n, ahora acepta como par�metros filas y
	// columnas

	public Posicion(int fila, char columna) { // constructor parametros
		/**
		 * Crea un constructor para esta clase que acepte como par�metros la
		 * fila y la columna y que los asigne a los atributos si son correctos
		 * (las filas van del 1 al 8 -ambos inclusive- y las columnas de la 'a'
		 * a la 'h' -ambos inclusive-) y si no le ponga un valor por defecto (1
		 * para fila incorrecta, 'a' para columna incorrecta) e informe de dicho
		 * problema. Haz un commit.
		 */

		// creamos una variable que guarde el mensaje de error en caso se
		// introduzca erroneamente los parametros

		String mensajeColumna = "Ha introducido un caracter fuera del rango permitido a-h por tanto la columna sera a";
		String mensajeFila = "Ha introducido un valor fuera del rango permitido 1-8 por tanto la fila sera 1";

		// validamos la entrada de filas con un if-else

		if (fila < 1 || fila > 8) {
			this.fila = fila; // que diferencia hay entre fila y this.fila ?
		} else {
			this.fila = 1;
			mensajeFila = mensajeFila;
		}

		/*
		 * validamos la entrada de columnas con un switch, tambi�n se podr�a
		 * hacer con una expresion regular
		 */

		switch (columna) {// inicio switch

		case 'a':
			this.columna = columna;
			break;
		case 'b':
			this.columna = columna;
			break;
		case 'c':
			this.columna = columna;
			break;
		case 'd':
			this.columna = columna;
			break;
		case 'e':
			this.columna = columna;
			break;
		case 'f':
			this.columna = columna;
			break;
		case 'g':
			this.columna = columna;
			break;
		case 'h':
			this.columna = columna;
			break;
		default:
			this.columna = 'a';
			mensajeColumna = mensajeColumna;
			break;
		}

	}

	// crear metodos get y set para acceso a los atributos

	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * @param fila
	 *            the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	/**
	 * @return the columna
	 */
	public char getColumna() {
		return columna;
	}

	/**
	 * @param columna
	 *            set
	 * 
	 */
	public void setColumna(char columna) {
		this.columna = columna;
	}

	/**
	 * Crea un m�todo llamado toString que devolver� un String y ser� la
	 * representaci�n de la fila y la columna usando el atajo de eclipse. 
	 */

	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}

}// fin clase
