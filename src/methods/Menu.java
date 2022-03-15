package methods;

import java.util.Scanner;

public class Menu {

	public int Escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" 
		+ "**-- Digite o número da operação que deseja realizar --**%n");
		System.out.printf("1 - Bubble Sort (Inteiros)%n" 
				+ "2 - Bubble Sort (Doubles)%n" 
				+ "3 - Bubble Sort (Strings)%n"
				+ "4 - Bubble Sort (Chars)%n" 
				+ "5 - Selection Sort (Inteiros)%n" 
				+ "6 - Selection Sort (Doubles)%n"
				+ "7 - Selection Sort (Strings)%n" 
				+ "8 - Selection Sort (Chars)%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public void MenuMaster(int escolha, Scanner sc) {

		Readers read = new Readers();
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
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

		case 5:
			int[] e = read.leVetorInt(sc);
			ss.ss(e);
			pr.imprimeVetores(e);
			break;

		case 6:
			double[] f = read.leVetorDouble(sc);
			ss.ss(f);
			pr.imprimeVetores(f);
			break;

		case 7:
			String[] g = read.leVetorString(sc);
			ss.ss(g);
			pr.imprimeVetores(g);
			break;

		case 8:
			char[] h = read.leVetorChar(sc);
			ss.ss(h);
			pr.imprimeVetores(h);
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

			System.out.printf("%nDeseja sair do programa? Digite 1.%n" + "Deseja continuar? Digite 2.%n");
			aux = sc.nextInt();
			System.out.println();

		} while (aux != 1);

	}

}
