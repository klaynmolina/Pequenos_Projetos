package regra_tres;

import java.util.Scanner;

public class RegraTres {
	
	
	public static void main(String[] args) {
		
		double a, b, c, x = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n****************");
		System.out.println(" A est� para B");
		System.out.println("  assim como");
		System.out.println(" C est� para X");
		System.out.println("****************");
		
		System.out.println();

		System.out.println("Agora, vamos calcular:");

		System.out.print("\nDigite o n�mero correspondente a A: ");
		a = teclado.nextDouble();
		System.out.print("\nDigite o n�mero correspondente a B: ");
		b = teclado.nextDouble();
		System.out.print("\nDigite o n�mero correspondente a C: ");
		c = teclado.nextDouble();

		double calculo = x = (b * c) / (x * a);

		System.out.printf("\nX tem o valor de: %.2f ", calculo);

		teclado.close();
	}
}

/*
 * A est� para B assim como C est� para X
 * 20		   2			40
 */

//26 de abril de 2021 20:59:19