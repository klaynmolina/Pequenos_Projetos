package cadastro_contatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro_Contatos {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner readString = new Scanner(System.in);
		
		ArrayList<Contato> contatos = new ArrayList<> ();
		
		System.out.println("CADASTRO DE CONTATOS");
		System.out.println();
		for (int a = 0; a < 5; a++) {
			System.out.println();
			System.out.println("-NOVO CONTATO-");
			
			System.out.print("Informe o nome: ");
			String nome = readString.nextLine();
						
			System.out.print("Informe o email: ");
			String email = readString.nextLine();
			
			System.out.print("Informe o telefone fixo: ");
			int telefone = read.nextInt();
			
			System.out.print("Informe o telefone celular: ");
			long celular = read.nextLong();
			
			Contato cadastro = new Contato(nome, email, telefone, celular);
			
			contatos.add(cadastro);
		}
		System.out.println("************************");
		
		System.out.println();
		System.out.println("LISTA DE CONTATOS");
		System.out.println();
		for(Contato exibe: contatos) {
			System.out.println(exibe);			
		}
		
		read.close();
		readString.close();
		
	}

}

//7 de julho de 2021 21:04:03