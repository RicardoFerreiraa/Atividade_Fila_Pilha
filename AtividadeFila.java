package atividadefilaepilha;

import java.util.*;

public class AtividadeFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<String> Ordem = new LinkedList<String>();
		int escolha;
		String Nome;
		String chamar;

		do {
			System.out.println("|*************************************|");
			System.out.println("|  1 - Adicionar cliente na fila      |");
			System.out.println("|  2 - Listar todos os clientes       |");
			System.out.println("|  3 - Retirar Cliente da fila        |");
			System.out.println("|  0 - Sair                           |");
			System.out.println("|*************************************|");
			System.out.println("\n Entre com a opção desejada: ");
			escolha = sc.nextInt();
			sc.nextLine();

			switch(escolha) {
			case 1:
				System.out.println("\n Digite o Nome:");
				Nome = sc.nextLine();
				Ordem.add(Nome);
				System.out.println("\nFila: ");
				Ordem.forEach(System.out::println);
				System.out.println("\n Cliente Adicionado!");
				break;

			case 2:
				if (Ordem.isEmpty()) {
					System.out.println("\n A fila está vazia");
				}else {
					System.out.println("\nLista de Clientes na Fila:");
				}
				break;

			case 3:
				if (Ordem.isEmpty()) {
					System.out.println("\n A fila está vazia");
				}else {
					chamar= Ordem.poll();
					System.out.println("\nO Cliente " + chamar+ " foi Chamado");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida! Tente novamente.");
				break;
			}

		}while (escolha !=0);
		sc.close();
	}
}