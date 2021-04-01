package dominio;

public class EntradaTeatro extends Entrada {
	
	private final static String CodigoEntrada = "T-";
	private final double PrecioGral = 1350.50;
	
	private Genero Genero;
	private String ActorPrincipal1;
	private String ActorPrincipal2;
	private String ActorPrincipal3;
	
	//CONSTRUCTORES
	public EntradaTeatro() {
		super();
		
		int numEntrada = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
	}
	
	//GETTERS AND SETTERS
	public Genero getGenero() {
		return Genero;
	}
	public void setGenero(Genero genero) {
		Genero = genero;
	}
	public String getActorPrincipal1() {
		return ActorPrincipal1;
	}
	public void setActorPrincipal1(String actorPrincipal) {
		ActorPrincipal1 = actorPrincipal;
	}
	public String getActorPrincipal2() {
		return ActorPrincipal2;
	}
	public void setActorPrincipal2(String actorPrincipal) {
		ActorPrincipal2 = actorPrincipal;
	}
	public String getActorPrincipal3() {
		return ActorPrincipal3;
	}
	public void setActorPrincipal3(String actorPrincipal) {
		ActorPrincipal3 = actorPrincipal;
	}
	
	public static String ObtenerProxNumeroEntrada() {
		String nroEntrada = CodigoEntrada + (getContEntradas()+1);
		
		return nroEntrada;
	}
	
	@Override
	public String toString() {
		// Desarrollado por Tobi
		return super.toString() + ", Genero:" + Genero.getNombreGenero() + ", Actor principal 1:" + ActorPrincipal1
				+ ", Actor principal 2:" + ActorPrincipal2 + ", Actor principal 3:" + ActorPrincipal3;
	}
	
	@Override
	public void SetearPrecioEntrada(int tipoEntrada) {
		setPrecio(PrecioGral);
	}
	
}
