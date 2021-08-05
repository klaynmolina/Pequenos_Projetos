package lista_mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaMercado {
	
	public static void main(String[] args) {

		Scanner readString = new Scanner(System.in);

		ArrayList<String> listaMercado = new ArrayList<>();

		System.out.println("**INFO**");
		System.out.println("PARA ENCERRAR A LISTA: DIGITE 'FIM'.");
		System.out.println("PARA DELETAR O PRIMEIRO ITEM CADASTRADO: DIGITE 'EXCLUIR'.");
		System.out.println("PARA LIMPAR A LISTA: DIGITE 'LIMPAR'.");
		System.out.println("**INFO**");
		System.out.println();

		System.out.println("LISTA DE MERCADO");
		System.out.println();

		String item = "";
		do {
			System.out.print("Insira um item: ");
			item = readString.nextLine().toLowerCase();

			switch (item) {
			case "fim":
				System.out.println("Lista encerrada com sucesso.");
				System.out.println();
				break;
			case "excluir":
				if (listaMercado.isEmpty()) {
					System.out.println("Impossível apagar item. A lista está vazia!");
					System.out.println();
				} else {
					listaMercado.remove(0);
					System.out.println("Item removido com sucesso.");
					System.out.println();
				}
				break;
			case "limpar":
				listaMercado.clear();
				System.out.println("Lista limpa com sucesso.");
				System.out.println();
				break;
			default:
				listaMercado.add(item);
				System.out.println("Item inserido com sucesso.");
				System.out.println();
			}

		} while (!item.equalsIgnoreCase("fim"));

		System.out.println("LISTA DO MERCADO:");
		for (String exiba : listaMercado) {
			System.out.println(exiba.toString().toUpperCase());
		}

		readString.close();
	}

}

//7 de julho de 2021
