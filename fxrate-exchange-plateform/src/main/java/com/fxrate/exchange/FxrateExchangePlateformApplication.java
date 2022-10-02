package com.fxrate.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans ({"com.fxrate.exchange.dao", "com.fxrate.exchange.controller"})
@ComponentScan(basePackages= "com.fxrate.exchange.dao")
public class FxrateExchangePlateformApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxrateExchangePlateformApplication.class, args);
	}

}
