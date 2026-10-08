import java.util.Scanner;

public class Ass1_Q4 {

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key < arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, ocu;
		System.out.println("enter number of elements:");
		n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elment");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the key to be searched: ");
		int key = scanner.nextInt();
		int idx = binarySearch(arr, key);
		if (idx != -1) {
			System.out.println("Key found at index " + idx);
		} else {
			System.out.println("key not found");
		}

	}

}
