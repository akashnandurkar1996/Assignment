package com.java8.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//model class
class Item {
	int itemid;
	String itemname;
	float itemprice;

	public Item(int itemid, String itemname, float itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	} 

}
 
//test class
public class ItemsAvgPrice_6 {
	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(2, "laptop", 30000));
		itemList.add(new Item(5, "mobile", 20000));
		itemList.add(new Item(4, "TV", 10000));
		itemList.add(new Item(9, "smartwatch", 2000));
		itemList.add(new Item(3, "headphone", 1800));

		Double avgprice = itemList.stream().collect(Collectors.averagingDouble(i -> i.itemprice));
		System.out.println("avg price of items " + avgprice);

		List<Item> itemsBelowAvg = itemList.stream().filter(i -> i.itemprice < avgprice).map(i -> i).toList();
		System.out.println(" items whose price is below average ");

		for (Item i : itemsBelowAvg) {
			System.out.println(i.itemname + " " + i.itemprice);
		}

	}

}
