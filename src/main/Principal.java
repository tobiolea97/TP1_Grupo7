package main;

import java.util.ArrayList;
import java.util.Date;

import dominio.Entrada;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.TipoEvento;
import dominio.Utils;
import dominio.Actor;
import dominio.Banda;
import dominio.Deporte;
import dominio.EntradaDeporte;
import dominio.Futbol;
import dominio.Rugby;
import dominio.Hockey;
import dominio.ClasificacionDeporte;

public class Principal {

	public static void main(String[] args) {
		
		// DATOS MAESTROS
		TipoEvento tipoRecital = new TipoEvento(1);
		GeneroTeatro generoDrama = new GeneroTeatro(1);
		
		// DECLARACIONES
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();		
		
		// ENTRADAS RECITALES
		EntradaRecital objReci = new EntradaRecital();
		
		objReci.setBanda(new Banda(1));
		objReci.setGenero(new GeneroRecital(1));
		objReci.setFechaHoraEvento(Utils.GetDate(11, 12, 2021, 20, 30));
		objReci.setPrimeraBandaSoporte(new Banda(2));
		objReci.setNombreEvento("RockNacional");
		objReci.setTipoEvento(new TipoEvento(1));
		objReci.setDuracionEvento(120);
		objReci.SetearPrecioEntrada(1);
		listaEntradas.add(objReci);
		
		objReci = new EntradaRecital();
		
		objReci.setBanda(new Banda(3));
		objReci.setGenero(new GeneroRecital(2));
		objReci.setFechaHoraEvento(Utils.GetDate(21, 07, 2022, 21, 00));
		objReci.setPrimeraBandaSoporte(new Banda(4));
		objReci.setSegundaBandaSoporte(new Banda(5));
		objReci.setNombreEvento("CosquinRock");
		objReci.setTipoEvento(new TipoEvento(1));
		objReci.setDuracionEvento(174);
		objReci.SetearPrecioEntrada(2);
		listaEntradas.add(objReci);
		
		
		// ENTRADAS TEATRO				
		listaEntradas.add(new EntradaTeatro(
				"Los arboles mueren de pie",
				new TipoEvento(2),
				Utils.GetDate(12, 5, 2021, 19, 15),
				120,
				new GeneroTeatro(1),
				new Actor(1),
				new Actor(2),
				null
		));
		listaEntradas.add(new EntradaTeatro(
				"Casados con hijos",
				new TipoEvento(2),
				Utils.GetDate(7, 4, 2021, 20, 30),
				60,
				new GeneroTeatro(1),
				new Actor(3),
				new Actor(4),
				new Actor(5)	
		));
		
		// ENTRADAS INFANTIL
		listaEntradas.add(new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			1
		));
		
		// SALIDA POR PANTALLA
		System.out.println("************************************************");
		System.out.println("Todas las entradas");
		for(Entrada obj : listaEntradas) {
			System.out.println("************************************************");
			System.out.println(obj.toString());
			System.out.println("\n");
		}
		
		System.out.println("************************************************");
		tipoRecital.listarReferencias(listaEntradas);
		generoDrama.listarReferencias(listaEntradas);
		
		System.out.println("************************************************");
		System.out.println("Entradas de Deporte");
		System.out.println("************************************************");
		
		ClasificacionDeporte cD= new ClasificacionDeporte("Internacional", 0.3);
		ClasificacionDeporte cD2= new ClasificacionDeporte("Nacional", 0.3);
		Deporte f1 =new Futbol();
		Deporte r1= new Rugby();
		Deporte h1= new Hockey();
		
		TipoEvento tE= new TipoEvento(1,"Deporte");
		
		
	
		
		EntradaDeporte eD= new EntradaDeporte("Futbol",tE,Utils.GetDate(23, 9, 1992, 20, 30),160,f1,cD);
		EntradaDeporte eD2= new EntradaDeporte("Rugby",tE,Utils.GetDate(24, 9, 1992, 20, 30),160,r1,cD);
		EntradaDeporte eD3= new EntradaDeporte("Hockey",tE,Utils.GetDate(26, 9, 1992, 20, 30),160,h1,cD2);
		
		System.out.println(eD.toString());
		System.out.println(eD2.toString());
		System.out.println(eD3.toString());
		

	}

}
