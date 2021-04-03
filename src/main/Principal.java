package main;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Entrada;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.TipoEvento;

import dominio.MasterData;
import dominio.Actor;
import dominio.Banda;

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
		objReci.setFechaHoraEvento("11/12/2021");
		objReci.setPrimeraBandaSoporte(new Banda(2));
		objReci.setNombreEvento("RockNacional");
		objReci.setTipoEvento(new TipoEvento(1));
		objReci.setDuracionEvento(120);
		objReci.SetearPrecioEntrada(1);
		listaEntradas.add(objReci);
		
		objReci = new EntradaRecital();
		
		objReci.setBanda(new Banda(3));
		objReci.setGenero(new GeneroRecital(2));
		objReci.setFechaHoraEvento("21/07/2022");
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
				"12/05/2021",
				120,
				new GeneroTeatro(1),
				new Actor(1),
				new Actor(2),
				null
		));
		
		listaEntradas.add(new EntradaTeatro(
				"Casados con hijos",
				new TipoEvento(2),
				"14/07/2021",
				60,
				new GeneroTeatro(1),
				new Actor(3),
				new Actor(4),
				new Actor(5)	
		));
		
		// ENTRADA INFANTIL
		EntradaInfantil entradaInfantil = new EntradaInfantil();
		
		entradaInfantil.setNombreEvento("Pepa Pig world tour");
		entradaInfantil.setTipoEvento(new TipoEvento(3));
		entradaInfantil.setFechaHoraEvento("07/04/2021");
		entradaInfantil.setDuracionEvento(15);
		entradaInfantil.setTieneSouvenir(false);
		entradaInfantil.SetearPrecioEntrada(1);
		listaEntradas.add(entradaInfantil);
		
		//--------------------------------------------------
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
		
		

	}

}
