package com.fxrate.exchange.dao;

import java.util.Arrays;
import java.util.List;

public class ExistingRecords {
	
	
	public static String FULLY_MATCHED = "FULLY_MATCHED";
	public static String PARTIALLY_MATCHED = "PARTIALLY_MATCHED";
	public static String PEDNING = "PENDING";
	
	
	public List<Integer>  allOrderIds() {
		List<Integer> allIds = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		return allIds;
	}
	
	
	public List<Integer>  existingUSDOrders() {
		List<Integer> allIds = Arrays.asList(new Integer[] { 10, 20, 30, 40, 80 });
		return allIds;
	}

}
