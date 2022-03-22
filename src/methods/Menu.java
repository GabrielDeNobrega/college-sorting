package methods;

import java.util.Scanner;

public class Menu {

	public int Escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" + "**-- Digite o número da operação que deseja realizar --**%n%n");
		System.out.printf("01 - Bubble Sort (Inteiros)%n" + "02 - Bubble Sort (Doubles)%n" + "03 - Bubble Sort (Strings)%n"
				+ "04 - Bubble Sort (Chars)%n%n" + "05 - Selection Sort (Inteiros)%n" + "06 - Selection Sort (Doubles)%n"
				+ "07 - Selection Sort (Strings)%n" + "08 - Selection Sort (Chars)%n%n"
				+ "09 - Insertion Sort (Inteiros)%n" + "10 - Insertion Sort (Doubles)%n"
				+ "11 - Insertion Sort (Strings)%n" + "12 - Insertion Sort (Chars)%n%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public void MenuMaster(int escolha, Scanner sc) {

		Readers read = new Readers();
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		Printer pr = new Printer();

		int[] a;
		double[] b;
		String[] c;
		char[] d;

		switch (escolha) {

		case 1:
			a = read.leVetorInt(sc);
			bs.bs(a);
			pr.imprimeVetores(a);
			break;

		case 2:
			b = read.leVetorDouble(sc);
			bs.bs(b);
			pr.imprimeVetores(b);
			break;

		case 3:
			c = read.leVetorString(sc);
			bs.bs(c);
			pr.imprimeVetores(c);
			break;

		case 4:
			d = read.leVetorChar(sc);
			bs.bs(d);
			pr.imprimeVetores(d);
			break;

		case 5:
			a = read.leVetorInt(sc);
			ss.ss(a);
			pr.imprimeVetores(a);
			break;

		case 6:
			b = read.leVetorDouble(sc);
			ss.ss(b);
			pr.imprimeVetores(b);
			break;

		case 7:
			c = read.leVetorString(sc);
			ss.ss(c);
			pr.imprimeVetores(c);
			break;

		case 8:
			d = read.leVetorChar(sc);
			ss.ss(d);
			pr.imprimeVetores(d);
			break;

		case 9:
			a = read.leVetorInt(sc);
			is.is(a);
			pr.imprimeVetores(a);
			break;

		case 10:
			b = read.leVetorDouble(sc);
			is.is(b);
			pr.imprimeVetores(b);
			break;
			
		case 11:
			c = read.leVetorString(sc);
			is.is(c);
			pr.imprimeVetores(c);
			break;
			
		case 12:
			d = read.leVetorChar(sc);
			is.is(d);
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

			System.out.printf("%nDeseja sair do programa? Digite 1.%n" + "Deseja continuar? Digite 2.%n");
			aux = sc.nextInt();
			System.out.println();

		} while (aux != 1);

	}

}
