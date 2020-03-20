/**
 * Clase Vehículo extraida del archivo coche para Entornos de Desarrollo.,
 * 
 * @author manuelhidalgo
 *
 */
public class Vehiculo {

	protected int num_serie;
	protected String fabricante;
	protected Color color;

	public Vehiculo() {
		super();
	}
	/**
	 * Método que devuelve el color del vehículo
	 * @return color: String
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Método para modificar el color del vehículo
	 * @param color: String
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * Método que devuelve el número de serie del vehículo
	 * @return int
	 */
	public int getNum_serie() {
		return num_serie;
	}
	/**
	 * Método que modifica el número de serie del vehículo
	 * @param num_serie - int
	 */
	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}
	/**
	 * Método que devuelve el nombre del fabricante.
	 * @return String
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * Método que modifica el nombre del fabricante.
	 * @param fabricante - String
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}