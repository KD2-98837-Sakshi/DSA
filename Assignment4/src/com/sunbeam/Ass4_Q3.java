package com.sunbeam;

import java.util.Scanner;

public class Ass4_Q3 {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int max = 0;

		while (left < right) {
			int h = Math.min(height[left], height[right]);
			int width = right - left;
			int area = h * width;

			max = Math.max(max, area);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] height = new int[n];

		System.out.println("Enter heights:");
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		System.out.println("Maximum water area: " + maxArea(height));

		sc.close();
	}
}
