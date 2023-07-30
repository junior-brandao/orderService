package com.eblj.sistema_pedido.services;

import com.eblj.sistema_pedido.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrederService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
       double basicValue = (order.getBasic()-(order.getBasic()* order.getDiscount()/100));
       double totalValue = basicValue + shippingService.shipment(order);
       return  totalValue;
    }
}
