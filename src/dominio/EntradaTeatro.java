package dominio;

import java.util.ArrayList;
import java.util.Date;

import interfaces.ListarDatos;

public class EntradaTeatro extends Entrada {
	
	private final static String CodigoEntrada = "T-";
	private final double PrecioGral = 1350.50;
	
	private GeneroTeatro Genero;
	private Actor ActorPrincipal1 = new Actor(0,"-","");
	private Actor ActorPrincipal2 = new Actor(0,"-","");
	private Actor ActorPrincipal3 = new Actor(0,"-","");
	
	//CONSTRUCTORES
	public EntradaTeatro() {
		super();
		
		int numEntrada = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
	}
	
	public EntradaTeatro(String nombreEvento, TipoEvento tipo,
			Date fechaHora, int duracion, GeneroTeatro genero,
			Actor actor1, Actor actor2, Actor actor3) {
		super(nombreEvento, tipo, fechaHora, duracion);
		
		int numEntrada = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		Genero = genero;
		if(actor1 != null) ActorPrincipal1 = actor1;
		if(actor2 != null) ActorPrincipal2 = actor2;
		if(actor3 != null) ActorPrincipal3 = actor3;
		SetearPrecioEntrada(0);
		
	}
	
	//GETTERS AND SETTERS
	public GeneroTeatro getGenero() {
		return Genero;
	}
	public void setGenero(GeneroTeatro genero) {
		Genero = genero;
	}
	public Actor getActorPrincipal1() {
		return ActorPrincipal1;
	}
	public void setActorPrincipal1(Actor actor) {
		ActorPrincipal1 = actor;
	}
	public Actor getActorPrincipal2() {
		return ActorPrincipal2;
	}
	public void setActorPrincipal2(Actor actor) {
		ActorPrincipal2 = actor;
	}
	public Actor getActorPrincipal3() {
		return ActorPrincipal3;
	}
	public void setActorPrincipal3(Actor actor) {
		ActorPrincipal3 = actor;
	}
	
	public static String ObtenerProxNumeroEntrada() {
		String nroEntrada = CodigoEntrada + (getContEntradas()+1);
		
		return nroEntrada;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Genero: " + Genero.getDescripcion()
				+ "\n Actor principal 1: " + ActorPrincipal1.getNombre() + " " + ActorPrincipal1.getApellido()
				+ "\n Actor principal 2: " + ActorPrincipal2.getNombre() + " " + ActorPrincipal2.getApellido() 
				+ "\n Actor principal 3: " + ActorPrincipal3.getNombre() + " " + ActorPrincipal3.getApellido();
	}
	
	@Override
	public void SetearPrecioEntrada(int tipoEntrada) {
		setPrecio(PrecioGral);
	}
	
}
