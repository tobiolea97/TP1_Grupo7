package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class GeneroRecital implements ListarDatos {
	private int Id;
	private String Descripcion;
	public GeneroRecital(int id, String descripcion) {
		super();
		Id = id;
		Descripcion = descripcion;
	}
	public GeneroRecital(int id) {
		ArrayList<GeneroRecital> generos = MasterData.GetGenerosRecital();
		for(GeneroRecital obj : generos) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Descripcion = obj.getDescripcion();
			}
		}
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	@Override
	public void listarReferencias(ArrayList<Entrada> listaEntradas) {
		System.out.println("************************************************");
		System.out.println("Entradas a eventos del tipo Recital y genero " + Descripcion);
		for(Entrada obj : listaEntradas) {
			if(obj instanceof EntradaRecital)
			{
				EntradaRecital entradaTeatro = (EntradaRecital)obj;
				if(entradaTeatro.getGenero().getId() == Id)
				{
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
		}
		
	}
}
