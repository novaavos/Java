import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		float pontos[] = new float[5];
		float maior = 0.0f;
		
		Scanner l = new Scanner(System.in);
		
		for(int i = 0; i < pontos.length; i++) {
			System.out.printf("\nDigite a %dª pontuação: \n", i+1);
				pontos[i] = l.nextFloat();
			if(pontos[i] > maior) {
				maior = pontos[i];
			}
		}
		System.out.println("A maior pontuação foi: "+maior);
		l.close();
	}

}
