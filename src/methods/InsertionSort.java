package methods;

public class InsertionSort {

	public int[] is(int vetor[]) {

		int currentPosi, aux;

		for (int i = 1; i < vetor.length; i++) {

			currentPosi = i;

			while (vetor[currentPosi] < vetor[currentPosi - 1]) {

				aux = vetor[currentPosi];
				vetor[currentPosi] = vetor[currentPosi - 1];
				vetor[currentPosi - 1] = aux;
				currentPosi--;

				if (currentPosi == 0) {

					break;

				}

			}

		}

		return vetor;
	}
	
	public double[] is(double vetor[]) {

		int currentPosi; 
		double aux;

		for (int i = 1; i < vetor.length; i++) {

			currentPosi = i;

			while (vetor[currentPosi] < vetor[currentPosi - 1]) {

				aux = vetor[currentPosi];
				vetor[currentPosi] = vetor[currentPosi - 1];
				vetor[currentPosi - 1] = aux;
				currentPosi--;

				if (currentPosi == 0) {

					break;

				}

			}

		}

		return vetor;
	}
	
	public String[] is(String vetor[]) {

		int currentPosi; 
		String aux;

		for (int i = 1; i < vetor.length; i++) {

			currentPosi = i;

			while (vetor[currentPosi].compareToIgnoreCase(vetor[currentPosi - 1]) < 0) {

				aux = vetor[currentPosi];
				vetor[currentPosi] = vetor[currentPosi - 1];
				vetor[currentPosi - 1] = aux;
				currentPosi--;

				if (currentPosi == 0) {

					break;

				}

			}

		}

		return vetor;
	}
	
	public char[] is(char vetor[]) {

		int currentPosi; 
		char aux;

		for (int i = 1; i < vetor.length; i++) {

			currentPosi = i;

			while (vetor[currentPosi] < vetor[currentPosi - 1]) {

				aux = vetor[currentPosi];
				vetor[currentPosi] = vetor[currentPosi - 1];
				vetor[currentPosi - 1] = aux;
				currentPosi--;

				if (currentPosi == 0) {

					break;

				}

			}

		}

		return vetor;
	}


}
