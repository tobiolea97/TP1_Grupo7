package dominio;

public class Hockey extends Deporte {
	final double valorEntrada=380;

	
	public double getPrecioEntrada() {
		return valorEntrada;
	}

	@Override
	public String toString() {
		return "Hockey [precioEntrada=" + valorEntrada + "]";
	}

	@Override
	public double obtenerValorFijo() {
		// TODO Auto-generated method stub
		return valorEntrada;
	}
	
	
}
