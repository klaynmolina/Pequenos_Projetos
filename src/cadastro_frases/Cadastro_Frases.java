package cadastro_frases;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro_Frases {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner readString = new Scanner(System.in);
		ArrayList<String> frases = new ArrayList<>();

		String frase = "";
		int escolha;

		do {
			System.out.println();
			System.out.println();
			System.out.println("MENU DE OP��ES - CADASTRO DE FRASES");
			System.out.println();
			System.out.println("Frases cadastradas at� o momento: " + frases.size());
			System.out.println();
			System.out.println("1 - Cadastrar nova frase.");
			System.out.println("2 - Excluir frase cadastrada.");
			System.out.println("3 - Modificar frase cadastrada.");
			System.out.println("4 - Visualizar frases.");
			System.out.println("5 - Sair.");
			System.out.println();
			System.out.println();
			System.out.print("QUAL OP��O DESEJA ESCOLHER? ");
			escolha = read.nextInt();
			System.out.println();

			switch (escolha) {
			case 1:
				System.out.println("OP��O ESCOLHIDA: 1 - CADASTRAR NOVA FRASE");
				System.out.println();

				System.out.print("Informe a frase a ser cadastrada: ");
				frase = readString.nextLine();
				frases.add(frase);

				System.out.println("Nova frase cadastrada: " + frase);

				System.out.println();
				break;
			case 2:
				System.out.println("OP��O ESCOLHIDA: 2 - EXCLUIR FRASE CADASTRADA");
				System.out.println();

				int contador = 1;
				for (String exiba : frases) {
					System.out.println(contador + "�: " + exiba.toString());
					contador++;
				}

				System.out.println();
				System.out.print("Qual frase deseja remover? ");
				escolha = read.nextInt();

				System.out.println("Frase removida: " + frases.get(escolha - 1));
				frases.remove(escolha - 1);

				System.out.println();
				break;
			case 3:
				System.out.println("OP��O ESCOLHIDA: 3 - MODIFICAR FRASE CADASTRADA");
				System.out.println();

				contador = 1;
				System.out.println("Frases dispon�veis:");
				for (String exiba : frases) {
					System.out.println(contador + "�: " + exiba.toString());
					contador++;
				}

				System.out.println();
				System.out.print("Qual frase deseja modificar? ");
				escolha = read.nextInt();

				System.out.println("Frase escolhida: " + frases.get(escolha - 1).toString());
				frases.remove(escolha - 1);

				System.out.println();
				System.out.print("Como ficar� a nova frase? ");
				String frase2 = readString.nextLine();

				frases.add(escolha - 1, frase2);

				System.out.println();
				System.out.println("Nova frase: " + frases.get(escolha - 1).toString());

				System.out.println();
				break;
			case 4:
				System.out.println("OP��O ESCOLHIDA: 4 - VISUALIZAR FRASES");
				System.out.println();

				System.out.println("Frases cadastradas at� o momento: ");
				contador = 1;
				for (String exiba : frases) {
					System.out.println(contador + "�: " + exiba.toString());
					contador++;
				}

				System.out.println();
				break;
			case 5:
				System.out.println("OP��O ESCOLHIDA: 5 - SAIR");
				System.out.println("Programa encerrado com sucesso.");
				break;
			}

		} while (escolha != 5);

		readString.close();
		read.close();
	}

}

//7 de julho de 2021 20:27:46