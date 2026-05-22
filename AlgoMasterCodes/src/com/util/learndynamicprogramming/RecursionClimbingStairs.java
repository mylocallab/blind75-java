package com.util.learndynamicprogramming;

import java.util.Scanner;

//day2 chatgpt learning

public class RecursionClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of stairs:-");
		int n = sc.nextInt();
		int numberOfWays = ways(n);
		System.out.println(numberOfWays);
		sc.close();

	}

	private static int ways(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return ways(n - 1) + ways(n - 2);

	}

}
