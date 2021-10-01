package br.com.generation.ps;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os segundos: ");
			int segundos = leia.nextInt();
			
		int minutos = segundos / 60;
		int restoSegundos = segundos % 60;
		int horas = minutos / 60;
		int restoMinutos = minutos % 60;
		
		System.out.println("Duração total: "+horas+" horas, "+restoMinutos+"  minutos e "
				+restoSegundos+ " segundos.");
		
		leia.close();
	}
	
}
