

import java.util.Scanner;

public class VerMultiplos {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("VERIFICA��O DE MULTIPLOS");
		
	
		System.out.print("\nInforme o primeiro n�mero inteiro: ");
		double x = read.nextInt();
		
		System.out.print("Informe o segundo n�mero inteiro: ");
		double y = read.nextInt();
		
		double r1 = x%y;
		double r2 = y%x;
		
		if (r1 == 0.0 || r2 == 0.0) {
			System.out.println("\n-> S�o multiplos");
		} else {
			System.out.println("\n-> N�o s�o multiplos");
		}
		
		read.close();
	}
}

// 7 de abril de 2021
