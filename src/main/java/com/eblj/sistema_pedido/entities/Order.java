package com.eblj.sistema_pedido.entities;

import org.springframework.stereotype.Component;

@Component
public class Order {

  private Integer code;
  private Double basic;
  private double discount;

  public Order() {}
  public Order(Integer code, Double basic, double discount) {
    this.code = code;
    this.basic = basic;
    this.discount = discount;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Double getBasic() {
    return basic;
  }

  public void setBasic(Double basic) {
    this.basic = basic;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }
}
