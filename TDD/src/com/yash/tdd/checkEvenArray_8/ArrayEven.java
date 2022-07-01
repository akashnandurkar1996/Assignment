package com.yash.tdd.checkEvenArray_8;

public class ArrayEven {
	public static int iseven(int[] arr) {
		int evencnt = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				evencnt++;
		}
		return evencnt;
	}
}


