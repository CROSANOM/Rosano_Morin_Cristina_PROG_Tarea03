/**
 * 
 */
package tarea03;

/**
 * @author crosanom Clase rey con dos atributos color y posicion
 */

public class Rey {

	/**
	 * atributos de la clase rey son: color y posici�n con un modificador
	 * default acceso a cualquier clase dentro del paquete tarea 03
	 */
	Color color;
	Posicion posicion;

	/**
	 * @param color
	 */
	public Rey(Color color) { // sobre carga de constructor pasando por parametro color 
		
String mensajeRBlanco="La posici�n del rey Blanco es fila 1 columna e";
String mensajeRNegro="La posici�n del rey Negro es fila 8 columana e";


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
				System.out.println("posicion introducida incorrecta, revisar posici�n");
			}

		} // fin if

	}// constructor

	/**
	 * Crea un constructor por defecto para la clase que cree un rey blanco. 
	 * 
	 */
	Rey reyblanco=new Rey(Color.BLANCO);

	
	// Getters and Setters 
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
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
	 * @param posicion the posicion to set
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the reyblanco
	 */
	public Rey getReyblanco() {
		return reyblanco;
	}

	/**
	 * @param reyblanco the reyblanco to set
	 */
	public void setReyblanco(Rey reyblanco) {
		this.reyblanco = reyblanco;
	}
			
		
    
	

	}
	

