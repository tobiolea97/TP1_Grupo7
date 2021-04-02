package dominio;

import java.util.ArrayList;

import interfaces.IEntradaNeg;
import interfaces.ListarDatos;

public class EntradaInfantil extends Entrada implements IEntradaNeg {
	
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
	
	public boolean getTieneSouvenir()
	{
		return TieneSouvenir; 
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

	@Override
	public void MostrarCantidadEntrasVendidas(ArrayList<Entrada> lista) {
		int cantEntradasConSouvenir = 0;
		int cantEntradasSinSouvenir = 0;

		for(Entrada obj : lista) {
			
			EntradaInfantil objInfantil = (EntradaInfantil) obj;
			
			if(obj.getNroEntrada().contains(EntradaInfantil.CodigoEntrada)) {
				
				if(objInfantil.getTieneSouvenir()) {
					cantEntradasConSouvenir++;
				}
				else {
					cantEntradasSinSouvenir++;
				}

			}
		}
		
		int totalEntradas = cantEntradasConSouvenir + cantEntradasSinSouvenir;
		
		System.out.println("\n\n");
		System.out.println("La cantidad de entradas Vendidas son:\n");
		System.out.println("Sourvenir: " + cantEntradasConSouvenir + "\n");
		System.out.println("Sin Souvenir: " + cantEntradasSinSouvenir + "\n");
		System.out.println("Total Entradas: " + totalEntradas);
	}
		
}
