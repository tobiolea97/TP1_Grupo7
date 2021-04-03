package dominio;

import java.util.ArrayList;

public class Banda {
	private int Id;
	private String Nombre;
	public Banda(int id, String nombre) {
		super();
		Id = id;
		Nombre = nombre;
	}
	public Banda(int id) {
		ArrayList<Banda> bandas = MasterData.GetBandas();
		for(Banda obj : bandas) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Nombre = obj.getNombre();
			}
		}
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
}
