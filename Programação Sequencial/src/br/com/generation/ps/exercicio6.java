package br.com.generation.ps;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		
		System.out.println("Escreva x1: ");
		x1 = leia.nextFloat();
		System.out.println("Escreva x2: ");
		x2 = leia.nextFloat();
		System.out.println("Escreva y1: ");
		y1 = leia.nextFloat();
		System.out.println("Escreva y2: ");
		y2 = leia.nextFloat();
		
		double d = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
		
		System.out.println("O resultado é: "+d);
		
		
		leia.close();
	}
	
}
