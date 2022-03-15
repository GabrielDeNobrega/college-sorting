package methods;

public class BubbleSort {

	public int[] bs(int vetor[]) {

		int aux;

		for (int i = 0; i < vetor.length; i++) {

			for (int j = 0; j < vetor.length - 1; j++) {

				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}

		}

		return vetor;
	}

	public double[] bs(double vetor[]) {

		double aux;

		for (int i = 0; i < vetor.length; i++) {

			for (int j = 0; j < vetor.length - 1; j++) {

				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}

		}

		return vetor;
	}

	public String[] bs(String vetor[]) {

		String aux;

		for (int i = 0; i < vetor.length; i++) {

			for (int j = 0; j < vetor.length - 1; j++) {

				if (vetor[j].compareTo(vetor[j + 1]) > 0) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}

		}

		return vetor;
	}
	
	public char[] bs(char vetor[]) {

		char aux;

		for (int i = 0; i < vetor.length; i++) {

			for (int j = 0; j < vetor.length - 1; j++) {

				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}

		}

		return vetor;
	}

}
