package com.util.learndynamicprogramming;

//day 1
//task2
//exponential growth 2 power n
import java.util.Scanner;

public class RecursionFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth fibonacci:eg 0 1 1 2 3");
		int n = sc.nextInt();
		int fibNum = calc(n);// if you want from 0th index keep n otherwise n-1
		System.out.println(fibNum);
		sc.close();

	}

	private static int calc(int n) {
		// TODO Auto-generated method stub
		if (n <= 1) {
			return n;
		} else {
			return calc(n - 1) + calc(n - 2);
		}
	}
}
