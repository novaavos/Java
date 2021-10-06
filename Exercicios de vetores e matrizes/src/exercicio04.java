
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		float matriz[][] = new float[3][3];
		float soma = 0.0f;
		float somaDiagonal = 0.0f;
		
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz.length; y++) {
				System.out.printf("Digite o valor [%d][%d]\n",x,y);
				matriz[x][y] = l.nextFloat();
			}
		}
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz.length; y++) {
				soma += matriz[x][y];
				if(x == y) {
					somaDiagonal += matriz[x][y];
				}
			}
		}
		
		System.out.printf("A soma de toda a matriz é: %f\nE a soma da diagonal é: %f",soma,somaDiagonal);
		l.close();
	}
	
}
