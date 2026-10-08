import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass1_Q2 {

	public static int lastOcuurenceidx(int[] arr, int key) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (key == arr[i]) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, flag = 0;
		System.out.println("enter number of elements:");
		n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elment");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the key to be searched: ");
		int key = scanner.nextInt();

		int idx = lastOcuurenceidx(arr, key);

		if (idx != -1) {
			System.out.println("index of last occurance of key: " + idx);
		} else {
			System.out.println("element not present");
		}
	}

}
