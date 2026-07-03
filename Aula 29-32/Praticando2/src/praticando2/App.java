package praticando2;

public class App {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Aluno 1", "001");
		Alunos a2 = new Alunos("Aluno 2", "002");
		Turma t1 = new Turma("01", "T-Rex");
		
		t1.addAluno(a2);
		t1.addAluno(a1);
		
	}

}
