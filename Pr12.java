package com.hcl;
/*
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: As 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class Pr12 {
	public static void main(String[] args){
		int sum = 0;
		for (int i = 3; i < 10000000; i++) {
			int digitFactorial = 0, digit = i;
			while (digit != 0) {
				digitFactorial += factorial(digit % 10);
				digit /= 10;
			}
			if (i == digitFactorial) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static int factorial(int num) {
		int sum = 1;
		for(int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

}
