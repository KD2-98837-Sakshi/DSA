import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Assi1_Q5 {
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the term:");
		int n=scanner.nextInt();
		System.out.println(fib(n));

	}

}
