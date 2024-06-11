package atividadefilaepilha;

import java.util.*;

public class Atividade2Pilha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int escolha;
		String Livro;

		Stack<String> PilhaLivros = new Stack<String>();

		do {
			System.out.println("|************** Menu ***************** |");
			System.out.println("|  1 - Adicionar novo livro na pilha   |");
			System.out.println("|  2 - Listar todos os livros da pilha |");
			System.out.println("|  3 - Retirar um livro da pilha       |");
			System.out.println("|  0 - Sair                            |");
			System.out.println("|**************************************| ");
			System.out.println("\n Digite uma opção: ");
			escolha =sc.nextInt();
			sc.nextLine();

			switch(escolha) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				Livro = sc.nextLine();
				PilhaLivros.push(Livro);
				System.out.println("\n Pilha: ");
				PilhaLivros.forEach(System.out::println);
				System.out.println("\nLivro Adicionado!");
				break;

			case 2:
				if(PilhaLivros.isEmpty()) {
					System.out.println("\n A pilha esta vazia!");
				}else {
					System.out.println("\nLista de livros na pilha: ");
					PilhaLivros.forEach(System.out::println);
				}
				break;

			case 3:
				if(PilhaLivros.isEmpty()) {
					System.out.println("\n A pilha esta vazia!");
				}else {
					PilhaLivros.pop();
					System.out.println("\n Pilha: ");
					PilhaLivros.forEach(System.out::println);
					System.out.println("\n Um livro foi retirado da pilha" );
					break;
				}
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\n Opção inválida! Tente novamente.");
				break;
			}
		} while (escolha !=0);
		sc.close();
	}
}

