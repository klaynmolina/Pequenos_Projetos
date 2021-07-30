package calculadora_media;

import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Quantas avali��es ser�o aplicadas? ");
		int quantidadeAvaliacoes = read.nextInt();
		System.out.println();

		if (quantidadeAvaliacoes > 0) {

			double[] notas = new double[quantidadeAvaliacoes];

			double soma = 0.0;

			for (int contador = 0; contador < notas.length; contador++) {

				System.out.printf("%d� avalia��o: ", (contador + 1));
				notas[contador] = read.nextDouble();

				soma = soma + notas[contador];
			}

			System.out.println();
			System.out.println("----------QUADRO GERAL----------");
			System.out.println();

			int contagem = 0;
			for (double nota : notas) {
				System.out.println();
				System.out.printf("Valor da %d� avalia��o: %.1f", (contagem + 1), nota);
				contagem++;
			}
			
			System.out.println();

			double media = soma / quantidadeAvaliacoes;
			System.out.println();
			System.out.printf("M�dia: %.1f", media);

			System.out.println();
			if (media < 0) {
				System.out.println();
				System.out.println("VALOR DESCONSIDERADO");
			} else if (media < 7) {
				System.out.println();
				System.out.println("ABAIXO DA M�DIA");
			} else if (media == 7) {
				System.out.println();
				System.out.println("NA M�DIA");
			} else if (media > 7) {
				System.out.println();
				System.out.println("ACIMA DA M�DIA");
			}

		} else {
			System.out.println("VALOR INV�LIDO. PROGRAMA ENCERRADO");
		}

		read.close();
	}
}

//13 de maio de 2021