package br.com.generation.ps;

import java.util.*;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota[];
		nota = new float[3];
		float media = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Escreva a "+(i+1)+"ª nota");
			nota[i] = leia.nextFloat();
		}
		nota[0] *= 0.2;
		nota[1] *= 0.3;
		nota[2] *= 0.5;
		
		for(int i = 0; i < 3; i++) {
			media += nota[i];
		}
		
		System.out.println("A média total foi de: "+media);
		
		leia.close();
		
	}
	
}
