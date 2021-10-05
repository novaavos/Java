import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		int numero = 0, soma = 0, i = 0;
		
		Scanner l = new Scanner(System.in);
		
		do {
		
			System.out.println("Digite um número(0 para parar)");
				numero = l.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				i++;
			}
			
		}while(numero != 0);
		System.out.println("A média de todos os números multiplos de 3 digitados foi: "+soma/i);
		l.close();
	}
	
}
