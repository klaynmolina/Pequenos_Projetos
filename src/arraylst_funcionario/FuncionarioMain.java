package arraylst_funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioMain {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Scanner readString = new Scanner(System.in);

		ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<>();

		for (int a = 0; a < 9; a++) {
			Funcionario novoFuncionario = new Funcionario();

			System.out.print("Informe o nome do funcionário: ");
			novoFuncionario.setNome(readString.nextLine());

			System.out.print("Informe o sobrenome do funcionário: ");
			novoFuncionario.setSobrenome(readString.nextLine());

			System.out.printf("Informe as horas trabalhadas do funcionário %s: ", novoFuncionario.getNome());
			novoFuncionario.setHorasTrabalhadas(read.nextInt());

			System.out.printf("Informe o valor da horas trabalhadas do funcionário %s: ", novoFuncionario.getNome());
			novoFuncionario.setValorHora(read.nextDouble());

			cadastroFuncionarios.add(novoFuncionario);

			System.out.println("\nQuantidade de funcionários cadastrados: " + cadastroFuncionarios.size());
			for (int b = 0; b < cadastroFuncionarios.size(); b++) {
				System.out.printf("\n%dº CADASTRO: ", b+1);
				cadastroFuncionarios.get(b).nomeCompleto();
				cadastroFuncionarios.get(b).calcularSalario();
				System.out.println();
			}

			String resposta = "s";
			while (resposta.equalsIgnoreCase("s")) {
				System.out.print("\nDeseja inserir horas trabalhadas adicionais? s/n ");
				resposta = readString.nextLine();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("Quantas horas? ");
					novoFuncionario.incrementarHoras(read.nextInt());

					System.out.println("\nQuantidade de funcionários cadastrados: " + cadastroFuncionarios.size());
					for (int b = 0; b < cadastroFuncionarios.size(); b++) {
						System.out.printf("\n%dº CADASTRO: ", b+1);
						cadastroFuncionarios.get(b).nomeCompleto();
						cadastroFuncionarios.get(b).calcularSalario();
						System.out.println();
					}

				} else {
					System.out.println("\nNão há horas adicionais.");

					System.out.println("\nQuantidade de funcionários cadastrados: " + cadastroFuncionarios.size());
					for (int b = 0; b < cadastroFuncionarios.size(); b++) {
						System.out.printf("\n%dº CADASTRO: ", b+1);
						cadastroFuncionarios.get(b).nomeCompleto();
						cadastroFuncionarios.get(b).calcularSalario();
						System.out.println();
					}
				}
			}
		}
		read.close();
		readString.close();
	}

}

//12 de julho de 2021
