package methods;

public class BubbleSort {

	public int[] bs(int a[]) {

		int aux;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

		return a;
	}

	public double[] bs(double a[]) {

		double aux;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

		return a;
	}

	public String[] bs(String a[]) {

		String aux;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j].compareTo(a[j + 1]) > 0) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

		return a;
	}
	
	public char[] bs(char a[]) {

		char aux;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

		return a;
	}

}
