import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		
		float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero qualquer: "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Ele � par e a raiz quadrada �: "+Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "Ele � impar e o quadrado dele �: "+Math.pow(numero, 2));
		}
		System.exit(0);
	}
}
