package dominio;

import java.text.DecimalFormat;
import java.util.Scanner;


public abstract class  Entrada {
	
	
	private static int ContEntradas;

	private String NroEntrada;
	private String NombreEvento;
	private TipoEvento objTipoEvento;
	private String FechaHoraEvento;
	private int DuracionEvento;
	private double Precio;
	
	
	//CONSTRUCTORES
	public Entrada ()
	{
		
	}
	
	public Entrada(String nombreEvento, TipoEvento tipoEvento, String fechaHoraEvento,
			int duracionEvento) {
		NombreEvento = nombreEvento;
		objTipoEvento = tipoEvento;
		FechaHoraEvento = fechaHoraEvento;
		DuracionEvento = duracionEvento;
		Precio = 0;
	}

	//GETTERS AND SETTERS
	public static int getContEntradas() {
		return ContEntradas;
	}

	public static void setContEntradas(int contEntradas) {
		ContEntradas = contEntradas;
	}
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
	public TipoEvento getTipoEvento() {
		return objTipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		objTipoEvento = tipoEvento;
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

		return "NroEntrada:" + NroEntrada + ", NombreEvento:" + NombreEvento + ", TipoEvento:" + objTipoEvento.getDescripcion()
				+ ", FechaHoraEvento:" + FechaHoraEvento + ", DuracionEvento:" + DuracionEvento + "mins , Precio:" + String.format("%.2f", Precio);
	}

	public abstract void SetearPrecioEntrada(int tipoEntrada);
	 
}
