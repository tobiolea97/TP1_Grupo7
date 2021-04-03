package dominio;

import java.util.Date;

public class Utils {
	
	public static Date GetDate(int dia, int mes, int anio, int hora, int minutos) {
		Date date = new Date();
			
		date.setDate(dia);
		date.setMonth(mes-1);
		date.setYear(anio-1900);
		date.setHours(hora);
		date.setMinutes(minutos);
		
		return date;
	}
	
}
