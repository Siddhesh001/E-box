package com.hcl;
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Pr6 
{
	public static void main(String[] args)
	{
			int i = 20;
			while(!isDivisible(i)) {
				i++;
			}
			System.out.println(i);
	}
		
	public static boolean isDivisible(int n) 
		{
			for(int i = 1; i < 20; i++) 
			{
				if(n % i != 0) 
				{
					return false;
				}
			}
			return true;
		}
	
}

