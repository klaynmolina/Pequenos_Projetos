package imc;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		String conceito = ("O IMC (�ndice de Massa Corporal) � um c�lculo que ajuda a avaliar se a pessoa est� dentro do seu peso ideal, de acordo com a altura.");
		double peso, altura, IMC;

		Scanner read = new Scanner(System.in);

		System.out.println("Bem vindo(a) ao C�LCULO DE IMC!\n");

		System.out.printf("Voc� sabe o que � o IMC? %s \n\n", conceito);

		System.out.println("Vamos calcular o seu? \n\nDigite seu peso atual: ");
		peso = read.nextDouble();

		System.out.println("\nAgora, digite sua altura em metros: ");
		altura = read.nextDouble();

		// calculo = peso/(altura*altura);
		IMC = peso / (Math.pow(altura, 2));

		System.out.printf("\nLegal! Seu IMC �: %.2f", IMC);

		System.out.println("\nAgora, verificando a tabela internacional de avali��o de peso, voc� est�: \n");

		if (IMC < 18.5) {
			System.out.println(
					"Abaixo do peso ideal. \n\nPoxa! Seria bom procurar um m�dico especialista para cuidar da sua sa�de! :)\n");
		} else if ((IMC >= 18.5) && (IMC <= 24.9)) {
			System.out.println(
					"No peso ideal! \n\nParab�ns! Mesmo assim, n�o deixe de acompanhar os cuidados com sua sa�de com um profissional! :)\n");
		} else {
			System.out.println(
					"Acima do peso ideal. \n\nPoxa! Seria bom procurar um m�dico especialista para cuidar da sua sa�de! Com a dieta e exerc�cios adequados � f�cil de reverter isso! N�o desanime e n�o abandone sua sa�de de lado! :)\n");
		}

		System.out.println("\nObrigado por utilizar nosso programa de c�lculo IMC! At� mais!");

		read.close();
	}
}

//20 de abril de 2021 19:03:53
