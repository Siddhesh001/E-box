package com.hcl;
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Pr11 
{
	public static void main(String[] args)
	{
		for(int c = 0; c < 998; c++) 
		{
			for(int b = 0; b < c; b++) 
			{
				for(int a = 0; a < b; a++) 
				{
					if(a * a + b * b == c * c && a + b + c == 1000) 
					{
						System.out.println(a * b * c);
					}
				}
			}
		}
	}
	

}
