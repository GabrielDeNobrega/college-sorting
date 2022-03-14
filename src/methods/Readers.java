package methods;

import java.util.Scanner;

public class Readers {

	public int[] leVetorInt(Scanner sc) {

		System.out.println("Digite a quantidade de números que deseja ler:");
		int size = sc.nextInt();
		int[] vetor = new int[size];

		System.out.printf("%n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor que deseja inserir na posição " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
		}

		return vetor;
	}
	
	public double[] leVetorDouble(Scanner sc) {

		System.out.println("Digite a quantidade de números que deseja ler:");
		int size = sc.nextInt();
		double[] vetor = new double[size];

		System.out.printf("%n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor que deseja inserir na posição " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
		}

		return vetor;
	}

}
