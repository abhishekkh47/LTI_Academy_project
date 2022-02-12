package com.app.reportx.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="itemname")
	private String name;
	
	@Column(name="manfdate")
	private String manfdate;

	@Column(name="expdate")
	private String expdate;
	
	@Column(name="price")
	private int price;
	
	@Column(name="itemdesc")
	private String itemdesc;
	
//	@Override
//	public String toString() {
//		return "Items [id=" + id + ", itemname=" + itemname + ", manfdate=" + manfdate + ", expdate=" + expdate
//				+ ", price=" + price + ", itemdesc=" + itemdesc + "]";
//	}

	public Items(int id, String itemname, String manfdate, String expdate, int price, String itemdesc) {
		super();
		this.id = id;
		this.name = itemname;
		this.manfdate = manfdate;
		this.expdate = expdate;
		this.price = price;
		this.itemdesc = itemdesc;
	}

	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return name;
	}

	public void setItemname(String itemname) {
		this.name = itemname;
	}

	public String getManfdate() {
		return manfdate;
	}

	public void setManfdate(String manfdate) {
		this.manfdate = manfdate;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemdesc() {
		return itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}
	
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemname=" + name + ", manfdate=" + manfdate + ", expdate=" + expdate
				+ ", price=" + price + ", itemdesc=" + itemdesc + "]";
	}

	
}
