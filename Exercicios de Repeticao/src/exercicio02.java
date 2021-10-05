import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		int nPar = 0, nImpar = 0, numero;
		
		Scanner l = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o "+(i+1)+"º número");
				numero = l.nextInt();
			if(numero % 2 == 0) {
				nPar++;
			} else {
				nImpar++;
			}
		}
		
		System.out.println("Foram "+nPar+" números pares e "+nImpar+" números ímpares");
	
		l.close();
	}

}
