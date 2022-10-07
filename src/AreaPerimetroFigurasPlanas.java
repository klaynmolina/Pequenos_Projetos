
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaPerimetroFigurasPlanas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		boolean controle = true;
		while (controle) {
			try {
				System.out.println("\nCÁLCULO DE ÁREA E PERÍMETRO\n");
				System.out.println("1. Triangulo");
				System.out.println("2. Quadrado");
				System.out.println("3. Círculo");
				System.out.println("4. Trapézio");
				System.out.println("5. Losango");
				System.out.println("6. Retângulo");
				System.out.println("0. Encerrar programa.");
				System.out.print("\nDigite sua escolha: ");
				int escolha = read.nextInt();

				switch (escolha) {
				case 1:
					System.out.println("Triangulo\n".toUpperCase());
					triangulo(read);
					break;
				case 2:
					System.out.println("\nQuadrado\n".toUpperCase());
					quadrado(read);
					break;
				case 3:
					System.out.println("\nCírculo\n".toUpperCase());
					circulo(read);
					break;
				case 4:
					System.out.println("\nTrapézio\n".toUpperCase());
					trapezio(read);
					break;
				case 5:
					System.out.println("\nLosango\n".toUpperCase());
					losango(read);
					break;
				case 6:
					System.out.println("\nRetângulo\n".toUpperCase());
					retangulo(read);
					break;
				case 0:
					System.out.println("\nPROGRAMA ENCERRADO.");
					controle = false;
					break;

				default:
					System.out.println("\nEscolha inválida.");
					break;
				}
				if (escolha != 0) {
					System.out.print("\nDeseja calcular algo mais? 1. Sim / 2. Não ");
					int resposta = read.nextInt();
					if (resposta == 2) {
						controle = false;
						System.out.println("\nPROGRAMA ENCERRADO.");
					} else if (resposta != 1 || resposta != 2) {
						System.out.println("\nResposta inválida.");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("\nResposta inválida.");
				read.next();
			} catch (RuntimeException e) {
				System.out.println("\nErro desconhecido.");
				read.next();
			}
		}
	}

	private static void triangulo(Scanner read) {
		double base, altura, area, perimetro, ladoA, ladoB, ladoC;
		System.out.print("Base: ");
		base = read.nextDouble();

		System.out.print("Altura: ");
		altura = read.nextDouble();

		System.out.print("Lado A: ");
		ladoA = read.nextDouble();

		System.out.print("Lado B: ");
		ladoB = read.nextDouble();

		System.out.print("Lado C: ");
		ladoC = read.nextDouble();

		area = (base * altura) / 2;
		perimetro = ladoA + ladoB + ladoC;

		System.out.printf("\nÁrea do triangulo: %.1f \n", area);
		System.out.printf("Perímetro do triangulo: %.1f", perimetro);
	}

	private static void quadrado(Scanner read) {
		double area, perimetro, l;
		System.out.print("Lado: ");
		l = read.nextDouble();

		area = Math.pow(l, 2);
		perimetro = 4 * l;

		System.out.printf("\nÁrea do quadrado: %.1f \n", area);
		System.out.printf("Perímetro do quadrado: %.1f", perimetro);
	}

	private static void circulo(Scanner read) {
		double area, perimetro, raio;
		final double PI = 3.14;

		System.out.print("Raio: ");
		raio = read.nextDouble();

		area = PI * Math.pow(raio, 2);
		perimetro = 2 * PI * raio;

		System.out.printf("\nÁrea do círculo: %.1f \n", area);
		System.out.printf("Perímetro do círculo: %.1f", perimetro);
	}

	private static void trapezio(Scanner read) {
		double area, perimetro, baseMaior, baseMenor, ladoA, ladoB, altura;

		System.out.print("Base Maior: ");
		baseMaior = read.nextDouble();

		System.out.print("Base Menor: ");
		baseMenor = read.nextDouble();

		System.out.print("Altura: ");
		altura = read.nextDouble();

		System.out.print("Lado A: ");
		ladoA = read.nextDouble();

		System.out.print("Lado B: ");
		ladoB = read.nextDouble();

		area = ((baseMaior + baseMenor) * altura) / 2;
		perimetro = baseMaior + baseMenor + ladoA + ladoB;

		System.out.printf("\nÁrea do trapézio: %.1f \n", area);
		System.out.printf("Perímetro do trapézio: %.1f", perimetro);
	}

	private static void losango(Scanner read) {
		double area, perimetro, diagonalMaior, diagonalMenor, lado;

		System.out.print("Base Maior: ");
		diagonalMaior = read.nextDouble();

		System.out.print("Base Menor: ");
		diagonalMenor = read.nextDouble();

		System.out.print("Lado: ");
		lado = read.nextDouble();

		area = (diagonalMaior * diagonalMenor) / 2;
		perimetro = 4 * lado;

		System.out.printf("\nÁrea do losango: %.1f \n", area);
		System.out.printf("Perímetro do losango: %.1f", perimetro);
	}

	private static void retangulo(Scanner read) {
		double area, perimetro, base, altura;

		System.out.print("Base: ");
		base = read.nextDouble();

		System.out.print("Altura: ");
		altura = read.nextDouble();

		area = base * altura;
		perimetro = 2 * (base + altura);

		System.out.printf("\nÁrea do retângulo: %.1f \n", area);
		System.out.printf("Perímetro do retângulo: %.1f", perimetro);
	}

}
