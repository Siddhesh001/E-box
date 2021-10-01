package com.hcl;
/*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 */
public class Pr7 
{
	public static void main(String args[])
	{
		int sumSquare = 0, squareSum = 0;
		for(int i = 1; i <= 100; i++) 
		{
			sumSquare += i * i;
			squareSum += i;
		}
		squareSum *= squareSum;
		System.out.println(squareSum - sumSquare);
	}

}
