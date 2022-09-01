package com.camila.shopspringboot.project_springBoot.entities;

import com.camila.shopspringboot.project_springBoot.entities.pk.OrdemItemPk;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_ordem_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrdemItemPk id;
    private Integer quantity;
    private Double price;


    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder (Order order){
        id.setOrder(order);
    }
    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct (Product product){
        id.setProduct(product);
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;

        OrderItem orderItem = (OrderItem) o;

        return id != null ? id.equals(orderItem.id) : orderItem.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
