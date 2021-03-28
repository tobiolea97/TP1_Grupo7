package dominio;

public class Genero {
	private int CodigoGenero;
	private String NombreGenero;
	
	//CONSTRUCTORES
	public Genero() {
		
	}
	public Genero(int codigoGenero) {
		super();
		CodigoGenero = codigoGenero;
		
		if(codigoGenero == 1) {
			NombreGenero = "Rock";
		}
		else if(codigoGenero == 2) {
			NombreGenero = "Heavy Metal";
		}
		else if(codigoGenero == 3) {
			NombreGenero = "Reggaeton";
		}
		else if(codigoGenero == 4) {
			NombreGenero = "Trap";
		}
		else if(codigoGenero == 5) {
			NombreGenero = "Latinos";
		}
		else {
			NombreGenero = "Pop";
		}
	}
	
	//GETTERS AND SETTERS
	public int getCodigoGenero() {
		return CodigoGenero;
	}
	public void setCodigoGenero(int codigoGenero) {
		CodigoGenero = codigoGenero;

		if(codigoGenero == 1) {
			NombreGenero = "Rock";
		}
		else if(codigoGenero == 2) {
			NombreGenero = "Heavy Metal";
		}
		else if(codigoGenero == 3) {
			NombreGenero = "Reggaeton";
		}
		else if(codigoGenero == 4) {
			NombreGenero = "Trap";
		}
		else if(codigoGenero == 5) {
			NombreGenero = "Latinos";
		}
		else {
			NombreGenero = "Pop";
		}
	}
	public String getNombreGenero() {
		return NombreGenero;
	}

	
	
}
