package Main;

import java.util.Scanner;
import methods.Readers;
import methods.BubbleSort;
import methods.Printer;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Readers read = new Readers();
		BubbleSort bs = new BubbleSort();
		Printer pr = new Printer();

		int[] a = read.leVetorInt(sc);
		bs.bs(a);
		pr.imprimeVetores(a);

	}

}
