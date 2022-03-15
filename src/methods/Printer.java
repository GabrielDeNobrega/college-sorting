package methods;

public class Printer {

	public void imprimeVetores(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %d%n", (i + 1), a[i]);
		}

	}
	
	public void imprimeVetores(double[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %.2f%n", (i + 1), a[i]);
		}

	}
	
	public void imprimeVetores(String[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %s%n", (i + 1), a[i]);
		}

	}
	
	public void imprimeVetores(char[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %s%n", (i + 1), a[i]);
		}

	}

}
