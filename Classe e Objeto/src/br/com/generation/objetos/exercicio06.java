package br.com.generation.objetos;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		contaBancaria c = new contaBancaria();
		Scanner l = new Scanner(System.in);
		int input = -1;
		
		c.setNome("Gustavo Sousa Martins");
		c.setCPF("111.111.111-11");
		c.setEndereco("Rua do Sol, 111. Jardim do Sol");
		c.setTelefone("(19)99200-0000");
		
		System.out.println("Nome: "+ c.getNome());
		System.out.println("CPF: "+ c.getCPF());
		System.out.println("Endere�o: "+ c.getEndereco());
		System.out.println("Telefone: "+ c.getTelefone());
		
		while(input != 0) {
			System.out.println("Digite a op��o [1]sacar dinheiro [2]depositar dinheiro [0]para sair");
			input = l.nextInt();
			if(input == 1) {
				System.out.println("Digite o valor que voc� deseja sacar :");
				float i = l.nextFloat();
				if(i > c.getConta()) {
					System.out.println("O valor que voc� digitou � menor do que o valor existente na sua conta");
				} else {
					c.sacar(i);
				}
				System.out.println("Sua fatura atual �: "+c.getConta());
			}
			else if(input == 2) {
				System.out.println("Digite o valor que voc� deseja depositar :");
				c.depositar(l.nextFloat());
				System.out.println("Sua fatura atual �: "+c.getConta());
			}
			else if(input == 0){
				System.out.println("Sua fatura atual �: "+c.getConta()+"\nAt� outro dia!");
			} else {
				System.out.println("Entrada inv�lida");
			}
		}
		l.close();
	}

}
