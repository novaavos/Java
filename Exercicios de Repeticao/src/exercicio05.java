import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		float numero = 0, soma = 0;
		
		Scanner l = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite um número para a soma total(0 para parar)");
				numero = l.nextFloat();
			soma += numero;
		}while(numero != 0);
		System.out.println("Soma total: "+soma);
		l.close();
	}

}
