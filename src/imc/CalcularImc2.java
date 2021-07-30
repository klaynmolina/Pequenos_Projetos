package imc;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalcularImc2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		//Lambda
		BinaryOperator<Double> calculo = (peso, altura) -> peso / (Math.pow(altura, 2));

		System.out.println("Bem vindo(a) ao C�LCULO DE IMC!\n");

		String conceito = ("O IMC � um c�lculo que ajuda a avaliar se a pessoa est� dentro do seu peso ideal, de acordo com a altura.");
		System.out.printf("Voc� sabe o que � o IMC (�ndice de Massa Corporal)? \n%s \n\n", conceito);
	
		System.out.print("Vamos calcular o seu? \nDigite seu peso atual: ");
		double peso = read.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		double altura = read.nextDouble();
		
		double resultado = calculo.apply(peso, altura);

		System.out.printf("\nSeu IMC �: %.2f", resultado);

		System.out.println("\n\nDe acordo com a tabela internacional de avali��o de peso, voc� est�: ");

		if (resultado < 18.5) {
			System.out.println(
					"Abaixo do peso ideal. \n\nPoxa! Seria bom procurar um m�dico especialista para cuidar da sua sa�de! \nUm peso ideal nos garante uma melhor qualidade de vida e a preven��o de diversas doen�as! \nN�o desanime e n�o abandone sua sa�de de lado!");
		} else if ((resultado >= 18.5) && (resultado <= 24.9)) {
			System.out.println(
					"No peso ideal! \n\nParab�ns! Mesmo assim, n�o deixe de acompanhar os cuidados com sua sa�de com um profissional!");
		} else {
			System.out.println(
					"Acima do peso ideal. \n\nPoxa! Seria bom procurar um m�dico especialista para cuidar da sua sa�de! \nCom a dieta e exerc�cios adequados � f�cil de reverter isso! \nN�o desanime e n�o abandone sua sa�de de lado!");
		}

		System.out.println("\nObrigado por utilizar nosso programa de c�lculo IMC! \nAt� mais! :)");

		read.close();
	}
}

//20 de abril de 2021
//20 julho de 2021 > implementa��o Binary Operator e lambda
