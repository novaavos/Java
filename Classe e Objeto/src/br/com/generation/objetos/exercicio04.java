package br.com.generation.objetos;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		funcionario f = new funcionario();
		Scanner l = new Scanner(System.in);
		
		f.setNome("Gustavo Sousa Martins");
		f.setCPF("111.111.111-11");
		f.setEndereco("Rua do Sol, 111. Jardim do Sol");
		f.setTelefone("(19)99200-0000");
		
		System.out.println("Nome: "+ f.getNome());
		System.out.println("CPF: "+ f.getCPF());
		System.out.println("Endereço: "+ f.getEndereco());
		System.out.println("Telefone: "+ f.getTelefone());
		
		System.out.println("Digite [1]pagar a vista [2]desconto de funcionario");
		int i = l.nextInt();
		if(i == 1) {
			System.out.println("Digite o valor do pagamento: ");
			float valor = l.nextFloat();
			System.out.println("Seu desconto foi de 10%!\nValor pago: "+f.descontoAVista(valor));
		} 
		else if(i == 2) {
			System.out.println("Digite o valor do pagamento: ");
			float valor = l.nextFloat();
			System.out.println("Seu desconto foi de 15%!\nValor pago: "+f.descontoFuncionario(valor));
		} else {
			System.out.println("Opção inválida!");
		}
	}

}
