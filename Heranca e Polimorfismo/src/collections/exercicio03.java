package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
			
		ArrayList<Itens> itens = new ArrayList<>();
		Scanner l = new Scanner(System.in);
		int resposta = -1;

		itens.add(new Itens("Primeiro",1));
		itens.add(new Itens("Segundo",2));
		itens.add(new Itens("Terceiro",3));
		
		while(resposta != 0) {
			System.out.println("Você deseja\n[1]Armazenar um novo item [2]Remover um item [3]Atualizar um item [4]Apresentar a lista de itens [0]Sair do programa");
			resposta = l.nextInt();
			
			if(resposta == 1) {
				System.out.println("Informe o nome do novo item:");
				String nome = l.next();
				System.out.println("Informe o novo ID do item: ");
				int id = l.nextInt();
				itens.add(new Itens(nome,id));
			} else if(resposta == 2) {
				System.out.println("Qual o indice do item que deseja remover?");
				int i = l.nextInt();
				itens.remove(i);
			} else if(resposta == 3) {
				System.out.println("Qual o indice do item que deseja atualizar?");
				int i = l.nextInt();
				System.out.println("Informe o nome do novo item:");
				String nome = l.next();
				System.out.println("Informe o novo ID do item: ");
				int id = l.nextInt();
				itens.set(i, new Itens(nome,id));
			} else if(resposta == 4) {
				System.out.println("A lista do estoque é: \n" + itens.toString());
			} else if(resposta == 0) {
				System.out.println("Até mais!");
			}
			else {
				System.out.println("Número inválido!");
			}
		}
		l.close();
	}

}
