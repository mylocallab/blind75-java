package com.util.learndynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MemoizationClimbingStairs {

	static int[] dp = new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.fill(dp, -1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stairs");
		int n = sc.nextInt();
		int numberOfWays = ways(n);
		System.out.println(numberOfWays);

	}

	public static int ways(int n) {

		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		if (dp[n] != 0) {
			return dp[n];
		}

		dp[n] = ways(n - 1) + ways(n - 2);

		return dp[n];
	}
}
