package com.eblj.sistema_pedido.services;

import com.eblj.sistema_pedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
   public double shipment(Order order){
     double basicValue = (order.getBasic()-(order.getBasic()* order.getDiscount()/100));
     if(basicValue<100.00){
      return 20.00;
     }else if(basicValue>=100.00 && basicValue<=200 ){
      return 12.00;
     }else{
      return 0.0;
     }
   }
}
