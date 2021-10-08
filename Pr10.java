package com.hcl;
/*
 * You are given the following information, but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Pr10 {
	public static void main(String[] args){
		int day = 2, sundays = 0; //1 Jan 1901 is a Tuesday
		for(int year = 1; year <= 100; year++) {
			for(int month = 1; month <= 12; month++) {
				if(day == 7) {
					sundays++;
				}
				if(month == 2) {
					if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
						day++;
					}
				} else if(month == 4 || month == 6 || month == 9 || month == 11) {
					day += 2;
				} else {
					day += 3;
				}
				
				if(day > 7) {
					day -= 7;
				}
			}
		}
		System.out.println(sundays);
	}

}
