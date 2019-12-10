package com.allianz.shopping.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private int cid;
	private String ccode;
	private String cdescription;
	private List<Product> productList = new ArrayList<Product>();
	
	
	public Category() {
		super();
	}
	public Category(int cid, String ccode, String cdescription) {
		super();
		this.cid = cid;
		this.ccode = ccode;
		this.cdescription = cdescription;
	}
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", ccode=" + ccode + ", cdescription=" + cdescription + "]";
	}
	
	
}
