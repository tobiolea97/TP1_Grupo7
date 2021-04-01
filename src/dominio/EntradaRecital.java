package dominio;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.ListarDatos;

public class EntradaRecital extends Entrada {
	
	
	private final static String CodigoEntrada = "R-";
	private final double PrecioVIP = 1500;
	private final double PrecioGral = 800;
	
	private String Banda;
	private Genero genero;
	private String PrimeraBandaSoporte;
	private String SegundaBandaSoporte;
	
	//CONSTRUCTORES
	
	public EntradaRecital(){
		super();
		
		int numEntrada = getContEntradas()+1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
	}

	public EntradaRecital(String nombreEvento, TipoEvento tipoEvento, String fechaHoraEvento,
			int duracionEvento, String banda, Genero gen, String primeraBandaSoporte, String segundaBandaSoporte) {
		
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		int numEntrada = getContEntradas()+1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
		Banda = banda;
		genero = gen;
		PrimeraBandaSoporte = primeraBandaSoporte;
		SegundaBandaSoporte = segundaBandaSoporte;
	}

	//GETTERS AND SETTERS
	public String getBanda() {
		return Banda;
	}
	public void setBanda(String banda) {
		Banda = banda;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero gen) {
		genero = gen;
	}
	public String getPrimeraBandaSoporte() {
		return PrimeraBandaSoporte;
	}
	public void setPrimeraBandaSoporte(String primeraBandaSoporte) {
		PrimeraBandaSoporte = primeraBandaSoporte;
	}
	public String getSegundaBandaSoporte() {
		return SegundaBandaSoporte;
	}
	public void setSegundaBandaSoporte(String segundaBandaSoporte) {
		SegundaBandaSoporte = segundaBandaSoporte;
	}
	
	public static String ObtenerProxNumeroEntrada() {
		String nroEntrada = "9"; //CodigoEntrada + (ContEntradas+1);
		
		return nroEntrada;
	}

	@Override
	public String toString() {
		return super.toString() + " Banda:" + Banda + "\n Genero:" + genero.getNombreGenero() + "\n PrimeraBandaSoporte:" + PrimeraBandaSoporte
				+ "\n SegundaBandaSoporte:" + SegundaBandaSoporte;
	}

	public void SetearPrecioEntrada(int tipoEntrada) {
		
		if(tipoEntrada == 1) {
			setPrecio(PrecioVIP);
		}
		else {
			setPrecio(PrecioGral);
		}
	}

	
}
