

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		
		float[] n;
		n = new float[3];
	
		
		for(int i = 0; i < 3; i++) {
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número: "));
		}
		
		if(n[0] <= n[1] && n[1] <= n[2]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[0] + " "+ n[1] + " "+ n[2] + ".");
		}
		else if(n[0] <= n[2] && n[2] <= n[1]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[0] + " "+ n[2] + " "+ n[1] + ".");
		}
		else if(n[1] <= n[0] && n[0] <= n[2]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[1] + " "+ n[0] + " "+ n[2] + ".");
		}
		else if(n[1] <= n[2] && n[2] <= n[0]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[1] + " "+ n[2] + " "+ n[0] + ".");
		}
		else if(n[2] <= n[0] && n[0] <= n[1]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[2] + " "+ n[0] + " "+ n[1] + ".");
		}
		else if(n[2] <= n[1] && n[1] <= n[0]) {
			JOptionPane.showMessageDialog(null, "Em ordem: "+ n[2] + " "+ n[1] + " "+ n[0] + ".");
		}
		System.exit(0);
	}
	
}
