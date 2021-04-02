package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class Genero implements ListarDatos {
	private int CodigoGenero;
	private int CodigoTipoEvento = 0;
	private String NombreGenero;
	
	//CONSTRUCTORES
	public Genero() {
		
	}
	public Genero(int codigoGenero, int codigoTipoEvento) {
		CodigoGenero = codigoGenero;
		CodigoTipoEvento = codigoTipoEvento;
		
		switch(codigoTipoEvento)
		{
			// Recital
			case 1: 
				switch(codigoGenero)
				{
					case 1: NombreGenero = "Rock"; break;
					case 2: NombreGenero = "Heavy Metal"; break;
					case 3: NombreGenero = "Reggaeton"; break;
					case 4: NombreGenero = "Trap"; break;
					case 5: NombreGenero = "Latinos"; break;
					case 6: NombreGenero = "Pop"; break;
				}
			break;
			// Teatro
			case 2: 
				switch(codigoGenero)
				{
					case 1: NombreGenero = "Drama"; break;
					case 2: NombreGenero = "Teatro"; break;
					case 3: NombreGenero = "Comedia"; break;
				}
			break;
		}
	}
	
	//GETTERS AND SETTERS
	public int getCodigoGenero() {
		return CodigoGenero;
	}
	
	public void setCodigoGenero(int codigoGenero) {
		CodigoGenero = codigoGenero;

		if(CodigoTipoEvento != 0)
		{
			switch(CodigoTipoEvento)
			{
				// Recital
				case 1: 
					switch(codigoGenero)
					{
						case 1: NombreGenero = "Rock"; break;
						case 2: NombreGenero = "Heavy Metal"; break;
						case 3: NombreGenero = "Reggaeton"; break;
						case 4: NombreGenero = "Trap"; break;
						case 5: NombreGenero = "Latinos"; break;
						case 6: NombreGenero = "Latinos"; break;
					}
				break;
				// Teatro
				case 2: 
					switch(codigoGenero)
					{
						case 1: NombreGenero = "Drama"; break;
						case 2: NombreGenero = "Teatro"; break;
						case 3: NombreGenero = "Comedia"; break;
					}
				break;
			}
		}
	}
	
	public int getCodigoEvento() {
		return CodigoTipoEvento;
	}
	
	public void setCodigoEvento(int codigoTipoEvento) {
		CodigoTipoEvento = codigoTipoEvento;

		if(CodigoGenero != 0)
		{
			switch(codigoTipoEvento)
			{
				// Recital
				case 1: 
					switch(CodigoGenero)
					{
						case 1: NombreGenero = "Rock"; break;
						case 2: NombreGenero = "Heavy Metal"; break;
						case 3: NombreGenero = "Reggaeton"; break;
						case 4: NombreGenero = "Trap"; break;
						case 5: NombreGenero = "Latinos"; break;
						case 6: NombreGenero = "Latinos"; break;
					}
				break;
				// Teatro
				case 2: 
					switch(CodigoGenero)
					{
						case 1: NombreGenero = "Drama"; break;
						case 2: NombreGenero = "Teatro"; break;
						case 3: NombreGenero = "Comedia"; break;
					}
				break;
			}
		}
	}
	
	public String getNombreGenero() {
		return NombreGenero;
	}
	@Override
	public void listarReferencias(ArrayList<Entrada> listaEntradas) {
		TipoEvento tipoEvento = new TipoEvento(CodigoTipoEvento);
		System.out.println("Entradas a eventos del tipo " + tipoEvento.getDescripcion() + "/Genero " + NombreGenero);
		for(Entrada obj : listaEntradas) {
			if(obj instanceof EntradaTeatro)
			{
				EntradaTeatro entradaTeatro = (EntradaTeatro)obj;
				if(entradaTeatro.getTipoEvento().getCodigoTipoEvento() == CodigoTipoEvento &&
						entradaTeatro.getGenero().getCodigoGenero() == CodigoGenero)
				{
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
			if(obj instanceof EntradaRecital)
			{
				EntradaRecital entradaRecital = (EntradaRecital)obj;
				if(entradaRecital.getTipoEvento().getCodigoTipoEvento() == CodigoTipoEvento &&
						entradaRecital.getGenero().getCodigoGenero() == CodigoGenero)
				{
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
		}
		
	}

	
	
}
