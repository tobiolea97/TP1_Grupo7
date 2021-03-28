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
			nombreEvento = input.nextLine();
			System.out.println("Dia:");
			dia = Integer.parseInt(input.nextLine());
			System.out.println("Mes:");
			mes = Integer.parseInt(input.nextLine());
			System.out.println("Año:");
			anio = Integer.parseInt(input.nextLine());
			System.out.println("Duracion Aprox (Minutos):");
			minutosDuracion = Integer.parseInt(input.nextLine());
			
			TipoEvento tipoEvento = new TipoEvento(codigoTipoEvento);
			
			if(codigoTipoEvento == 1) {
				EntradaRecital obj = new EntradaRecital();
				
				obj.setTipoEvento(tipoEvento);
				obj.setNombreEvento(nombreEvento);
				obj.setFechaHoraEvento(dia + "/" + mes + "/" + anio);
				obj.setDuracionEvento(minutosDuracion);
				
				System.out.println("Tipo entrada (1-VIP 2-General):");
				tipoEntrada = Integer.parseInt(input.nextLine());
				obj.SetearPrecioEntrada(tipoEntrada);
				
				System.out.println("Ingrese Nombre Banda:");
				obj.setBanda(input.nextLine());
				
				System.out.println("Genero (1-Rock 2-Heavy Metal 3-Reggaeton 4-Trap 5-Latinos 6-Pop):");
				Genero gen = new Genero(Integer.parseInt(input.nextLine()), codigoTipoEvento);
				obj.setGenero(gen);
				
				System.out.println("Ingrese 1ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setPrimeraBandaSoporte(input.nextLine());
				
				System.out.println("Ingrese 2ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setSegundaBandaSoporte(input.nextLine());
				
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
				Genero gen = new Genero(Integer.parseInt(input.nextLine()), codigoTipoEvento);
				entradaTeatro.setGenero(gen);
				
				System.out.println("Ingrese 1° Actor principal: ");
				entradaTeatro.setActorPrincipal1(input.nextLine());
				
				System.out.println("Ingrese 2° Actor principal (Si no tiene ingrese '-'): ");
				entradaTeatro.setActorPrincipal2(input.nextLine());
				
				System.out.println("Ingrese 3° Actor principal (Si no tiene ingrese '-'): ");
				entradaTeatro.setActorPrincipal3(input.nextLine());
				
				listEntradas.add(entradaTeatro);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Nuevo Ingreso ~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Ingrese el Tipo de Evento a crear su entrada:");
			codigoTipoEvento = Integer.parseInt(input.nextLine());
			
			
		}
		
		System.out.println("**********************************************************");
		System.out.println("Listado de Entradas");
		
		for(Entrada objEntrada : listEntradas) {
			System.out.println(objEntrada.toString());
		}

	}

}
