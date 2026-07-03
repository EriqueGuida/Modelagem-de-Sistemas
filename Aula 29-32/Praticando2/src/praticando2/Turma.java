package praticando2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String code, nome;
	private List<Alunos> aluno = new ArrayList<>();
	
	public void addAluno(Alunos aluno) {
		this.aluno.add(aluno);
	}
	
	public void rmvAluno(Alunos aluno) {
		this.aluno.remove(aluno);
	}
	
	
	// Constructor
	public Turma(String code, String nome) {
		super();
		this.code = code;
		this.nome = nome;
		this.aluno = new ArrayList<>();
	}

	// Getters e Setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Alunos> getAluno() {
		return aluno;
	}

	public void setAluno(List<Alunos> aluno) {
		this.aluno = aluno;
	}
	
	
}