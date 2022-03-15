package methods;

import java.util.Scanner;

public class Menu {

	public int Escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" + "**-- Digite o número da operação que deseja realizar --**%n");
		System.out.printf("1 - Bubble Sort (Inteiros)%n" + "2 - Bubble Sort (Doubles)%n" + "3 - Bubble Sort (Strings)%n"
				+ "4 - Bubble Sort (Chars)%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public void MenuMaster(int escolha, Scanner sc) {

		Readers read = new Readers();
		BubbleSort bs = new BubbleSort();
		Printer pr = new Printer();

		switch (escolha) {

		case 1:
			int[] a = read.leVetorInt(sc);
			bs.bs(a);
			pr.imprimeVetores(a);
			break;

		case 2:
			double[] b = read.leVetorDouble(sc);
			bs.bs(b);
			pr.imprimeVetores(b);
			break;

		case 3:
			String[] c = read.leVetorString(sc);
			bs.bs(c);
			pr.imprimeVetores(c);
			break;

		case 4:
			char[] d = read.leVetorChar(sc);
			bs.bs(d);
			pr.imprimeVetores(d);
			break;

		default:
			System.out.println("Escolha uma opção válida.");
			break;
		}
	}

	public void Repetidor(Scanner sc) {

		int aux = 0;

		do {
			MenuMaster(Escolher(sc), sc);

			System.out.printf("%nDeseja sair do programa? Digite 1.%n" 
			+ "Deseja continuar? Digite 2.%n");
			aux = sc.nextInt();
			System.out.println();

		} while (aux != 1);

	}

}
