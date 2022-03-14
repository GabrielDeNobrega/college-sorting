package methods;

public class Printer {

	public void imprimeVetores(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posição %d: %d%n", (i + 1), a[i]);
		}

	}

}
