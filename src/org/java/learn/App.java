package org.java.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// all the items 
		Item chair = new Item("chair", "Its good", 13.44d);
		Item table = new Item("table", "It is a table", 30.44d);
		Item pen = new Item("pen", "It is a pen", 10d);
		Item book = new Item("book", "It is good book ", 25.78d);
		Item computer = new Item("computer", "many benefits", 700.78d);

		// Customer1 oder item and quantity
		ArrayList<OrderItem> orderitem1 = new ArrayList<>();
		orderitem1.add(new OrderItem(chair, 1));

		// Customer2 order item and quantity
		ArrayList<OrderItem> orderitem2 = new ArrayList<>();
		orderitem2.add(new OrderItem(chair, 1));
		orderitem2.add(new OrderItem(table, 2));

		// modify by removing first entry and by adding quantity for the second
		// entry
		orderitem2.remove(0);
		orderitem2.get(0).setQuantity(10);

		// Customer3 order item and quantity
		ArrayList<OrderItem> orderitem3 = new ArrayList<>();
		orderitem3.add(new OrderItem(pen, 4));
		orderitem3.add(new OrderItem(computer, 1));

		// Customer4 order item and quantity
		ArrayList<OrderItem> orderitem4 = new ArrayList<>();
		orderitem4.add(new OrderItem(pen, 4));
		orderitem4.add(new OrderItem(computer, 1));

		// Customer5 order item and quantity
		ArrayList<OrderItem> orderitem5 = new ArrayList<>();
		orderitem5.add(new OrderItem(book, 3));
		orderitem5.add(new OrderItem(table, 2));

		// first customer
		Customer customer1 = new Customer(1, "John");
		customer1.setAddress("Marryland");
		customer1.setEmail("nshgdj@gmail.com");
		customer1.setFirstName("Sam");
		customer1.setPhoneNumber(56973476);

		// second customer
		Customer customer2 = new Customer(2, "Smith");
		customer2.setAddress("New York");
		customer2.setEmail("smith@gmail.com");
		customer2.setFirstName("wilson");
		customer2.setPhoneNumber(698435476);

		// third customer
		Customer customer3 = new Customer(3, "Vele");
		customer3.setAddress("Italy");
		customer3.setEmail("nandi@gmail.com");
		customer3.setFirstName("Nandini");
		customer3.setPhoneNumber(56973476);

		// fourth customer
		Customer customer4 = new Customer(3, "Vele");
		customer4.setAddress("Italy");
		customer4.setEmail("nandi@gmail.com");
		customer4.setFirstName("Nandini");
		customer4.setPhoneNumber(56973476);

		// fifth customer
		Customer customer5 = new Customer(4, "Mona");
		customer5.setAddress("Kansas");
		customer5.setEmail("mona@gmail.com");
		customer5.setFirstName("Catherine");
		customer5.setPhoneNumber(745453476);

		// first order
		Order orders1 = new Order(101);
		orders1.setOrderitems(orderitem1);
		orders1.setCustomer(customer1);
		System.out.println("Total price of first order " + orders1.TotalPrice());
		// second order
		Order orders2 = new Order(102);
		orders2.setOrderitems(orderitem2);
		orders2.setCustomer(customer2);
		System.out.println("Total price of second order " + orders2.TotalPrice());
		// third order
		Order orders3 = new Order(103);
		orders3.setOrderitems(orderitem3);
		orders3.setCustomer(customer3);
		 System.out.println("Total price of third order " + orders3.TotalPrice());
		// fourth order
		Order orders4 = new Order(103);
		orders4.setOrderitems(orderitem4);
		orders4.setCustomer(customer4);
		System.out.println("Total price of fourth order " + orders4.TotalPrice());
		// fifth order
		Order orders5 = new Order(104);
		orders5.setOrderitems(orderitem5);
		orders5.setCustomer(customer5);
		System.out.println("Total price of fifth order " + orders5.TotalPrice());

		// placing orders in ArrayList
		ArrayList<Order> orderList = new ArrayList<>();
		orderList.add(orders1);
		orderList.add(orders2);
		orderList.add(orders3);
		orderList.add(orders4);
		orderList.add(orders5);

		// Before sorting
		for (Order o : orderList) {
			System.out.println(o);
		}

		Collections.sort(orderList);

		// After Sorting
		System.out.println(" ");
		System.out.println("After sorting in ArrayList");
		for (Order o : orderList) {
			System.out.println(o);
		}
		
		//Placing orders in HashSet
		HashSet<Order> orders = new HashSet<Order>();
		orders.add(orders1);
		orders.add(orders2);
		orders.add(orders3);
		orders.add(orders4);
		orders.add(orders5);

		System.out.println("Hashset order sorting with no duplicate objects");
		for (Order o : orders) {
			System.out.println(o);
		}
		System.out.println(" ");
		System.out.println("-----java 8 stream demo----");
		orderList.stream() // gives back a stream of orders
				.filter(streamedOrder -> {
					return streamedOrder.getId() >=103;
				}).collect(Collectors.toList()).forEach(System.out::println);

		
		orderList.stream() // gives back a stream of orders
				.filter(streamedOrder -> {
					return streamedOrder.getId() >= 104;
				}).collect(Collectors.toList()).forEach(System.out::println);

	}

	/*
	 * private static ArrayList<OrderItem> getOrderItems() { // TODO
	 * Auto-generated method stub return null; }
	 */

}
