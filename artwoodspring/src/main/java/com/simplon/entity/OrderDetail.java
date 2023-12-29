package com.simplon.entity;


import javax.persistence.*;

import com.simplon.entity.Product;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_Id")
    private int productOrderId;

    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_Id")
    private Order order;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "subtotal")
    private double subTotal;

    public OrderDetail() {
    }

    public int getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(int productOrderId) {
        this.productOrderId = productOrderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
