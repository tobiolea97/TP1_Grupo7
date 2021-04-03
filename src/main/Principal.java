package main;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Entrada;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Genero;
import dominio.TipoEvento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();
		
		
		// ENTRADAS RECITALES
		EntradaRecital objReci = new EntradaRecital();
		
		objReci.setBanda("Mambru");
		Genero genBanda = new Genero(3,1);
		objReci.setGenero(genBanda);
		objReci.setFechaHoraEvento("11/12/2021");
		objReci.setPrimeraBandaSoporte("Bandana");
		objReci.setSegundaBandaSoporte("-");
		objReci.setNombreEvento("RockNacional");
		TipoEvento tipoEvento = new TipoEvento(1);
		objReci.setTipoEvento(tipoEvento);
		objReci.setDuracionEvento(120);
		objReci.SetearPrecioEntrada(1);
		listaEntradas.add(objReci);
		
		objReci = new EntradaRecital();
		
		objReci.setBanda("Viejas Locas");
		genBanda = new Genero(1,1);
		objReci.setGenero(genBanda);
		objReci.setFechaHoraEvento("21/07/2022");
		objReci.setPrimeraBandaSoporte("Los Redondos");
		objReci.setSegundaBandaSoporte("NTVG");
		objReci.setNombreEvento("CosquinRock");
		tipoEvento = new TipoEvento(1);
		objReci.setTipoEvento(tipoEvento);
		objReci.setDuracionEvento(174);
		objReci.SetearPrecioEntrada(2);
		listaEntradas.add(objReci);
		
		
		// ENTRADAS TEATRO
		EntradaTeatro entradaTeatro = new EntradaTeatro();
		Genero genero2 = new Genero(1,2);
		TipoEvento tipoEvento2 = new TipoEvento(2);
		
		entradaTeatro.setNombreEvento("Los arboles mueren de pie");
		entradaTeatro.setTipoEvento(tipoEvento2);
		entradaTeatro.setFechaHoraEvento("12/05/2021");
		entradaTeatro.setDuracionEvento(155);
		entradaTeatro.setGenero(genero2);
		entradaTeatro.setActorPrincipal1("Liam Neeson");
		entradaTeatro.setActorPrincipal2("Ricardo Francella");
		entradaTeatro.setActorPrincipal3("-");
		entradaTeatro.SetearPrecioEntrada(0);
		listaEntradas.add(entradaTeatro);
		
		entradaTeatro = new EntradaTeatro();
		genero2 = new Genero(3,2);
		entradaTeatro.setNombreEvento("Casados con hijos");
		entradaTeatro.setTipoEvento(tipoEvento2);
		entradaTeatro.setFechaHoraEvento("14/07/2021");
		entradaTeatro.setDuracionEvento(60);
		entradaTeatro.setGenero(genero2);
		entradaTeatro.setActorPrincipal1("Moni Argento");
		entradaTeatro.setActorPrincipal2("Ricardo Francella");
		entradaTeatro.setActorPrincipal3("-");
		entradaTeatro.SetearPrecioEntrada(0);
		listaEntradas.add(entradaTeatro);
		
		// ENTRADA INFANTIL
		EntradaInfantil entradaInfantil = new EntradaInfantil();
		TipoEvento tipoEvento3 = new TipoEvento(3);
		
		entradaInfantil.setNombreEvento("Pepa Pig world tour");
		entradaInfantil.setTipoEvento(tipoEvento3);
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
		tipoEvento2.listarReferencias(listaEntradas);
		System.out.println("************************************************");
		Genero genRock = new Genero(1,1);
		Genero genReggaeton = new Genero (3,1);
		genRock.listarReferencias(listaEntradas);
		genReggaeton.listarReferencias(listaEntradas);

		
			

	}

}
