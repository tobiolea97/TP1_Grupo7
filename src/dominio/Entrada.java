package dominio;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class  Entrada {
	
	
	private static int ContEntradas;

	private String NroEntrada;
	private String NombreEvento;
	private TipoEvento objTipoEvento;
	private Date FechaHoraEvento;
	private int DuracionEvento;
	private double Precio;
	
	
	//CONSTRUCTORES
	public Entrada ()
	{
		
	}
	
	public Entrada(String nombreEvento, TipoEvento tipoEvento, Date fechaHoraEvento,
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
	public Date getFechaHoraEvento() {
		return FechaHoraEvento;
	}
	public void setFechaHoraEvento(Date fechaHoraEvento) {
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

		return " NroEntrada: " + NroEntrada + "\n NombreEvento: " + NombreEvento + "\n TipoEvento: " + objTipoEvento.getDescripcion()
				+ "\n FechaHoraEvento: " + FechaHoraEvento + "\n DuracionEvento: " + DuracionEvento + " mins \n Precio: " + String.format("%.2f", Precio);
	}

	public abstract void SetearPrecioEntrada(int tipoEntrada);
	 
}
