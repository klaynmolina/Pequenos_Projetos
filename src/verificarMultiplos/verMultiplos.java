package verificarMultiplos;

import java.util.Scanner;

public class verMultiplos extends CalculoVerMultiplos{
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("VERIFICAÇÃO DE MULTIPLOS");
		
		System.out.print("\nInforme o primeiro número inteiro: ");
		int x = read.nextInt();
		
		System.out.print("Informe o segundo número inteiro: ");
		int y = read.nextInt();
		
		CalculoVerMultiplos verificar = new verMultiplos();
				
		if (verificar.calculo1(x, y) == 0 || verificar.calculo2(x, y) == 0) {
			System.out.println("\n-> São multiplos");
		} else {
			System.out.println("\n-> Não são multiplos");
		}
		
		read.close();
	}
}

// 28/07/2021 > implementação classe abstrata
