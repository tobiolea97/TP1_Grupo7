package main;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Entrada;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Genero;
import dominio.TipoEvento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entrada> listEntradas = new ArrayList<Entrada>();
		int codigoTipoEvento;
		Scanner input = new Scanner(System.in);		

		System.out.println("--------- Bienvenido al Sistema de Registro de Entradas del GRUPO 7 ---------\n");
		System.out.println("                             1-Recital \n                             2-Teatro \n                             3-Infantil \n                             4-Deportes\n");
		System.out.println("Ingrese el Tipo de Evento a crear su entrada:");
		
		codigoTipoEvento = input.nextInt();
		
		if(codigoTipoEvento > 4) {
			System.out.println("El codigo ingreso no es valido!");
			return;
		}
		
		while (codigoTipoEvento != 0){
			
			String nombreEvento;
			int dia;
			int mes;
			int anio;
			int minutosDuracion;
			int tipoEntrada;
			
			System.out.println("Ingrese Nombre del Evento:");
			nombreEvento = input.next();
			System.out.println("Dia:");
			dia = input.nextInt();
			System.out.println("Mes:");
			mes = input.nextInt();
			System.out.println("Año:");
			anio = input.nextInt();
			System.out.println("Duracion Aprox (Minutos):");
			minutosDuracion = input.nextInt();
			
			TipoEvento tipoEvento = new TipoEvento(codigoTipoEvento);
			
			if(codigoTipoEvento == 1) {
				EntradaRecital obj = new EntradaRecital();
				
				obj.setTipoEvento(tipoEvento);
				obj.setNombreEvento(nombreEvento);
				obj.setFechaHoraEvento(dia + "/" + mes + "/" + anio);
				obj.setDuracionEvento(minutosDuracion);
				
				System.out.println("Tipo entrada (1-VIP 2-General):");
				tipoEntrada = input.nextInt();
				obj.SetearPrecioEntrada(tipoEntrada);
				
				System.out.println("Ingrese Nombre Banda:");
				obj.setBanda(input.next());
				
				System.out.println("Genero (1-Rock 2-Heavy Metal 3-Reggaeton 4-Trap 5-Latinos 6-Pop):");
				Genero gen = new Genero(input.nextInt(), codigoTipoEvento);
				obj.setGenero(gen);
				
				System.out.println("Ingrese 1ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setPrimeraBandaSoporte(input.next());
				
				System.out.println("Ingrese 2ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setSegundaBandaSoporte(input.next());
				
				listEntradas.add(obj);
			}
			else if(codigoTipoEvento == 2) {
				EntradaTeatro entradaTeatro = new EntradaTeatro();
				
				entradaTeatro.setTipoEvento(tipoEvento);
				entradaTeatro.setNombreEvento(nombreEvento);
				entradaTeatro.setFechaHoraEvento(dia + "/" + mes + "/" + anio);
				entradaTeatro.setDuracionEvento(minutosDuracion);
				entradaTeatro.SetearPrecioEntrada(0);
				
				System.out.println("Genero (1-Drama 2-Teatro 3-Comedia):");
				Genero gen = new Genero(input.nextInt(), codigoTipoEvento);
				entradaTeatro.setGenero(gen);
				
				System.out.println("Ingrese 1° Actor principal: ");
				entradaTeatro.setActorPrincipal1(input.next());
				
				System.out.println("Ingrese 2° Actor principal (Si no tiene ingrese '-'): ");
				entradaTeatro.setActorPrincipal2(input.next());
				
				System.out.println("Ingrese 3° Actor principal (Si no tiene ingrese '-'): ");
				entradaTeatro.setActorPrincipal3(input.next());
				
				listEntradas.add(entradaTeatro);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Nuevo Ingreso ~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Ingrese el Tipo de Evento a crear su entrada:");
			codigoTipoEvento = input.nextInt();
			
			
		}
		
		System.out.println("**********************************************************");
		System.out.println("Listado de Entradas");
		
		for(Entrada objEntrada : listEntradas) {
			System.out.println(objEntrada.toString());
		}

	}

}
