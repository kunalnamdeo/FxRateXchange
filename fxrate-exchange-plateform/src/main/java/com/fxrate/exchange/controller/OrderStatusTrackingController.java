package com.fxrate.exchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fxrate.exchange.dao.ExistingRecords;
import com.fxrate.exchange.dao.OrderDao;

@RestController
public class OrderStatusTrackingController {

	@Autowired
	OrderDao orderDao;

	@RequestMapping(path = "/getAllUSDIds", method = RequestMethod.GET)
	public List<Integer> getAllUSDIds() {

		return orderDao.getOrders();
	}

	@RequestMapping(path = "/getOrderStatus", method = RequestMethod.GET)
	public String getOrderStatus(@RequestParam Integer orderAmount) {
		
		if(orderDao.getOrders().contains(orderAmount)) {
			return ExistingRecords.FULLY_MATCHED;
		}
		
		
		if(orderDao.getOrders().contains(orderAmount)) {
			return ExistingRecords.FULLY_MATCHED;
		}
		
		
		return ExistingRecords.PEDNING;
	}

}
