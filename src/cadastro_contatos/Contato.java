package cadastro_contatos;

public class Contato {
	
	private String nome;
	private String email;
	private int telefone;
	private long celular;
	
		
	public Contato(String nome, String email, int telefone, long celular) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
	}


	@Override
	public String toString() {
		return 	"\n*******************" +
				"\nNome: " + nome + 
				"\nE-mail: " + email + 
				"\nTelefone: " + telefone + 
				"\nCelular: " + celular +
				"\n*******************" ;
	}
	
	
}

/*
Para este programa, os atributos da classe Contato são:  
 Nome  Telefone  Celular  Email  
*/