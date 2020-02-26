package cuenta_atras;

import java.util.Scanner;

public class Cuenta_atras {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String hora_actual = "";
		do {
		hora_actual = entrada.nextLine();
		
		int minutos_horas = Integer.parseInt(hora_actual.substring(0,2));
		int minutos = Integer.parseInt(hora_actual.substring(3));
		minutos_horas = minutos_horas * 60;
		
		int minutos_restantes = 1440 - (minutos_horas + minutos);
		
		if(minutos_restantes != 1440) {
		
		System.out.println(minutos_restantes);
		}else {
			System.out.print("\n");
		}
		}while(!hora_actual.equals("00:00"));

		
		
		
		
		
	}

}
