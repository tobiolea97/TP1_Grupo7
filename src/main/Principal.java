package main;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Entrada;
import dominio.EntradaRecital;
import dominio.Evento;
import dominio.Genero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entrada> listEntradasRecitales = new ArrayList<Entrada>();
		int codigoEvento;
		Scanner input = new Scanner(System.in);		

		System.out.println("--------- Bienvenido al Sistema de Registro de Entradas del GRUPO 7 ---------\n");
		System.out.println("                             1-Recital \n                             2-Teatro \n                             3-Infantil \n                             4-Deportes\n");
		System.out.println("Ingrese el Tipo de Evento a crear su entrada:");
		
		codigoEvento = input.nextInt();
		
		if(codigoEvento > 4) {
			System.out.println("El codigo ingreso no es valido!");
			return;
		}
		
		while (codigoEvento != 0){
			
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
			
			if(codigoEvento == 1) {
				EntradaRecital obj = new EntradaRecital();
				
				Evento event = new Evento(codigoEvento);
				obj.setTipoEvento(event);
				obj.setNombreEvento(nombreEvento);
				obj.setFechaHoraEvento(dia + "/" + mes + "/" + anio);
				obj.setDuracionEvento(minutosDuracion);
				
				System.out.println("Tipo entrada (1-VIP 2-General):");
				tipoEntrada = input.nextInt();
				obj.SetearPrecioEntrada(tipoEntrada);
				
				System.out.println("Ingrese Nombre Banda:");
				obj.setBanda(input.next());
				
				System.out.println("Genero (1-Rock 2-Heavy Metal 3-Reggaeton 4-Trap 5-Latinos 6-Pop):");
				Genero gen = new Genero(input.nextInt());
				obj.setGenero(gen);
				
				System.out.println("Ingrese 1ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setPrimeraBandaSoporte(input.next());
				
				System.out.println("Ingrese 2ra Banda Soporte (Si no tiene ingrese '-'): ");
				obj.setSegundaBandaSoporte(input.next());
				
				listEntradasRecitales.add(obj);
			}
			else if(codigoEvento == 2) {
				
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Nuevo Ingreso ~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Ingrese el Tipo de Evento a crear su entrada:");
			codigoEvento = input.nextInt();
		}
		
		System.out.println("**********************************************************");
		System.out.println("Listado de Entradas");
		
		for(Entrada objEntrada : listEntradasRecitales) {
			System.out.println(objEntrada.toString());
		}

	}

}
