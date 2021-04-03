package dominio;

import java.util.ArrayList;

public class Actor {
	private int Id;
	private String Nombre;
	private String Apellido;
	
	public Actor(int id, String nombre, String apellido) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
	}
	public Actor(int id) {
		ArrayList<Actor> actores = MasterData.GetActores();
		for(Actor obj : actores) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Nombre = obj.getNombre();
				this.Apellido = obj.getApellido();
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
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
}
