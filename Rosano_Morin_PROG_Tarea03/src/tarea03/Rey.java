/**
 * 
 */
package tarea03;

/**
 * @author crosanom Clase rey con dos atributos color y posicion
 */

public class Rey {

	/**
	 * atributos de la clase rey son: color y posición con un modificador
	 * default acceso a cualquier clase dentro del paquete tarea 03
	 */
	Color color;
	Posicion posicion;

	/**
	 * @param color
	 */
	public Rey(Color color) { // sobre carga de constructor pasando por
								// parametro color

		String mensajeRBlanco = "El rey blanco esta en fila1 columna e";
		String mensajeRNegro = "El rey blanco esta en fila8 columna e";

		// validamos la entrada de filas con un if-else

		if (color == Color.BLANCO) {
			this.posicion.setColumna('e');
			this.posicion = this.posicion;
			System.out.println(mensajeRBlanco);

			this.posicion.setFila(1);
			this.posicion = this.posicion;

			if (color == Color.NEGRO) {

				this.posicion.setColumna('e');
				this.posicion = this.posicion;

				this.posicion.setFila(8);
				this.posicion = this.posicion;
				System.out.println(mensajeRNegro);
			} else {
				System.out.println("posicion introducida incorrecta, revisar posición");
			}

		}

	}
}
