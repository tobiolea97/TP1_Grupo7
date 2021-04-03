package dominio;

import java.util.ArrayList;
import java.util.Date;

import interfaces.IEntradaNeg;

public  class EntradaDeporte  extends Entrada {
		Deporte D1;
		ClasificacionDeporte cD= new ClasificacionDeporte();
		private final static String CodigoEntrada = "D-";
		double valorEntrada;
		
	public EntradaDeporte() {
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);}	
	
	
	public EntradaDeporte(String nombreEvento, TipoEvento tipoEvento, Date fechaHoraEvento, int duracionEvento, Deporte d1, ClasificacionDeporte cD) {
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		
		this.D1 = d1;
		this.cD = cD;
		this.valorEntrada=calcularValorEntrada();
		SetearPrecioEntrada(1);
		
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
	}
		/*public EntradaDeporte(Deporte d1, ClasificacionDeporte cD) {
		super();
	
		
		
		D1 = d1;
		this.cD = cD;
		this.valorEntrada=calcularValorEntrada();
		SetearPrecioEntrada(1);
		
	}*/


		public Deporte getD1() {
		return D1;
	}



	public void setD1(Deporte d1) {
		D1 = d1;
	}



	public ClasificacionDeporte getcD() {
		return cD;
	}



	public void setcD(ClasificacionDeporte cD) {
		this.cD = cD;
	}



		private double calcularValorEntrada() {
			double valorEntrada=this.D1.obtenerValorFijo();
		
			 if(this.cD.getTipoClasificacion().equals("Internacional")) {
				 
				  valorEntrada*= this.cD.getInteres();
				 return  this.D1.obtenerValorFijo()+valorEntrada;
			}
			
			return valorEntrada;
			
			
	}


		

		

		@Override
		public void SetearPrecioEntrada(int valorEntrada) {
			setPrecio(this.valorEntrada);
}


		@Override
		public String toString() {
			return super.toString()+ "\n";
		}


	
		
		

		





	
	

}
