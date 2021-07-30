package imc;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalcularImc2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		//Lambda
		BinaryOperator<Double> calculo = (peso, altura) -> peso / (Math.pow(altura, 2));

		System.out.println("Bem vindo(a) ao CÁLCULO DE IMC!\n");

		String conceito = ("O IMC é um cálculo que ajuda a avaliar se a pessoa está dentro do seu peso ideal, de acordo com a altura.");
		System.out.printf("Você sabe o que é o IMC (Índice de Massa Corporal)? \n%s \n\n", conceito);
	
		System.out.print("Vamos calcular o seu? \nDigite seu peso atual: ");
		double peso = read.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		double altura = read.nextDouble();
		
		double resultado = calculo.apply(peso, altura);

		System.out.printf("\nSeu IMC é: %.2f", resultado);

		System.out.println("\n\nDe acordo com a tabela internacional de avalição de peso, você está: ");

		if (resultado < 18.5) {
			System.out.println(
					"Abaixo do peso ideal. \n\nPoxa! Seria bom procurar um médico especialista para cuidar da sua saúde! \nUm peso ideal nos garante uma melhor qualidade de vida e a prevenção de diversas doenças! \nNão desanime e não abandone sua saúde de lado!");
		} else if ((resultado >= 18.5) && (resultado <= 24.9)) {
			System.out.println(
					"No peso ideal! \n\nParabéns! Mesmo assim, não deixe de acompanhar os cuidados com sua saúde com um profissional!");
		} else {
			System.out.println(
					"Acima do peso ideal. \n\nPoxa! Seria bom procurar um médico especialista para cuidar da sua saúde! \nCom a dieta e exercícios adequados é fácil de reverter isso! \nNão desanime e não abandone sua saúde de lado!");
		}

		System.out.println("\nObrigado por utilizar nosso programa de cálculo IMC! \nAté mais! :)");

		read.close();
	}
}

//20 de abril de 2021
//20 julho de 2021 > implementação Binary Operator e lambda
