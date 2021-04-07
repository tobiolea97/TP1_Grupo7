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

public class Principal {

	public static void main(String[] args) {
		
		
		//PRUEBA GIT
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
				new GeneroTeatro(2),
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
		listaEntradas.add(new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			2
		));
		
		// ENTRADA DEPORTE
		TipoEvento tE= new TipoEvento(4);
		
		EntradaDeporte eD= new EntradaDeporte("Evento Futbol",tE,Utils.GetDate(23, 9, 1992, 20, 30),160,new Deporte(1),true);
		EntradaDeporte eD2= new EntradaDeporte("Evento Hockey",tE,Utils.GetDate(24, 9, 1992, 20, 30),160,new Deporte(2),true);
		EntradaDeporte eD3= new EntradaDeporte("Evento Rugby",tE,Utils.GetDate(26, 9, 1992, 20, 30),160,new Deporte(3),true);
		
		listaEntradas.add(eD);
		listaEntradas.add(eD2);
		listaEntradas.add(eD3);		
		
		
		// SALIDA POR PANTALLA
		
		System.out.println("************************************************");
		System.out.println("                Todas las entradas");
		for(Entrada obj : listaEntradas) {
			System.out.println("************************************************");
			System.out.println(obj.toString());
			System.out.println("\n");
		}
		
		System.out.println("************************************************");
		System.out.println("                Interfaces");
		System.out.println("************************************************");
		
		TipoEvento tipoRecital = new TipoEvento(1);
		GeneroTeatro generoDrama = new GeneroTeatro(1);
		
		tipoRecital.listarReferencias(listaEntradas);
		generoDrama.listarReferencias(listaEntradas);
		
		EntradaRecital entradaRecital = new EntradaRecital();
		entradaRecital.MostrarCantidadEntrasVendidas(listaEntradas);
		
		EntradaInfantil entradaInfantil = new EntradaInfantil();
		entradaInfantil.MostrarCantidadEntrasVendidas(listaEntradas);
		
		

		
		

	}

}
