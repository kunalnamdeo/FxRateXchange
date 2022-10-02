package com.fxrate.exchange;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fxrate.exchange.bean.Order;
import com.fxrate.exchange.controller.OrderCreationController;
import com.fxrate.exchange.controller.OrderStatusTrackingController;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(OrderStatusTrackingController.class)
public class OrderStatusTrackingControllerTest {
	
	   @Autowired
	   private MockMvc mvc;

	   @MockBean
	   private OrderStatusTrackingController orderStatusTrackingController;
	   
	   @Test
	   public void testTracking() {
		   
		   orderStatusTrackingController.getOrderStatus(100);
		   assertNotEquals(orderStatusTrackingController.getOrderStatus(100), "FULLY_MATCHED");
	   }

}
