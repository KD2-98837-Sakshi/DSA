import java.util.Scanner;

public class Ass1_Q3 {

	public static int nthOcuurace(int[] arr, int key, int ocu) {
		int cnt = 0;
		int idx;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				cnt++;
				if (cnt == ocu) {
					return i;
				}
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
		System.out.println("Enter the occurance");
		ocu = scanner.nextInt();
		int idx=nthOcuurace(arr, key, ocu);
		if (idx != -1) {
			System.out.println("index of last occurance of key: " + idx);
		} else {
			System.out.println("element not present");
		}
		
	}

}
