package imc;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		String conceito = ("O IMC (Índice de Massa Corporal) é um cálculo que ajuda a avaliar se a pessoa está dentro do seu peso ideal, de acordo com a altura.");
		double peso, altura, IMC;

		Scanner read = new Scanner(System.in);

		System.out.println("Bem vindo(a) ao CÁLCULO DE IMC!\n");

		System.out.printf("Você sabe o que é o IMC? %s \n\n", conceito);

		System.out.println("Vamos calcular o seu? \n\nDigite seu peso atual: ");
		peso = read.nextDouble();

		System.out.println("\nAgora, digite sua altura em metros: ");
		altura = read.nextDouble();

		// calculo = peso/(altura*altura);
		IMC = peso / (Math.pow(altura, 2));

		System.out.printf("\nLegal! Seu IMC é: %.2f", IMC);

		System.out.println("\nAgora, verificando a tabela internacional de avalição de peso, você está: \n");

		if (IMC < 18.5) {
			System.out.println(
					"Abaixo do peso ideal. \n\nPoxa! Seria bom procurar um médico especialista para cuidar da sua saúde! :)\n");
		} else if ((IMC >= 18.5) && (IMC <= 24.9)) {
			System.out.println(
					"No peso ideal! \n\nParabéns! Mesmo assim, não deixe de acompanhar os cuidados com sua saúde com um profissional! :)\n");
		} else {
			System.out.println(
					"Acima do peso ideal. \n\nPoxa! Seria bom procurar um médico especialista para cuidar da sua saúde! Com a dieta e exercícios adequados é fácil de reverter isso! Não desanime e não abandone sua saúde de lado! :)\n");
		}

		System.out.println("\nObrigado por utilizar nosso programa de cálculo IMC! Até mais!");

		read.close();
	}
}

//20 de abril de 2021 19:03:53
