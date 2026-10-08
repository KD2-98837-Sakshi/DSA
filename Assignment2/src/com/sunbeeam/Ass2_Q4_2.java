package com.sunbeeam;

import java.util.Scanner;
import java.util.Stack;

public class Ass2_Q4_2 {

	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int priority(String opr) {
		switch (opr) {
		case "$":
			return 10;

		case "*":
		case "/":
		case "%":
			return 9;

		case "+":
		case "-":
			return 8;

		default:
			return 0;
		}
	}

	public static String infixToPrefix(String infix) {

		infix = infix.replace("(", " ( ");
		infix = infix.replace(")", " ) ");

		String[] infixarr = infix.trim().split("\\s+");

		Stack<String> stk = new Stack<>();
		Stack<String> result = new Stack<>();

		for (int i = infixarr.length - 1; i >= 0; i--) {

			String ele = infixarr[i];

			if (isInteger(ele)) {
				result.push(ele);
			}

			else if (ele.equals(")")) {
				stk.push(ele);
			}

			else if (ele.equals("(")) {

				while (!stk.isEmpty() && !stk.peek().equals(")")) {
					result.push(stk.pop());
				}

				if (!stk.isEmpty()) {
					stk.pop();
				}
			}

			else {

				while (!stk.isEmpty() && !stk.peek().equals(")") && priority(stk.peek()) > priority(ele)) {

					result.push(stk.pop());
				}

				stk.push(ele);
			}
		}

		while (!stk.isEmpty()) {
			result.push(stk.pop());
		}

		StringBuffer prefix = new StringBuffer();

		while (!result.isEmpty()) {
			prefix.append(result.pop()).append(" ");
		}

		return prefix.toString().trim();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the infix expression");
		String infix = scanner.nextLine();

		System.out.println("Prefix: " + infixToPrefix(infix));

		scanner.close();
	}
}