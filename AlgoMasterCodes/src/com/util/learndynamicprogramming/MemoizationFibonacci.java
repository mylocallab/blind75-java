package com.util.learndynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

//day1
//task2
//memoization
//

public class MemoizationFibonacci {
	static int[] dp = new int[100];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		Arrays.fill(dp, -1);
		int ans = calc(n);
		System.out.println("Answer is:"+ans);

	}

	public static int calc(int n) {

		if (n <= 1) {
			return n;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		dp[n] = calc(n - 1) + calc(n - 2);

		return dp[n];

	}
}
