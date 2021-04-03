package dominio;

public class ClasificacionDeporte {
		String TipoClasificacion;
		double interes =0.3;
		
		
		
		public ClasificacionDeporte() {}
		public ClasificacionDeporte(String tipoClasificacion, double interes) {
			
			this.TipoClasificacion = tipoClasificacion;
			this.interes=interes;
		}

		
		public double getInteres() {
			return interes;
		}
		public void setInteres(double interes) {
			this.interes = interes;
		}
		public String getTipoClasificacion() {
			return TipoClasificacion;
		}

		public void setTipoClasificacion(String tipoClasificacion) {
			TipoClasificacion = tipoClasificacion;
		}
		@Override
		public String toString() {
			return "ClasificacionDeporte [TipoClasificacion=" + TipoClasificacion + ", interes=" + interes + "]";
		}
		

		
}
