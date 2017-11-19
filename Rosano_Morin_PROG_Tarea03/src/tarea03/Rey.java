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
	 * Atributos de la clase rey son: color y posición  default
	 * acceso a cualquier clase dentro del paquete tarea
	 */

	/**
	 * atributos de la clase
	 */
	Color color;
	Posicion posicion;
	Direccion direccion;

	/**constructor Rey que se le pasa 
	 * @param color
	 * 
	 */

	public Rey(Color color) {

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

		}

	}
	
	/**
	 * Constructor que crear un rey Blanco
	 */
	/**
	 * 
	 */
	Rey reyblanco = new Rey(Color.BLANCO);

	
	//Getter and Setter de los atributos: Color, Posicion, Direccion
	
	/**
	 * @return the reyblanco
	 */
	protected Rey getReyblanco() {
		return reyblanco;
	}

	
	/**getColor
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Metodo set que pasa 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
/**
 * Metodo get Posicion devuelve posicion
 * @return
 */
	public Posicion getPosicion() {
		return posicion;
	}
/**
 * Metodo setPosicion 
 * @param posicion
 */
	public void setPosicion(Posicion posicion) {
		posicion = posicion;
	}

/**
 * Metodo getDireccion
 * @return direccion
 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * Metodo setDireccion pasa 
	 * @param direccion
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;

	}
/**
 * Metodo toString usa con IDE
 */
	@Override
	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

	/**metodo mueve modifica Direccion pasa
	 * @param direccion
	 */
	public static void mueve(Direccion direccion) {

		Posicion posicion1=new Posicion();
		
		if (direccion == Direccion.ESTE) {
            posicion1.setColumna('f');
            posicion1.setFila(1);
			System.out.println(" Si El rey se ha movido a la columna F, sigue en la misma fila"
					+ "");
		} else {

			String mensajePosicion = "El rey no esta en una posición correcta";

			direccion = Direccion.ESTE;
		}

	}

}
