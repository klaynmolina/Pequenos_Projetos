package banco;

import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Scanner readString = new Scanner(System.in);
		
		System.out.print("Informe o n�mero da conta a ser cadastrada: ");
		long numeroConta = read.nextLong();
		read.nextLine();
		
		System.out.print("Informe o nome do titular: ");
		String nome = readString.nextLine();
		
		System.out.print("O cliente deseja realizar dep�sito inicial? s/n ");
		String resposta = readString.nextLine();
		double depositoInicial = 0;
		
		if (resposta.equalsIgnoreCase("s")) {
			System.out.println();
			System.out.print("Qual o valor do dep�sito inicial? ");
			depositoInicial = read.nextDouble();
			System.out.println();
		}
				
		
		Conta conta = new Conta(numeroConta, nome, depositoInicial);
		conta.adicionarCadastro(conta);
		
		System.out.println("CONTA ABERTA COM SUCESSO");
		for(Conta exiba: conta.cadastro) {
			System.out.println("************************************");
			System.out.println(exiba);
			System.out.println("************************************");
		}
		
		System.out.println();
		System.out.println("MOVIMENTA��O DA CONTA");
		System.out.print("Deseja realizar um dep�sito? s/n ");
		resposta = readString.nextLine();
		
		if(resposta.equalsIgnoreCase("s")) {
			System.out.print("Qual o valor do dep�sito? ");
			double vDeposito = read.nextDouble();
			conta.deposito(vDeposito);
			System.out.printf("DEP�SITO DE R$%.2f REALIZADO COM SUCESSO", vDeposito);
			System.out.println();					
		}
		
		
		System.out.println("EXTRATO:");			
		for(Conta exiba: conta.cadastro) {
			System.out.println();
			System.out.println("************************************");
			System.out.println(exiba);
			System.out.println("************************************");
		}
		
		System.out.println();		
		System.out.println("MOVIMENTA��O DA CONTA");
		System.out.print("Deseja realizar um saque? s/n ");
		resposta = readString.nextLine();
		
		if(resposta.equalsIgnoreCase("s")) {
			System.out.print("Qual o valor do saque? ");
			double vSaque = read.nextDouble();
			conta.saque(vSaque);
			System.out.printf("SAQUE DE R$%.2f REALIZADO COM SUCESSO", vSaque);
			System.out.println();
		}
		
		
		System.out.println("EXTRATO:");			
		for(Conta exiba: conta.cadastro) {
			System.out.println();
			System.out.println("************************************");
			System.out.println(exiba);
			System.out.println("************************************");
		}
		
		read.close();
		readString.close();
	}
}

//8 de julho de 2021