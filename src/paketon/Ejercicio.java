package paketon;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 
		
		
		final double P_PALMERA = 1.40;
		final double P_DONUT = 1.00;
		final double P_P_ACEITE = 1.20;
		final double P_P_TORTILLA = 1.60;
		final double P_ZUMO = 1.50;
		final double P_CAFE = 1.20;
		final double P_ERROR = 0.00;
		
		
		double importeTotal;
		double importeComida;
		double importeBebida;
		
		String comida;
		String bebida;
		
		
		System.out.println("¿Qué desea comer? (palmera/donut/pitufo) : ");
		comida = teclado.nextLine();
		
		
		if (comida.equals("pitufo")) {
			System.out.println("¿Con qué va el pitufo? (aceite/tortilla) : ");
			comida = teclado.nextLine();
		}
		
		
		System.out.println("¿Qué desea para beber? (zumo/café) : ");
		bebida = teclado.nextLine();
		
		switch(comida) {
		case"palmera": importeComida = P_PALMERA;break;
		case"donut": importeComida = P_DONUT; break;
		case"aceite": importeComida = P_P_ACEITE; break;
		case"tortilla": importeComida = P_P_TORTILLA; break;
		default : importeComida = P_ERROR; break;
		}
		
		
		switch(bebida) {
		case"zumo": importeBebida = P_ZUMO;break;
		case"café": importeBebida = P_CAFE; break;
		default : importeBebida = P_ERROR; break;
		}
		
		
		importeTotal = importeComida + importeBebida;
		
		
		System.out.println(importeTotal);
		
	}

}