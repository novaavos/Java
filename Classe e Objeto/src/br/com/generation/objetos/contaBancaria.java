package br.com.generation.objetos;

public class contaBancaria {

	private String nome;
	private String CPF;
	private String endereco;
	private String telefone;
	private float conta = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getConta() {
		return conta;
	}
	
	public float sacar(float dinheiro) {
		conta -= dinheiro;
		return conta;
	}
	public float depositar(float dinheiro) {
		conta += dinheiro;
		return conta;
	}
	
	
	
}
