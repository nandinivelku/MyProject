package org.java.learn.datasource;

import static org.java.learn.datasource.ItemDataSource.getItems;

import java.util.Arrays;
import java.util.List;

import org.java.learn.OrderItem;

public class OrderItemDataSource {

	public static List<OrderItem> ORDER_ITEMS_1 = Arrays.asList(
			new OrderItem(getItems().get(0), 1),
			new OrderItem(getItems().get(1), 2), 
			new OrderItem(getItems().get(7), 3)
			);

	public static List<OrderItem> ORDER_ITEMS_2 = Arrays.asList(
			new OrderItem(getItems().get(3), 1),
			new OrderItem(getItems().get(7), 3), 
			new OrderItem(getItems().get(2), 5)
			);

	public static List<OrderItem> ORDER_ITEMS_3 = Arrays.asList(
			new OrderItem(getItems().get(2), 2),
			new OrderItem(getItems().get(3), 2), 
			new OrderItem(getItems().get(4), 9)
			);

	public static List<OrderItem> ORDER_ITEMS_4 = Arrays.asList(
			new OrderItem(getItems().get(5), 3),
			new OrderItem(getItems().get(8), 4), 
			new OrderItem(getItems().get(9), 1)
			);

	public static List<OrderItem> ORDER_ITEMS_5 = Arrays.asList(
			new OrderItem(getItems().get(3), 3),
			new OrderItem(getItems().get(7), 4), 
			new OrderItem(getItems().get(9), 2)
			);
}
