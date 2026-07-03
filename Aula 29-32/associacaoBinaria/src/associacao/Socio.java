package associacao;

import java.util.ArrayList;

public class Socio {
	
	private String nome, endereco, telefone, aniversario;
	
	private ArrayList<Dependente> dependentes;
	
	public Socio(String nome, String endereco, String telefone, String aniversario) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.aniversario = aniversario;
		
		dependentes = new ArrayList<>();
	}
	
	public void adicionarDependente(Dependente dependente) {
		dependentes.add(dependente)
	}
	
	public void exibirDados() {
		System.out.println("Sócio: " + nome);
		
		System.out.println("Dependentes:");
		for(Deoentente dependente : depententes) {
			System.out.println("- " + dependente.getNome());
		}
	}
}
