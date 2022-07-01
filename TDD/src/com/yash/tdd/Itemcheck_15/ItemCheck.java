package com.yash.tdd.Itemcheck_15;

import java.time.LocalDate;

class Item {
	int itemId;
	String itemName;
	double costPrice;
	double sellPrice;
	LocalDate dom;
	LocalDate doe;

	public Item(int itemId, String itemName, double costPrice, double sellPrice, LocalDate dom, LocalDate doe) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.dom = dom;
		this.doe = doe;
	}

}

public class ItemCheck {

	static Item item;

	public static boolean createObject(Item i) throws Exception {
		
		if (countDigit(i.itemId) < 3)
			throw new Exception("id should be greater than 3 digits");
		else if (!i.itemName.matches("[a-zA-Z]+"))
			throw new Exception("only alphbets are allowed ");
		else if (i.sellPrice < 0 || i.costPrice < 0)
			throw new Exception("sell price & cost price can not be zero ");
		else if (i.doe == LocalDate.now())
			throw new Exception("expiry cannot be today date ");
		else if (i.sellPrice == i.costPrice)
			throw new Exception("sell price and cost price can not be same ");
		else
			item = new Item(i.itemId, i.itemName, i.costPrice, i.sellPrice, i.dom, i.doe);

	
		if (item != null)
			return true;
		else
			return false;

	}

	private static int countDigit(int itemId) {
		int cnt = 0;
		while (itemId > 0) {
			cnt++;
			itemId /= 10;
		}
		return cnt;
	}

}
