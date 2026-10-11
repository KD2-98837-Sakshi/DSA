package com.sunbeam;

import java.util.HashMap;
import java.util.Scanner;

public class Ass4_Q1 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];

			if (map.containsKey(rem)) {
				return new int[] { map.get(rem), i };
			}

			map.put(nums[i], i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] nums = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println("Enter target:");
		int target = sc.nextInt();

		int[] result = twoSum(nums, target);

		if (result.length == 2) {
			System.out.println("Indices: " + result[0] + " " + result[1]);
		} else {
			System.out.println("No pair found");
		}

		sc.close();
	}
}
