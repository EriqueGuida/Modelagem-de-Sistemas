package praticando2;

public class Alunos {
	private String nome, matricula;
	
	public void atualizarNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void getDados() {
		System.out.println(
				"\nDados do Aluno:\n" +
				"Nome: " + nome + "\n" +
				"matricula: " + matricula);
	}
	
	// Constructor
	public Alunos(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
