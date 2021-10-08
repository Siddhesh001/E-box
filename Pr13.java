package com.hcl;
/* Project Euler problem number 30
 * 1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Pr13 {
	public static void main(String[] args){
		int total = 0;
		for(int i = 2; i < 1000000; i++) {
			int sum = 0, num = i;
			while (num > 0) {
				int digit = num % 10;
				sum += Math.pow(digit, 5);
				num /= 10;
			}
			if(i == sum) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
