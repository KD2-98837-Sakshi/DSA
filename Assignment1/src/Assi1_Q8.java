import java.util.Scanner;

public class Assi1_Q8 {

	public static int firstNonRepeatingElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				return arr[i];
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("enter number of elements:");
		n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elment");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int ele = firstNonRepeatingElement(arr);
		System.out.println(ele);
		if (ele != -1) {
			System.out.println("first non-repeating element  is: " + ele);
		} else {
			System.out.println("no element");
		}

	}

}
