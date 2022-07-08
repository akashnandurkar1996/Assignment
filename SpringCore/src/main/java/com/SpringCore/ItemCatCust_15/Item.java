package com.SpringCore.ItemCatCust_15;

public class Item {

	int itemid;
	String itemname;
	double itemprice;
	Category catobj;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getItemprice() {
		return itemprice;
	}

	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}

	public Category getCatobj() {
		return catobj;
	}

	public void setCatobj(Category catobj) {
		this.catobj = catobj;
	}

	@Override
	public String toString() {
		return "\n Item [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + ", catobj=" + catobj
				+ "]";
	}
	
	

}
