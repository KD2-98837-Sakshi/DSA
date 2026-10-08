package com.sunbeeam;

import java.util.Scanner;
import java.util.Stack;

public class Ass2_Q4_1 {

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

	public static String infixToPostfix(String infix) {

		infix = infix.replace("(", " ( ");
		infix = infix.replace(")", " ) ");

		String[] infixarr = infix.trim().split("\\s+");

		Stack<String> stk = new Stack<>();
		StringBuffer postfix = new StringBuffer();

		for (int i = 0; i < infixarr.length; i++) {

			String ele = infixarr[i];

			if (isInteger(ele)) {
				postfix.append(ele).append(" ");
			}

			else if (ele.equals("(")) {
				stk.push(ele);
			}

			else if (ele.equals(")")) {

				while (!stk.isEmpty() && !stk.peek().equals("(")) {
					postfix.append(stk.pop()).append(" ");
				}

				if (!stk.isEmpty()) {
					stk.pop();
				}
			}

			else {

				while (!stk.isEmpty() && !stk.peek().equals("(") && priority(stk.peek()) >= priority(ele)) {

					postfix.append(stk.pop()).append(" ");
				}

				stk.push(ele);
			}
		}

		while (!stk.isEmpty()) {
			postfix.append(stk.pop()).append(" ");
		}

		return postfix.toString().trim();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the infix expression");
		String infix = scanner.nextLine();

		System.out.println("Postfix: " + infixToPostfix(infix));

		scanner.close();
	}
}