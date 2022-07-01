package com.yash.tdd.Armstrong_4;

public class Armstrong {
	public static int checkarmstrong(int a) {
		int rem, sum=0;
		while(a>0) {
		rem=a%10;
		sum=sum+rem*rem*rem;
		a=a/10;
		}		
		return sum;
	}
}
