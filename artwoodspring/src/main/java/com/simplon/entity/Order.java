package com.simplon.entity;

import javax.persistence.*;

import com.simplon.emum.PaymentMethod;
import com.simplon.emum.Status;
import com.simplon.entity.OrderDetail;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_Id")
    private int orderId;

    @Column(name = "recipient_name")
    private String recipientName;
    @Column(name = "recipient_phone")
    private String recipientPhone;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "total")
    private float total;
    @Column(name = "status")
    private Status status;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail>  orderDetails;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}