package regra_tres;

import java.util.Scanner;

public class RegraTres {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("REGRA DE TR�S");
		System.out.println("z = (b * c) / (z * a)");
		
		System.out.println("\n*********");
		System.out.println(" a --- b");
		System.out.println("    X");
		System.out.println(" c --- z");
		System.out.println("*********");
		
		//Lambda
		CalculoRegraTres resultado = (a, b, c, z) -> z = (b * c) / (z * a);

		System.out.print("\na = ");
		double a = read.nextDouble();
		System.out.print("b = ");
		double b = read.nextDouble();
		System.out.print("c = ");
		double c = read.nextDouble();
		double x = 1;
		
		
		System.out.printf("\nz = %.1f ", resultado.calcular(a, b, c, x));

		read.close();
	}

	
}

/*
 * A est� para B assim como C est� para X
 * 20		   2			40
 */

//26 de abril de 2021 > cria��o b�sica
//28 de julho de 2021 > Implementa��o Interface e Lambda