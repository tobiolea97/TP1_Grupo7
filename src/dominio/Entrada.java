package dominio;

import java.text.DecimalFormat;

public abstract class  Entrada {
	private String NroEntrada;
	private String NombreEvento;
	private Evento objEvento;
	private String FechaHoraEvento;
	private int DuracionEvento;
	private double Precio;
	
	
	//CONSTRUCTORES
	public Entrada ()
	{
		
	}
	
	public Entrada(String nombreEvento, Evento tipoEvento, String fechaHoraEvento,
			int duracionEvento) {
		NombreEvento = nombreEvento;
		objEvento = tipoEvento;
		FechaHoraEvento = fechaHoraEvento;
		DuracionEvento = duracionEvento;
		Precio = 0;
	}

	//GETTERS AND SETTERS
	public String getNroEntrada() {
		return NroEntrada;
	}
	public void setNroEntrada(String nroEntrada) {
		NroEntrada = nroEntrada;
	}
	public String getNombreEvento() {
		return NombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}
	public Evento getTipoEvento() {
		return objEvento;
	}
	public void setTipoEvento(Evento tipoEvento) {
		objEvento = tipoEvento;
	}
	public String getFechaHoraEvento() {
		return FechaHoraEvento;
	}
	public void setFechaHoraEvento(String fechaHoraEvento) {
		FechaHoraEvento = fechaHoraEvento;
	}
	public int getDuracionEvento() {
		return DuracionEvento;
	}
	public void setDuracionEvento(int duracionEvento) {
		DuracionEvento = duracionEvento;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	@Override
	public String toString() {

		return "NroEntrada:" + NroEntrada + ", NombreEvento:" + NombreEvento + ", TipoEvento:" + objEvento.getTipoEvento()
				+ ", FechaHoraEvento:" + FechaHoraEvento + ", DuracionEvento:" + DuracionEvento + "mins , Precio:" + String.format("%.2f", Precio);
	}

	public abstract void SetearPrecioEntrada(int ValorEntrada);
	
	
	 
}
