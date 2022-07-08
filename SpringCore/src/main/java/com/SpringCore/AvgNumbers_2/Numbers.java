package com.SpringCore.AvgNumbers_2;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class Numbers {

	List<Integer> numberlist;

	public Numbers(List<Integer> numberlist) {
		super();
		this.numberlist = numberlist;
	}

	@PostConstruct
	public void calculateAvg() {
		System.out.println(numberlist);
		Double avgnum = numberlist.stream().collect(Collectors.averagingDouble(e -> e));
		System.out.println("average of list is: " + avgnum);
	}
}
