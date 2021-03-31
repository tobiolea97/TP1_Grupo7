package dominio;

public class EntradaInfantil extends Entrada {
	
	private static int ContEntradas;
	private final static String CodigoEntrada = "I-";
	private final double PrecioMenores8 = 250;
	private final double PrecioMayores8 = 500;
	
	private boolean TieneSouvenir;
	
	//CONSTRUCTORES
	public EntradaInfantil() {
		super();
		ContEntradas++;
		String nroEntrada = CodigoEntrada + ContEntradas;
		setNroEntrada(nroEntrada);
	}

	public EntradaInfantil(String nombreEvento, TipoEvento tipoEvento, String fechaHoraEvento, int duracionEvento,boolean tieneSouvenir) {
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		TieneSouvenir = tieneSouvenir;
		ContEntradas++;
		String nroEntrada = CodigoEntrada + ContEntradas;
		setNroEntrada(nroEntrada);
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
		return super.toString()+ " TieneSouvenir=" + TieneSouvenir;
	}

}
