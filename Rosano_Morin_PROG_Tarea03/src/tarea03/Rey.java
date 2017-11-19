/**
 * 
 */
package tarea03;

/**
 * @author crosanom Clase rey con dos atributos color y posicion
 */

public class Rey {

	/**
	 * Atributos de la clase rey son: color y posición con un modificador
	 * default acceso a cualquier clase dentro del paquete tarea 03
	 */
	Color color;
	Posicion posicion;
	Direccion direccion;

	/**
	 * @param color
	 */
	public Rey(Color color) { // sobre carga de constructor pasando por
								// parametro color

		String mensajeRBlanco = "La posición del rey Blanco es fila 1 columna e";
		String mensajeRNegro = "La posición del rey Negro es fila 8 columana e";

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

		} // fin if

	}// constructor

	/**
	 * Crea un constructor por defecto para la clase que cree un rey blanco.
	 * 
	 */
	Rey reyblanco = new Rey(Color.BLANCO);

	// Getters and Setters
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the posicion
	 */
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion
	 *            the posicion to set
	 */
	public void setPosicion(Posicion posicion) {
		posicion = posicion;

	}

	/**
	 * @return the reyblanco
	 */
	public Rey getReyblanco() {
		return reyblanco;
	}

	/**
	 * @param reyblanco
	 *            the reyblanco to set
	 */
	public void setReyblanco(Rey reyblanco) {
		this.reyblanco = reyblanco;
	}

	/*
	 * Creado el metodo to String a traves del a tajo del IDE source
	 */
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;

	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

	// crear mueve

	public static void mueve(Direccion direccion) {

		if (direccion == Direccion.ESTE) {

			// no consigo acceder a posicion
			// para poder acceso posicion.set (fila , columna) y asi cambiar la
			// posicion del rey
			// en base a la direccion que ocupe.

			System.out.println(" Si El rey se ha movido a la columna F ");
		} else {

			String mensajePosicion = "El rey no esta en una posición correcta";

			direccion = Direccion.ESTE;
		}

	}

}
