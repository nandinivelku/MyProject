package org.java.learn;

import java.util.ArrayList;
import java.util.Date;

public class Order implements Comparable<Order> {

	private int id;
	private ArrayList<OrderItem> orderItems;
	Date orderDate = new Date();
	private Customer customer;
	private double totalprice = 0;

	public Item getItem() {
		return getItem();
	}

	public Order(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<OrderItem> getOrderitems() {
		return orderItems;
	}

	public void setOrderitems(ArrayList<OrderItem> orderitems) {
		this.orderItems = orderitems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderItems=" + orderItems + ", orderDate=" + orderDate + ", customer=" + customer
				+ "]";
	}

	@Override
	public int compareTo(Order otherOrder) {

		return this.customer.compareTo(otherOrder.getCustomer());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + id;
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (id != other.id)
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		return true;
	}

	
	 public double TotalPrice() {
		 for(OrderItem  s: orderItems){
			 totalprice+=s.getPrice();
		 }
	return totalprice;
	  
	  }

	}
	 


