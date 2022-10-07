

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class VerMultiplos2 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("VERIFICA��O DE MULTIPLOS");
		
		//Lambda e Binary Operator
		BinaryOperator<Double> calculo1 = (x,y) -> x%y;
		BinaryOperator<Double> calculo2 = (x,y) -> y%x;
		
		System.out.print("\nInforme o primeiro n�mero inteiro: ");
		double x = read.nextInt();
		
		System.out.print("Informe o segundo n�mero inteiro: ");
		double y = read.nextInt();
		
		if (calculo1.apply(x, y) == 0.0 || calculo2.apply(x, y) == 0.0) {
			System.out.println("\n-> S�o multiplos");
		} else {
			System.out.println("\n-> N�o s�o multiplos");
		}
		
		read.close();
	}
}

// 29/07/2021 Scanner/BinaryOperator/Lambda/IfElse 
