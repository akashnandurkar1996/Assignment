package com.yash.tdd.hcf_1;

public class Hcf {
	
	
	public static int findhcf(int a,int b) {
		int hcf=0;
		for(int i=1;i<=a||i<=b;i++) {
			if (a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		
		return hcf;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Hcf.findhcf(125, 625));
	}

}
