package br.com.generation.ps;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		
		int dias, meses, anos, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia em que voc� nasceu: ");
		dias = leia.nextInt();
	
		System.out.println("Digite o m�s em que voc� nasceu: ");
		meses = leia.nextInt();
	
		System.out.println("Digite o ano em que voc� nasceu: ");
		anos = leia.nextInt();
	
		resultado = dias + (meses * 30) + ((2021 - anos)* 365);
		
		System.out.println("O total de dias vividos �: "+resultado);
		
		leia.close();
	}

}
