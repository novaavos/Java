import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		
		float[] numero;
		numero = new float[3];
	
		
		for(int i = 0; i < 3; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"� n�mero: "));
		}
		
		Arrays.sort(numero);
		
		System.out.println("O maior n�mero �: "+Arrays.toString(numero));
		System.exit(0);
		
	}
	
}
