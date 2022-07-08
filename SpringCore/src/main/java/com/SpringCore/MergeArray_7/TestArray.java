package com.SpringCore.MergeArray_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArray {
	public static void main(String[] args) {
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("Array_7.xml");
		Array1 inputarr = (Array1) ctxobj.getBean("array1");

		int j = 0;
		int[] arr1 = inputarr.array1;
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr2 = inputarr.array2.arr;
		for (int i : arr2) {
			System.out.print(i + " ");
		}

		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for (int i = arr2.length; i < arr3.length; i++) {
			arr3[i] = arr2[j];
			j++;
		}
		System.out.println("\n merged array");
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		
		int max=arr3[0];
		for(int i=1; i<arr3.length;i++) {
			if(max<=arr3[i]) {
				max=arr3[i];
			}
		}
		System.out.println("\n maximum in array is: "+max);
	}
}
