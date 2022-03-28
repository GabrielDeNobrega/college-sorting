package methods;

public class BinarySearch {

	public int binarySearch(int v[], int goalNumber) {

		int size = v.length;
		int vStarts = 0;
		int vEnds = size;
		int middle;

		while (vStarts <= vEnds) {

			middle = (vStarts + vEnds) / 2;

			if (goalNumber == v[middle]) {

				return middle;

			} else if (goalNumber < v[middle]) {

				vEnds = middle - 1;

			} else {

				vStarts = middle + 1;
			}

		}

		return -1;

	}

	public int binarySearch(double v[], double goalNumber) {

		int size = v.length;
		int vStarts = 0;
		int vEnds = size;
		int middle;

		while (vStarts <= vEnds) {

			middle = (vStarts + vEnds) / 2;

			if (goalNumber == v[middle]) {

				return middle;

			} else if (goalNumber < v[middle]) {

				vEnds = middle - 1;

			} else {

				vStarts = middle + 1;
			}

		}

		return -1;

	}

	public int binarySearch(String v[], String goalString) {

		int size = v.length;
		int vStarts = 0;
		int vEnds = size;
		int middle;

		while (vStarts <= vEnds) {

			middle = (vStarts + vEnds) / 2;

			if (goalString.compareToIgnoreCase(v[middle]) == 0) {

				return middle;

			} else if (goalString.compareToIgnoreCase(v[middle]) < 0) {

				vEnds = middle - 1;

			} else {

				vStarts = middle + 1;
			}

		}

		return -1;

	}

	public int binarySearch(char v[], char goalLetter) {

		int size = v.length;
		int vStarts = 0;
		int vEnds = size;
		int middle;

		while (vStarts <= vEnds) {

			middle = (vStarts + vEnds) / 2;

			if (goalLetter == v[middle]) {

				return middle;

			} else if (goalLetter < v[middle]) {

				vEnds = middle - 1;

			} else {

				vStarts = middle + 1;
			}

		}

		return -1;

	}

}
