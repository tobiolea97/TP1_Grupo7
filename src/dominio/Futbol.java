package dominio;

public class Futbol extends Deporte {
		final double valorEntrada = 300;
		
		
		@Override
		public String toString() {
			return "Futbol [valorEntrada=" + valorEntrada + "]";
		}

		public double getValorEntrada() {
			return valorEntrada;
		}

		@Override
		public double obtenerValorFijo() {
			
			return this.valorEntrada;
		}
		
}
