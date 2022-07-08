package com.SpringCore.ItemCatCust_15;

public class Customer {

	int cid;
	String cname;
	String cphone;
	String caddress;
	Item itemObj;


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	public Item getItemObj() {
		return itemObj;
	}

	public void setItemObj(Item itemObj) {
		this.itemObj = itemObj;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", caddress=" + caddress
				+ ", itemObj=" + itemObj + "]";
	}

	
	

}
