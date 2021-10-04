import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		
		float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número qualquer: "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Ele é par e a raiz quadrada é: "+Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "Ele é impar e o quadrado dele é: "+Math.pow(numero, 2));
		}
		System.exit(0);
	}
}
