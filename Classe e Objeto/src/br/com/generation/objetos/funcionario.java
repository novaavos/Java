package br.com.generation.objetos;

public class funcionario {

	private String nome;
	private String CPF;
	private String endereco;
	private String telefone;
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
	public float descontoAVista(float dinheiro) {
		return dinheiro *= 0.9f;
	}
	public float descontoFuncionario(float dinheiro) {
		return dinheiro *= 0.85f;
	}
	
	
}
