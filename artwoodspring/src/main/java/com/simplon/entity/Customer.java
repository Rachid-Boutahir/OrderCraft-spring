package com.simplon.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="customer_id")
    private int customerId;

    @Column(name="fullname")
    private String fullName;

    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="register_date")
    private String registerDate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    public Customer() {
    }
}
