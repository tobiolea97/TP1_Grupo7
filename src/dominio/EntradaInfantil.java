package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class EntradaInfantil extends Entrada {
	
	private final static String CodigoEntrada = "I-";
	private final double PrecioMenores8 = 250;
	private final double PrecioMayores8 = 500;
	
	private boolean TieneSouvenir;
	
	//CONSTRUCTORES
	public EntradaInfantil() {
		super();
		
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
	}

	public EntradaInfantil(String nombreEvento, TipoEvento tipoEvento, String fechaHoraEvento, int duracionEvento,boolean tieneSouvenir) {
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		TieneSouvenir = tieneSouvenir;
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
	}
	
	public void setTieneSouvenir(boolean tieneSouvenir)
	{
		TieneSouvenir = tieneSouvenir;
	}
	
	@Override
	public void SetearPrecioEntrada(int tipoEntrada) {
		if(tipoEntrada == 1) {
			setPrecio(PrecioMenores8);
		}
		else {
			setPrecio(PrecioMayores8);
		}
		
	}
		
	@Override
	public String toString() {
		return super.toString()+ "\n TieneSouvenir=" + TieneSouvenir;
	}


}
