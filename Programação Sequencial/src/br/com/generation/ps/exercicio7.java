package br.com.generation.ps;

import java.util.*;

public class exercicio7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A: ");
		a = l.nextFloat();
		System.out.println("Escreva o valor de B: ");
		b = l.nextFloat();
		System.out.println("Escreva o valor de C: ");
		c = l.nextFloat();
		System.out.println("Escreva o valor de D: ");
		d = l.nextFloat();
		System.out.println("Escreva o valor de E: ");
		e = l.nextFloat();
		System.out.println("Escreva o valor de F: ");
		f = l.nextFloat();
	
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.println("O valor de x é:"+x+"\nO valor de y é: "+y);
		
		l.close();
	}
	
}
