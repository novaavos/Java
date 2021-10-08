
public class Controlador {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguica p1 = new Preguica();
		
		c1.setNome("Dog");
		c1.setTipo("Cachorro");
		c1.setIdade(5);
		
		c2.setNome("Horse");
		c2.setTipo("Cavalo");
		c2.setIdade(12);
		
		p1.setNome("Sloth");
		p1.setTipo("Preguiça");
		p1.setIdade(10);
		
		
		System.out.println("O "+c1.getTipo()+" de nome "+c1.getNome()+" e idade "
				+c1.getIdade()+"\nFala: "+c1.som()+" e "+c1.correr()+"\n");
		
		System.out.println("O "+c2.getTipo()+" de nome "+c2.getNome()+" e idade "
				+c2.getIdade()+"\nFala: "+c2.som()+" e "+c2.correr()+"\n");
		
		System.out.println("A "+p1.getTipo()+" de nome "+p1.getNome()+" e idade "
				+p1.getIdade()+"\nFala: "+p1.som()+" e "+p1.subir());
		

	}

}
