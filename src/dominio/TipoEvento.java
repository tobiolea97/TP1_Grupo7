package dominio;

public class TipoEvento {
	private int CodigoTipoEvento;
	private String Descripcion;
	
	//CONSTRUCTORES
		public TipoEvento () {
			
		}
		
		public TipoEvento(int codigoTipoEvento) {
			CodigoTipoEvento = codigoTipoEvento;
			
			if(codigoTipoEvento == 1) {
				Descripcion = "Recital";
			}
			else if(codigoTipoEvento == 2) {
				Descripcion = "Teatro";
			}
			else if(codigoTipoEvento == 3) {
				Descripcion = "Infantil";
			}
			else {
				Descripcion = "Deportes";
			}
		}

		
		//GETTERS AND SETTERS
		public int getCodigoTipoEvento() {
			return CodigoTipoEvento;
		}

		public void setCodigoEvento(int codigoTipoEvento) {
			CodigoTipoEvento = codigoTipoEvento;
			
			if(codigoTipoEvento == 1) {
				Descripcion = "Recital";
			}
			else if(codigoTipoEvento == 2) {
				Descripcion = "Teatro";
			}
			else if(codigoTipoEvento == 3) {
				Descripcion = "Infantil";
			}
			else {
				Descripcion = "Deportes";
			}
		}

		public String getDescripcion() {
			return Descripcion;
		}



		@Override
		public String toString() {
			return "CodigoTipoEvento=" + CodigoTipoEvento + ", Descripcion=" + Descripcion;
		}
}
