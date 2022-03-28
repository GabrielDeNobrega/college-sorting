package methods;

import java.util.Scanner;

public class Menu {

	public int escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" + "**-- Digite o número da operação que deseja realizar --**%n%n");
		System.out.printf("01 - Bubble Sort (Inteiros)%n" + "02 - Bubble Sort (Doubles)%n"
				+ "03 - Bubble Sort (Strings)%n" + "04 - Bubble Sort (Chars)%n%n" + "05 - Selection Sort (Inteiros)%n"
				+ "06 - Selection Sort (Doubles)%n" + "07 - Selection Sort (Strings)%n"
				+ "08 - Selection Sort (Chars)%n%n" + "09 - Insertion Sort (Inteiros)%n"
				+ "10 - Insertion Sort (Doubles)%n" + "11 - Insertion Sort (Strings)%n"
				+ "12 - Insertion Sort (Chars)%n%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public boolean desejaPesquisar(Scanner sc) {

		int escolha;

		System.out.printf("%nDesejar pesquisar algo no vetor ordenado?%n" + "1 - SIM%n" + "2 - NÃO%n");
		escolha = sc.nextInt();

		if (escolha == 1) {

			return true;

		} else {

			return false;

		}

	}

	public void menuMaster(int escolha, Scanner sc) {

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
			menuMasterPesquisas(desejaPesquisar(sc), a, sc);
			break;

		case 2:
			b = read.leVetorDouble(sc);
			bs.bs(b);
			pr.imprimeVetores(b);
			menuMasterPesquisas(desejaPesquisar(sc), b, sc);
			break;

		case 3:
			c = read.leVetorString(sc);
			bs.bs(c);
			pr.imprimeVetores(c);
			menuMasterPesquisas(desejaPesquisar(sc), c, sc);
			break;

		case 4:
			d = read.leVetorChar(sc);
			bs.bs(d);
			pr.imprimeVetores(d);
			menuMasterPesquisas(desejaPesquisar(sc), d, sc);
			break;

		case 5:
			a = read.leVetorInt(sc);
			ss.ss(a);
			pr.imprimeVetores(a);
			menuMasterPesquisas(desejaPesquisar(sc), a, sc);
			break;

		case 6:
			b = read.leVetorDouble(sc);
			ss.ss(b);
			pr.imprimeVetores(b);
			menuMasterPesquisas(desejaPesquisar(sc), b, sc);
			break;

		case 7:
			c = read.leVetorString(sc);
			ss.ss(c);
			pr.imprimeVetores(c);
			menuMasterPesquisas(desejaPesquisar(sc), c, sc);
			break;

		case 8:
			d = read.leVetorChar(sc);
			ss.ss(d);
			pr.imprimeVetores(d);
			menuMasterPesquisas(desejaPesquisar(sc), d, sc);
			break;

		case 9:
			a = read.leVetorInt(sc);
			is.is(a);
			pr.imprimeVetores(a);
			menuMasterPesquisas(desejaPesquisar(sc), a, sc);
			break;

		case 10:
			b = read.leVetorDouble(sc);
			is.is(b);
			pr.imprimeVetores(b);
			menuMasterPesquisas(desejaPesquisar(sc), b, sc);
			break;

		case 11:
			c = read.leVetorString(sc);
			is.is(c);
			pr.imprimeVetores(c);
			menuMasterPesquisas(desejaPesquisar(sc), c, sc);
			break;

		case 12:
			d = read.leVetorChar(sc);
			is.is(d);
			pr.imprimeVetores(d);
			menuMasterPesquisas(desejaPesquisar(sc), d, sc);
			break;

		default:
			System.out.println("Escolha uma opção válida.");
			break;
		}
	}

	public int tipoPesquisa(Scanner sc) {

		System.out.printf("Qual pesquisa deseja realizar?%n" + "1 - Sequential Search%n" + "2 - Binary Search%n");
		int tipo = sc.nextInt();

		return tipo;

	}

	public int numeroDesejadoI(Scanner sc) {

		System.out.printf("Qual número deseja encontrar?%n");
		int numero = sc.nextInt();

		return numero;

	}
	
	public double numeroDesejadoD(Scanner sc) {

		System.out.printf("Qual número deseja encontrar?%n");
		double numero = sc.nextDouble();

		return numero;

	}
	
	public String palavraDesejada(Scanner sc) {

		System.out.printf("Qual palavra deseja encontrar?%n");
		String palavra = sc.next();

		return palavra;

	}
	
	public char letraDesejada(Scanner sc) {

		System.out.printf("Qual letra deseja encontrar?%n");
		char palavra = sc.next().charAt(0);
		return palavra;

	}
	
	
	public void menuMasterPesquisas(boolean escolha, int[] vetor, Scanner sc) {

		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		if (escolha == true) {

			int goalNum = numeroDesejadoI(sc);
			int tipo = tipoPesquisa(sc);

			switch (tipo) {

			case 1:

				break;

			case 2:
				int position = bs.binarySearch(vetor, goalNum);
				pr.imprimePesquisa(position, goalNum);
				break;

			default:
				System.out.println("Escolha uma opção válida.");
				break;
			}

		}

	}
	
	public void menuMasterPesquisas(boolean escolha, double[] vetor, Scanner sc) {

		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		if (escolha == true) {

			double goalNum = numeroDesejadoD(sc);
			int tipo = tipoPesquisa(sc);

			switch (tipo) {

			case 1:

				break;

			case 2:
				int position = bs.binarySearch(vetor, goalNum);
				pr.imprimePesquisa(position, goalNum);
				break;

			default:
				System.out.println("Escolha uma opção válida.");
				break;
			}

		}

	}
	
	public void menuMasterPesquisas(boolean escolha, String[] vetor, Scanner sc) {

		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		if (escolha == true) {

			String goalWord = palavraDesejada(sc);
			int tipo = tipoPesquisa(sc);

			switch (tipo) {

			case 1:

				break;

			case 2:
				int position = bs.binarySearch(vetor, goalWord);
				pr.imprimePesquisa(position, goalWord);
				break;

			default:
				System.out.println("Escolha uma opção válida.");
				break;
			}

		}

	}
	
	public void menuMasterPesquisas(boolean escolha, char[] vetor, Scanner sc) {

		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		if (escolha == true) {

			char goalLetter = letraDesejada(sc);
			int tipo = tipoPesquisa(sc);

			switch (tipo) {

			case 1:

				break;

			case 2:
				int position = bs.binarySearch(vetor, goalLetter);
				pr.imprimePesquisa(position, goalLetter);
				break;

			default:
				System.out.println("Escolha uma opção válida.");
				break;
			}

		}

	}
	

	public void repetidor(Scanner sc) {

		int aux = 0;

		do {

			menuMaster(escolher(sc), sc);

			System.out.printf("%nDeseja sair do programa? Digite 1.%n" + "Deseja continuar? Digite 2.%n");
			aux = sc.nextInt();
			System.out.println();

		} while (aux != 1);

	}

}
