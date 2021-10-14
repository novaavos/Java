package collections;

public class Itens {

	private String nome;
	private int id;
	
	public Itens(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getID() {
		return id;
	}
	
	public String toString() {
		return "Nome do item: "+this.nome+" ID: "+this.id+" ";
	}
	
}
