package verificarMultiplos;

import java.util.Scanner;

public class verMultiplos extends CalculoVerMultiplos{
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("VERIFICA��O DE MULTIPLOS");
		
		System.out.print("\nInforme o primeiro n�mero inteiro: ");
		int x = read.nextInt();
		
		System.out.print("Informe o segundo n�mero inteiro: ");
		int y = read.nextInt();
		
		CalculoVerMultiplos verificar = new verMultiplos();
				
		if (verificar.calculo1(x, y) == 0 || verificar.calculo2(x, y) == 0) {
			System.out.println("\n-> S�o multiplos");
		} else {
			System.out.println("\n-> N�o s�o multiplos");
		}
		
		read.close();
	}
}

// 28/07/2021 > implementa��o classe abstrata
