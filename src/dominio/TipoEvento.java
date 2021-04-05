package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class TipoEvento implements ListarDatos{
	private int CodigoTipoEvento;
	private String Descripcion;
	
	//CONSTRUCTORES
		public TipoEvento () {
			
		}
		public TipoEvento (int CodigoTipoEvento,String Descripcion) {
			this.CodigoTipoEvento=CodigoTipoEvento;
			this.Descripcion=Descripcion;
		}
		
		public TipoEvento(int id) {
			ArrayList<TipoEvento> tipos = MasterData.GetTiposDeEvento();
			for(TipoEvento obj : tipos) {
				if(obj.getCodigoTipoEvento() == id)
				{
					this.CodigoTipoEvento = id;
					this.Descripcion = obj.getDescripcion();
				}
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
		
		@Override
		public void listarReferencias(ArrayList<Entrada> listaEntradas) {
			System.out.println("Entradas a eventos del tipo " + Descripcion);
			for(Entrada obj : listaEntradas) {
				if(obj.getTipoEvento().getCodigoTipoEvento() == CodigoTipoEvento) {
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
		}
}
