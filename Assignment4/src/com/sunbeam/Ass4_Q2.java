package com.sunbeam;

import java.util.Scanner;

public class Ass4_Q2 {
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];

			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		System.out.println("Enter sorted array elements:");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("Enter target:");
		int target = sc.nextInt();

		int[] result = twoSum(numbers, target);

		if (result.length == 2) {
			System.out.println("Indices: " + result[0] + " " + result[1]);
		} else {
			System.out.println("No pair found");
		}

		sc.close();
	}
}
