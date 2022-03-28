package methods;

public class Printer {

	public void imprimeVetores(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %d%n", i, a[i]);
		}

	}

	public void imprimeVetores(double[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %.2f%n", i, a[i]);
		}

	}

	public void imprimeVetores(String[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %s%n", i, a[i]);
		}

	}

	public void imprimeVetores(char[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Posi��o %d: %s%n", i, a[i]);
		}

	}

	public void imprimePesquisa(int position, int goalNum) {

		if (position != -1) {
			System.out.printf("O n�mero %d foi encontrado na posi��o %d do vetor!%n", goalNum, position);

		} else {

			System.out.println("O valor n�o foi encontrado no vetor!");

		}

	}
	
	public void imprimePesquisa(int position, double goalNum) {

		if (position != -1) {
			System.out.printf("O n�mero %.2f foi encontrado na posi��o %d do vetor!%n", goalNum, position);

		} else {

			System.out.println("O valor n�o foi encontrado no vetor!");

		}

	}
	
	public void imprimePesquisa(int position, String goalWord) {

		if (position != -1) {
			System.out.printf("A palavra %s foi encontrada na posi��o %d do vetor!%n", goalWord, position);

		} else {

			System.out.println("A palavra n�o foi encontrada no vetor!");

		}

	}
	
	public void imprimePesquisa(int position, char goalLetter) {

		if (position != -1) {
			System.out.printf("A letra %c foi encontrada na posi��o %d do vetor!%n", goalLetter, position);

		} else {

			System.out.println("A letra n�o foi encontrada no vetor!");

		}

	}

}
