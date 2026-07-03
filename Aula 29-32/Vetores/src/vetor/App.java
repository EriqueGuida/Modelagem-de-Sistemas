package vetor;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Declaração da Lista
		List<String> alunosList = new ArrayList<>();
		
		//inserção de elementos
		alunosList.add("Ana");
		alunosList.add("Bruno");
		alunosList.add("Carlos");
		
		System.out.println("\nLIST APÓS AS INSERÇÕES:");
		
		// Percorrendo a lista com for tradicional
		for(int i = 0; i < alunosList.size(); i++) {
			System.out.println(i + " - " + alunosList.get(i));
		}
		
		// Inserção em uma posição específica
		alunosList.add(1, "Beatriz");
		
		System.out.println("\nLIST APÓS INSERIR BEATRIZ NA POSIÇÃO 1:");
		
		// Percorrndo com for-each
		for(String aluno : alunosList) {
			System.out.println(aluno);
		}
		
		// Remoção pelo conteúdo
		alunosList.remove("Bruno");
		
		// Remoção pelo índice
		alunosList.remove(0);
		
		System.out.println("\nLIST APÓS AS REMOÇÕES:");
		
		for(String aluno : alunosList) {
			System.out.println(aluno);
		}
	}

}
