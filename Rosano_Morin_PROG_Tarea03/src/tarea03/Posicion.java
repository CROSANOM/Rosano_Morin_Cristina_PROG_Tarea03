/**
 * 
 */
package tarea03;

//Añade comentarios tipo javadoc a la clase y a cada uno de los métodos

/**
 * @author crosanom
 * @version1.0
 *
 */

/**
 * @author crosanom
 *
 */
public class Posicion {

	// Atributos
	/**
	 * fila de la posición
	 */
	private int fila;
	/**
	 * columna de la posición
	 */
	private char columna;

	// Constructor por defecto

	/**
	 * Reserva un espacio en memoria para la posicion del rey no devuelve ningun
	 * valor explicitamente
	 */

	public Posicion() {

	}

	/**
	 * Sobre carga del constructor inicial ahora acepta dos parametros
	 * 
	 * @param fila
	 *            fila de la posición del rey
	 * @param columna
	 *            columna de la posición del rey
	 */

	public Posicion(int fila, char columna) { // constructor parametros

		// creamos una variable que guarde el mensaje de error en caso se
		// introduzca erroneamente los parametros

		String mensajeColumna = "Ha introducido un caracter fuera del rango permitido ( a-h)  por tanto la columna sera a";
		String mensajeFila = "Ha introducido un valor fuera del rango permitido (1-8) por tanto la fila sera 1";

		// validamos la entrada de filas con un if-else

		if (fila < 1 || fila > 8) {
			this.fila = fila; // que diferencia hay entre fila y this.fila ?
		} else {
			this.fila = 1;
			mensajeFila = mensajeFila;
		}
		// validamos la entrada de columnas con un switch, se debería hacer con
		// una experesión regular.

		switch (columna) {
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

	// creamos los metodos getters y setters

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

	/*
	 * creamos un metodo to String que devuelve String mensaje de informacion de
	 * la columna y de la fila indicando la posicion del rey
	 */

	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}

}
