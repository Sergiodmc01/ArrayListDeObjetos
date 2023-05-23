package vetoresDeObjetos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Interface inter = new Interface();                  // Classe que representa a Interface do sistema  
		ControlaAluno controlaAluno = new ControlaAluno();  // Classe de Gerenciamento dos Alunos

		int opMenu;

		opMenu = inter.menuPrincipal();

		while (opMenu != 5) {

			switch (opMenu) {
			case 1: // Cadastrar Aluno

				Aluno aluno = inter.novoAluno();  // Chamo a interface para o cadastro do ALuno
				if (controlaAluno.cadastrarAluno(aluno)) {
					inter.mostraMensagem("Aluno Cadastrado com sucesso");
					inter.mostraAluno(aluno);
				} else {
					inter.mostraMensagem("Aluno N�O Cadastrado. C�digo j� existente");
					inter.mostraAluno(aluno);
				}
				break;

			case 2: // Listar Aluno
				ArrayList<Aluno> alunosCadastrados = controlaAluno.listarTodos();
				inter.mostraMensagem("Listar alunos cadastrados");
				inter.listarAluno(alunosCadastrados);
				break;

			case 3: // Procurar aluno por c�digo
				int codigo_busca = inter.lerCodigoAluno();
				Aluno aluno_busca = controlaAluno.buscaAlunoCodigo(codigo_busca);
				if (aluno_busca == null) {
					inter.mostraMensagem("Aluno com c�digo " + codigo_busca + " N�O encontrado");
				}
				else {
					inter.mostraMensagem("Aluno cadastrado");
					inter.mostraAluno(aluno_busca);
				}
								
				break;
				
			case 4: //Excluir aluno por codigo
				int codigo;
				int aux = inter.lerCodigoAluno();
				controlaAluno.excluirPeloCodigo(aux);
				break;
			}
			
			opMenu = inter.menuPrincipal();
		}
		
		inter.mostraMensagem("SAIR - Sistema encerrado");
		

	}

}
