package praticando1;

public class Cliente {
	private String nome, cpf;
	
	// Constructor	
	public void getDados() {
		System.out.println(
				"\nDados do Cliente:\n" +
				"Nome: " + nome + "\n" +
				"CPF: " + cpf);
	}
	
	public void atualizarNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
