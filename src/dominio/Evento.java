package dominio;

public class Evento {
	private int CodigoEvento;
	private String TipoEvento;
	
	
	//CONSTRUCTORES
	public Evento () {
		
	}
	
	public Evento(int codigoEvento) {
		CodigoEvento = codigoEvento;
		
		if(codigoEvento == 1) {
			TipoEvento = "Recital";
		}
		else if(codigoEvento == 2) {
			TipoEvento = "Teatro";
		}
		else if(codigoEvento == 3) {
			TipoEvento = "Infantil";
		}
		else {
			TipoEvento = "Deportes";
		}
	}

	
	//GETTERS AND SETTERS
	public int getCodigoEvento() {
		return CodigoEvento;
	}

	public void setCodigoEvento(int codigoEvento) {
		CodigoEvento = codigoEvento;
		
		if(codigoEvento == 1) {
			TipoEvento = "Recital";
		}
		else if(codigoEvento == 2) {
			TipoEvento = "Teatro";
		}
		else if(codigoEvento == 3) {
			TipoEvento = "Infantil";
		}
		else {
			TipoEvento = "Deportes";
		}
	}

	public String getTipoEvento() {
		return TipoEvento;
	}



	@Override
	public String toString() {
		return "CodigoEvento=" + CodigoEvento + ", TipoEvento=" + TipoEvento;
	}
	

}
