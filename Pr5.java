package com.hcl;
/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
import java.util.Scanner;
public class Pr5 {
	public static void main(String args[])
    {
        long num;
        Scanner sc = new Scanner(System.in);
        num= sc.nextLong();

        for(int i=2;i<num; i++)
        {
            while(num%i == 0)
            {
                //System.out.println(i);
                num=num/i;
            }
        }
        if(num>2)
            System.out.println(num);

    }

}
