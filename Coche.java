/**
  * Clase coche del examen De Entornos de Desarrollo
  * 
  * @author manuelhidalgo
  * @version1.0
  */

enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

public class Coche extends Vehiculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

	/**
	 * Método que devuelve la cilndrada de un objeto coche.
	 *
	 * @return devuelve un entero con la cilindrada.
	 */
	public int getCilindrada() {
	
		return cilindrada;
	}

	/**
	 * Método que permite cambiar la cilndrada de un objeto.
	 * 
	 * @param cilindrada valor entero.
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
