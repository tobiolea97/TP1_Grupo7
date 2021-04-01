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
		Genero genBanda = new Genero(1,1);
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
	
		//--------------------------------------------------
		
		for(Entrada obj : listaEntradas) {
			System.out.println(obj.toString());
		}
			

	}

}
