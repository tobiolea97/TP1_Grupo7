package dominio;

public abstract class Deporte {
	String nombreDeporte;
    double precio;
	
	
	public Deporte() {}
	
	public Deporte(String nombreDeporte, double precio) {
		
		this.nombreDeporte = nombreDeporte;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Deporte [nombreDeporte=" + nombreDeporte + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombreDeporte() {
		return nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	
	
	 public  abstract double obtenerValorFijo();

}
