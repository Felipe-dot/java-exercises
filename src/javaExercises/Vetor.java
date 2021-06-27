package javaExercises;

public class Vetor {
	private Aluno alunos[] = new Aluno[10];
	private int cont = 0;
	
	public Vetor() {
		
	}
	
	public int addAluno(Aluno aluno) {
		if(cont < 10) {
			alunos[cont] = aluno;
			cont++;
			//Deu certo a inserção 
			return 1;
		}else {
			//A inserção falhou
			System.out.println("O array não tem mais espaço");
			return 0;
		}
	}
	
	public Aluno getAluno(int pos) {
		if(pos > cont) {
			System.out.println("A posição informada não é válida");
			return null;
		}else {
			return alunos[pos - 1];
		}
	}
	
	public int removeAluno(int pos) {
		if(pos > cont) {
			System.out.println("A posição informada não é válida");
			//Falha ao remover
			return 0;
		}else {
			for(int i = pos - 1; i < cont; i++) {
				alunos[i] = alunos[i + 1];
			}
			alunos[cont] = null;
			cont--;
			//A remoção deu certo
			return 1;
		}
	}
	
	public void getLista() {
		for(int i = 0; i < cont; i++) {
			System.out.println(alunos[i].getNome());
		}
	}
} 
