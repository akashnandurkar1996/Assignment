package com.SpringCore.MergeArray_7;

import org.springframework.beans.factory.annotation.Autowired;

public class Array1 {

	int[] array1;
	
	@Autowired 
	Array2 array2;

	public int[] getArray1() {
		return array1;
	}

	public void setArray1(int[] array1) {
		this.array1 = array1;
	}

	public Array2 getArray2() {
		return array2;
	}

	public void setArray2(Array2 array2) {
		this.array2 = array2;
	}

}
