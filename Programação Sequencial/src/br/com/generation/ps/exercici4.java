package br.com.generation.ps;

import java.util.*;

public class exercici4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		double D;
		
		System.out.println("Digite o valor de A:");
			A = leia.nextInt();
			
		System.out.println("Digite o valor de B:");
			B = leia.nextInt();
				
		System.out.println("Digite o valor de C:");
			C = leia.nextInt();
			
		double R = Math.pow((A + B), 2);
		double S = Math.pow((B + C), 2);
		D = (R + S) /2;
		
		System.out.println("O resultado é: "+D);
		
		leia.close();
	}

}
