import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		int idade, sexo, Ocalmo = 0, humor, calma = 0, Magressiva = 0, Fnervosa = 0, N40 = 0, C18 = 0;
		int loop = 1;
		int maxLoop = 150;
		
		Scanner l = new Scanner(System.in);
		
		while(loop <= maxLoop) {
			System.out.println(loop+"� pessoa: qual a idade?");
				idade = l.nextInt();
				
			System.out.println(loop+"� pessoa: qual seu sexo?(1-feminino/2-masculino/3-outros)");
				sexo = l.nextInt();
			
			System.out.println(loop+"� pessoa: voc� se considera: 1-calma / 2-nervosa / 3-agressiva");
				humor = l.nextInt();
				
			if(humor == 1) {
				calma++;
				if(sexo == 3) {
					Ocalmo++;
				}
				if(idade < 18) {
					C18++;
				}
			}
			else if(humor == 2) {
				if(sexo == 1) {
					Fnervosa++;
				}
				if(idade > 40) {
					N40++;
				}
			}
			else if(humor == 3 && sexo == 2) {
				Magressiva++;
			}
			loop++;
		}
		System.out.println("N�mero de pessoas calmas: "+calma+
				"\nN�mero de mulheres nervosas: "+Fnervosa+
				"\nN�mero de homens agressivos: "+Magressiva+
				"\nN�mero de outros calmos: "+Ocalmo+
				"\nN�mero de pessoas nervosas com mais de 40 anos: "+N40+
				"\nN�mero de pessoas calmas com menos de 18 anos: "+C18);
		l.close();
	}

}
