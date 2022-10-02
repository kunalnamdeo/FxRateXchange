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

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(OrderCreationController.class)
public class OrderCreationControllerTest {
	
	   @Autowired
	   private MockMvc mvc;

	   @MockBean
	   private OrderCreationController orderCreationController;
	   
	   @Test
	   public void testSave() {
		   
		   Order order = new Order();
		   order.setOderId(1);
		   order.setOrderAmount(100d);
		   
		   orderCreationController.save(order);
		   assertNotEquals(order, orderCreationController.get(1));
	   }

}
