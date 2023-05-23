package vetoresDeObjetos;

import java.util.ArrayList;

/**
 * Classe que controla os Alunos: permite cadastrar, recusa, faz as
 * regras de neg�cio, e se tivesse, faria acesso ao banco de dados. Como n�o tem
 * banco, vamos usar o Array para salvar os clientes.  * 
 * 
 */

public class ControlaAluno {


	/**
	 * Representa a base de dados dos alunos. Ser� substituido no futuro por banco
	 * de dados
	 */
	private ArrayList<Aluno> alunos = new ArrayList<>();


	public ArrayList<Aluno> listarTodos() {
		return this.alunos;
	}

	public boolean cadastrarAluno(Aluno aluno) {

		boolean alunoExistente = verificarAlunoExistente(aluno);

		if (alunoExistente) {
			return false;           // n�o deu para cadastrar
		} else {			
			this.alunos.add(aluno); // Cadastra o aluno, adicionando o objeto no Arrray List
			return true;
		}
	}

	/**
	 * Fun��o interna que verifica se um cliente j� existe pelo mesmo c�digo.
	 * 
	 */
	public boolean verificarAlunoExistente(Aluno aluno) {
		boolean aux = false;
		for(Aluno al : alunos) {
			 aux = al.equals(alunos);
			}
		return aux;
	}	
	
	public Aluno buscaAlunoCodigo(int codigo_busca) {
		
		Aluno aluno_busca = null;	
		for(Aluno al : alunos) {
			 if (al.getCodigo() == codigo_busca) {
				 aluno_busca = al;
			 }
			}
		return aluno_busca;
	}
	
	public void excluirPeloCodigo(int codigo) {
		Interface inter = new Interface();
		
		for(Aluno al : alunos) {
			int index = 0;
			 if (al.getCodigo() == codigo) {
				 alunos.get(index);
				 alunos.remove(index);
				 inter.mostraMensagem("Aluno de codigo " + codigo + "excluido com sucesso!");
				 break;
			 } else {
				 System.out.println("Aluno não encontrado");
			 }
			index++;
		}
	}

}
