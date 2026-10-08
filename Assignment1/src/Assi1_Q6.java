import java.util.Scanner;

public class Assi1_Q6 {
	public static String removeDuplicates(String s) {
		StringBuffer sb = new StringBuffer();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(ch);
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String string = scanner.next();
		System.out.println("Final str is: " + removeDuplicates(string));
	}

}
