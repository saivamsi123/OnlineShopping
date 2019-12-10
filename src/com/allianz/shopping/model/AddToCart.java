package com.allianz.shopping.model;

public class AddToCart {
	private int id;
	private int order_id;
	private int product_id;
	private int quantity;
	private float total;
	
	Product product = new Product();
	
	public AddToCart() {
		super();
	}
	public AddToCart(int id, int order_id, int product_id, int quantity, float total) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "AddToCart [id=" + id + ", order_id=" + order_id + ", product_id=" + product_id + ", quantity="
				+ quantity + ", total=" + total + "]";
	}
}
