package methods;

public class SequentialSearch {

	public int sequentialSearch(int v[], int goalNumber) {

		int position = 0;

		for (int i : v) {

			if (i == goalNumber) {
				return position;
			}

			position++;
		}

		return -1;

	}

	public int sequentialSearch(double v[], double goalNumber) {

		int position = 0;

		for (double i : v) {

			if (i == goalNumber) {
				return position;
			}

			position++;
		}

		return -1;

	}

	public int sequentialSearch(String v[], String goalWord) {

		int position = 0;

		for (String i : v) {

			if (i.compareToIgnoreCase(goalWord) == 0) {
				return position;
			}

			position++;
		}

		return -1;

	}

	public int sequentialSearch(char v[], char goalLetter) {

		int position = 0;

		for (char i : v) {

			if (i == goalLetter) {
				return position;
			}

			position++;
		}

		return -1;

	}

}
