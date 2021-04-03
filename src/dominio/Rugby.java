package dominio;

public class Rugby extends Deporte {
	final double valorEntrada=450;
	
	
	public double getPrecioEntrada() {
		return valorEntrada;
	}

	@Override
	public String toString() {
		return "Rugby [precioEntrada=" + valorEntrada + "]";
	}

	@Override
	public double obtenerValorFijo() {
		// TODO Auto-generated method stub
		return this.valorEntrada;
	}
	
}
