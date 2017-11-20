/**
 * 
 */
package tarea03;

/**
 * @author crosanom
 * @version 1.1 Clase rey con dos atributos color y posicion
 */

public class Rey {

	/*
	 * Atributos de la clase rey son: color y posición default acceso a
	 * cualquier clase dentro del paquete tarea
	 */

	/**
	 * atributos de la clase
	 */
	Color color;
	Posicion posicion;

	// Tablero ajedrez
	char columnaTablero[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

	/**
	 * Constructor por defecto.
	 * 
	 */
	public Rey() {
		this.posicion.setFila(1);
		this.posicion.setColumna('e');
		this.color = color.BLANCO;
	}

	/**
	 * constructor Rey que se le pasa
	 * 
	 * @param color
	 * 
	 */

	public Rey(Color color) {

		String mensajeRBlanco = "La posición del rey Blanco es fila 1 columna e";
		String mensajeRNegro = "La posición del rey Negro es fila 8 columana e";

		if (color == color.BLANCO) {
			this.posicion.setFila(1);
			this.posicion.setColumna('e');
		}

		if (color == color.NEGRO) {
			this.posicion.setFila(8);
			this.posicion.setColumna('e');
		}

	}

	// Getters de los atributos: Color, Posicion.

	/**
	 * get color
	 * 
	 * @return the color
	 */
	protected Color getColor() {
		return color;
	}

	/**
	 * get posicion
	 * 
	 * @return the posicion
	 */
	protected Posicion getPosicion() {
		return posicion;
	}

	/**
	 * Metodo toString usa con IDE
	 */
	@Override
	public String toString() {
		return "Rey [color =" + color + ", posicion=" + posicion + "]";
	}

	/**
	 * metodo mueve modifica Direccion pasa
	 * 
	 * @param direccion
	 */
	public void mueve(Direccion direccion) {

		// Comprobar si puede moverse en el tablero.
		// Cuando es norte.
		if (direccion == direccion.NORTE) {

			// Saber donde estamos.
			if (posicion.getFila() > 1) {
				posicion.setFila(posicion.getFila() - 1);
			} else {
				System.out.println("No es posible realizar ese movimiento.");
			}
		}

		if (direccion == direccion.SUR) {

			// Saber donde estamos.
			if (posicion.getFila() < 8) {
				posicion.setFila(posicion.getFila() + 1);
			} else {
				System.out.println("No es posible realizar ese movimiento.");
			}
		}

		// Cuando es Oeste.
		if (direccion == direccion.OESTE) {

			// Saber donde estamos en el tablero para las columnas.
			for (int i = 0; i < columnaTablero.length; i++) {

				// Si encuentra la letra en el tablero.
				if (posicion.getColumna() == columnaTablero[i]) {
					// Si es true, ya lo hemos encontrado, comprobar si puede
					// moverse.
					if (i > 1) {
						posicion.setColumna(columnaTablero[i - 1]);

					} else {
						System.out.println("No es posible realizar ese movimiento.");
					}
				}
			}

			// Cuando es Este.
			if (direccion == direccion.ESTE) {

				// Saber donde estamos en el tablero para las columnas.
				for (int i = 0; i < columnaTablero.length; i++) {

					// Si encuentra la letra en el tablero.
					if (posicion.getColumna() == columnaTablero[i]) {
						// Si es true, ya lo hemos encontrado, comprobar si
						// puede moverse.
						if (i < 8) {
							// Se actualiza posicion.
							posicion.setColumna(columnaTablero[i + 1]);

						} else {
							System.out.println("No es posible realizar ese movimiento.");
						}
					}
				}
			}

		}
	}
}
