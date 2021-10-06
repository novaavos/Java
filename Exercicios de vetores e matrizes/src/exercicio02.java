import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int dado[] = new int[10];
		float soma = 0.0f;
		int maior = 0, quantosMaior = 1;
		
		for(int i = 0; i < dado.length; i++) {
			System.out.printf("Informe o valor do %dº dado\n", i+1);
			dado[i] = l.nextInt();
			
			while(dado[i] < 1 || dado[i] > 6) {
				System.out.println("\nOpção Inválida, por favor informe um número entre 1 e 6\n");
					dado[i] = l.nextInt();
			}
			
			if(dado[i] > maior) {
				maior = dado[i];
				quantosMaior = 1;
			}
			else if(dado[i] == maior) {
				quantosMaior++;
			}
			soma += dado[i];
		}
		System.out.printf("A média de todos os dados foi: %f\nO maior dado foi %d\n"
				+ "E o número de vezes que se repetiu o maior dado foi: %d",
				soma/dado.length,maior,quantosMaior);
		l.close();
	}

}
