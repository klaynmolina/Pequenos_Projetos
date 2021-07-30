package regra_tres;

import java.util.Scanner;

public class RegraTresExecucao {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("REGRA DE TRÊS");
		System.out.println("z = (b * c) / (z * a)");
		
		System.out.println("\n*********");
		System.out.println(" a --- b");
		System.out.println("    X");
		System.out.println(" c --- z");
		System.out.println("*********");
		

		System.out.print("\na = ");
		double a = read.nextDouble();
		System.out.print("b = ");
		double b = read.nextDouble();
		System.out.print("c = ");
		double c = read.nextDouble();
		double z = 1;
		
		z = (b * c) / (z * a);
		
		System.out.printf("\nz = %.1f ", z);

		read.close();
	}

	
}

/*
 * A está para B assim como C está para X
 * 20		   2			40
 */

//26 de abril de 2021 > criação básica