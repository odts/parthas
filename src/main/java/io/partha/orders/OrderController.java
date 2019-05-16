package io.partha.orders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/order/test")
	public String testOrder() {
		return "working!";
	}
}
