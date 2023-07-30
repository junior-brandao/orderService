package com.eblj.sistema_pedido;

import com.eblj.sistema_pedido.entities.Order;
import com.eblj.sistema_pedido.services.OrederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaDePedidosApplication implements CommandLineRunner {

	@Autowired
	private OrederService orederService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaDePedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,150.00,20.0);
		double result = orederService.total(order);
		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor total: R$ "+result);
	}
}
