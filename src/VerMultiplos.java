

import java.util.Scanner;

public class VerMultiplos {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("VERIFICAÇÃO DE MULTIPLOS");
		
	
		System.out.print("\nInforme o primeiro número inteiro: ");
		double x = read.nextInt();
		
		System.out.print("Informe o segundo número inteiro: ");
		double y = read.nextInt();
		
		double r1 = x%y;
		double r2 = y%x;
		
		if (r1 == 0.0 || r2 == 0.0) {
			System.out.println("\n-> São multiplos");
		} else {
			System.out.println("\n-> Não são multiplos");
		}
		
		read.close();
	}
}

// 7 de abril de 2021
