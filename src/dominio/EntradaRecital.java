package dominio;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.IEntradaNeg;
import interfaces.ListarDatos;

public class EntradaRecital extends Entrada implements IEntradaNeg {
	
	
	private final static String CodigoEntrada = "R-";
	private final double PrecioVIP = 1500;
	private final double PrecioGral = 800;
	
	private Banda Banda = new Banda(0, "-");
	private GeneroRecital genero;
	private Banda PrimeraBandaSoporte = new Banda(0, "-");;
	private Banda SegundaBandaSoporte = new Banda(0, "-");;
	
	//CONSTRUCTORES
	
	public EntradaRecital(){
		super();
		
		int numEntrada = getContEntradas()+1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
	}

	public EntradaRecital(String nombreEvento, TipoEvento tipoEvento, String fechaHoraEvento,
			int duracionEvento, Banda banda, GeneroRecital gen, Banda primeraBandaSoporte, Banda segundaBandaSoporte) {
		
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
	public Banda getBanda() {
		return Banda;
	}
	public void setBanda(Banda banda) {
		Banda = banda;
	}
	public GeneroRecital getGenero() {
		return genero;
	}
	public void setGenero(GeneroRecital gen) {
		genero = gen;
	}
	public Banda getPrimeraBandaSoporte() {
		return PrimeraBandaSoporte;
	}
	public void setPrimeraBandaSoporte(Banda primeraBandaSoporte) {
		PrimeraBandaSoporte = primeraBandaSoporte;
	}
	public Banda getSegundaBandaSoporte() {
		return SegundaBandaSoporte;
	}
	public void setSegundaBandaSoporte(Banda segundaBandaSoporte) {
		SegundaBandaSoporte = segundaBandaSoporte;
	}
	
	public static String ObtenerProxNumeroEntrada() {
		String nroEntrada = "9"; //CodigoEntrada + (ContEntradas+1);
		
		return nroEntrada;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Banda: " + Banda.getNombre() + "\n Genero: " + genero.getDescripcion()
			+ "\n PrimeraBandaSoporte: " + PrimeraBandaSoporte.getNombre()
			+ "\n SegundaBandaSoporte: " + SegundaBandaSoporte.getNombre();
	}

	public void SetearPrecioEntrada(int tipoEntrada) {
		
		if(tipoEntrada == 1) {
			setPrecio(PrecioVIP);
		}
		else {
			setPrecio(PrecioGral);
		}
	}

	@Override
	public void MostrarCantidadEntrasVendidas(ArrayList<Entrada> lista) {
		int cantEntradasRock = 0;
		int cantEntradasHM = 0;
		int cantEntradasReggaeton = 0;
		int cantEntradasTrap = 0;
		int cantEntradasLat = 0;
		int cantEntradasPop = 0;

		for(Entrada obj : lista) {
			
			EntradaRecital objRecital = (EntradaRecital) obj;
			if(obj.getNroEntrada().contains(EntradaRecital.CodigoEntrada)) {
				
			
				switch (objRecital.getGenero().getId()) {
				
					case 1:
						cantEntradasRock++;
						break;
					case 2:
						cantEntradasHM++;
						break;
					case 3:
						cantEntradasReggaeton++;
						break;
					case 4:
						cantEntradasTrap++;
						break;
					case 5:
						cantEntradasLat++;
						break;
					case 6:
						cantEntradasPop++;
						break;
							
				}								

			}
			
			int totalEntradas = cantEntradasRock + cantEntradasHM + cantEntradasReggaeton + cantEntradasTrap + cantEntradasLat + cantEntradasPop;
			
			System.out.println("\n\n");
			System.out.println("La cantidad de entradas Vendidas por genero de recital son:\n");
			System.out.println("Rock: " + cantEntradasRock + "\n");
			System.out.println("Rock: " + cantEntradasHM + "\n");
			System.out.println("Rock: " + cantEntradasReggaeton + "\n");
			System.out.println("Rock: " + cantEntradasTrap + "\n");
			System.out.println("Rock: " + cantEntradasLat + "\n");
			System.out.println("Rock: " + cantEntradasPop + "\n");
			System.out.println("Total Entradas: " + totalEntradas);
		}
		
		
	}

	
}
