package hello;

public class InsertionSort {
	private void inserion(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort i = new InsertionSort();
		int[] arr = { 3, 2, 6, 4, 8, 0, 6 };
		int n = arr.length;
		i.inserion(arr, n);
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}
}
