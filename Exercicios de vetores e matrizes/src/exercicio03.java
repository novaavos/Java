import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int linha = 4, coluna = 6;
		
		float M1[][] = new float[linha][coluna];
		float M2[][] = new float[linha][coluna];	
		float N1[][] = new float[linha][coluna];
		float N2[][] = new float[linha][coluna];
		
		for(int x  = 0; x < M1.length; x++) {
			for(int y = 0; y < M1.length; y++) {
				System.out.printf("Digite os valores da matriz N1 [%d , %d]", x, y);
				N1[x][y] = l.nextFloat();
			}
		}
		System.out.println();
		for(int x  = 0; x < M1.length; x++) {
			for(int y = 0; y < M1.length; y++) {
				System.out.printf("Digite os valores da matriz N2 [%d , %d]", x, y);
				N2[x][y] = l.nextFloat();
			}
		}
		System.out.println();
		for(int x  = 0; x < M1.length; x++) {
			for(int y = 0; y < M1[x].length; y++) {
				M1[x][y] = N1[x][y] + N2[x][y];
				System.out.print("["+M1[x][y]+"]");
			}
			System.out.println();
		}
		System.out.println();
		for(int x  = 0; x < M2.length; x++) {
			for(int y = 0; y < M2[x].length; y++) {
				M2[x][y] = N1[x][y] - N2[x][y];
				System.out.print("["+M2[x][y]+"]");
			}
			System.out.println();
		}	
		l.close();
	}

}
