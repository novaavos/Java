import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner l = new Scanner(System.in);
		
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		while(idade != -99) {
			System.out.println("Digite a idade");
				idade = l.nextInt();
			if(idade < 21 && idade != -99) {
				menosDe21++;
			}
			else if(idade > 50) {
				maisDe50++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+menosDe21+
				"\nTotal de pessoas com mais de 50 anos: "+maisDe50);	
		l.close();
	}

}
