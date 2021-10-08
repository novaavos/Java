
public class Animal {

	private String nome;
	private int idade;
	private String tipo;
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String som() {
		if(this.tipo == "Cachorro") {
			return "*latido*";
		} 
		else if(this.tipo == "Cavalo") {
			return "*relincho*";
		}
		else if(this.tipo == "Preguiça") {
			return "Ta...tudo...na...mais pura...e...linda...paz";
		}
		else {
			return "nulo";
		}
	}
	
	
}
