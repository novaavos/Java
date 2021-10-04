import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		
		if(idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Categoria infantil");
		} else if(idade >= 15 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Categoria juvenil");
		} else if(idade >= 18 && idade <= 25) {
			JOptionPane.showMessageDialog(null, "Categoria Adulto");
		} else {
			JOptionPane.showMessageDialog(null, "idade Inválida");
		}
		System.exit(0);
	}
	
}
