package org.java.learn.datasource;

import java.util.Arrays;
import java.util.List;

import org.java.learn.Item;

public class ItemDataSource {

	public static List<Item> getItems() {
		return Arrays.asList(
				new Item("Chair", "Executive chair", 29.99d),
				new Item("Table", "Computer table", 39.99d),
				new Item("Desk", "Standard office desk", 49.99d),
				new Item("Tea Table", "Small side table", 9.99d),
				new Item("Chair", "Laz boy", 129.99d),
				new Item("Massage Chair", "Platinum heated massage chair", 29.99d),
				new Item("Table", "Conference Table", 529.99d),
				new Item("Cabinet", "Standard steel office cabinet", 49.99d),
				new Item("Cabinet", "Brilliant finish wooden office cabinet", 129.99d),
				new Item("Shelf", "Adjustable steel-net multi level shelf", 89.99d)
				);

	}

}
