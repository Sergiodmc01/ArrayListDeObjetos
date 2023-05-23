package vetoresDeObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

	Scanner entrada = new Scanner(System.in);

	public int menuPrincipal() {
		int op;
		Scanner entrada = new Scanner(System.in);

		System.out.println("------------------------------------");
		System.out.println("----------   MENU   ----------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Aluno ");
		System.out.println("2 - Listar Aluno ");
		System.out.println("3 - Procurar Aluno ");
		System.out.println("4 - Excluir aluno por codigo");

		System.out.println("5 - SAIR ");

		op = entrada.nextInt();

		while (op > 5 || op <= 0) {

			System.out.println("------------------------------------");
			System.out.println("----------   MENU   ----------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Cadastrar Aluno ");
			System.out.println("2 - Listar Aluno ");
			System.out.println("3 - Procurar Aluno por C�digo ");
			System.out.println("4 - Excluir aluno por codigo ");

			System.out.println("5 - SAIR ");
			op = entrada.nextInt();

		}
		return op;
		
	}
	

	public int lerCodigoAluno() {
		int aux;
		System.out.println("Digite o código do aluno a ser cadastrado : ");
		aux = entrada.nextInt();
		return aux;
	}
	
	public int lerSexoAluno() {
		int aux;
		System.out.println("Digite o Sexo do aluno a ser cadastrado sendo 1 – Masculino / 2 - Feminino : ");
		aux = entrada.nextInt();
		return aux;
	}
	
	public String lerNomeAluno() {
		String aux;
		System.out.println("Digite o Nome do aluno a ser cadastrado : ");
		aux = entrada.next();
		return aux;
	}
	
	public String lerEmailAluno() {
		String aux;
		System.out.println("Digite o Email do aluno a ser cadastrado : ");
		aux = entrada.next();
		return aux;
		
	}
	
	public Double lerPesoAluno() {
		Double aux;
		System.out.println("Digite o Peso do aluno a ser cadastrado : ");
		aux = entrada.nextDouble();
		return aux;
		
	}
	
	public Double lerAlturaAluno() {
		Double aux;
		System.out.println("Digite a Altura do aluno a ser cadastrado : ");
		aux = entrada.nextDouble();
		return aux;

	}
	public String lerNome() {
		String aux;
		System.out.println("Digite o codigo do aluno a ser excluido : ");
		aux = entrada.next();
		return aux;
	}


	
	public void mostraAluno(Aluno aluno) {
		//aluno.toString();
		System.out.println(aluno.getCodigo());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getPeso());
		System.out.println(aluno.getAltura());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getSexo());
		System.out.println(aluno.calculaImc());
	}


	/**
	 * Aqui vc cria um novo objeto Aluno na tela, para depois tentar cadastrar
	 */
	public Aluno novoAluno() {

		Aluno aluno;
		int codAluno;
		int sexoAluno;
		String nomeAluno;
		String emailAluno;
		double pesoAluno;
		double alturaAluno;

		codAluno = lerCodigoAluno();
		while (codAluno <= 0) {
			codAluno = lerCodigoAluno();  
		}
		
		sexoAluno = lerSexoAluno();
		while ((sexoAluno != 1) && (sexoAluno != 2)) {
			sexoAluno = lerSexoAluno();  
		}

		nomeAluno = lerNomeAluno();
		while (nomeAluno.indexOf("") == -1) {
			nomeAluno = lerNomeAluno();  
		}
		
		emailAluno = lerEmailAluno();
		while (emailAluno.indexOf('@') == -1) {
			emailAluno = lerEmailAluno();   
		}
		
		pesoAluno = lerPesoAluno();
		while (pesoAluno <= 0) {
			pesoAluno = lerPesoAluno();
		}

		alturaAluno = lerAlturaAluno();
		while (pesoAluno <= 0) {
			alturaAluno = lerAlturaAluno();
		}

		// Preencher 
		// Instancia um objeto Cliente para retorno para ser utilizado na classe Servio
		
		aluno = new Aluno(codAluno, nomeAluno, emailAluno, pesoAluno, alturaAluno, sexoAluno);
		return aluno;
	}

	public void listarAluno(ArrayList<Aluno> alunos) {
		for(Aluno aluno : alunos) {
			System.out.println(aluno.toString());
		}

	}
	
	public void mostraMensagem(String msg) {
		System.out.println("-------------");
		System.out.println(msg);
		System.out.println("-------------");
	}


	
}
