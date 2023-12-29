package com.simplon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId ;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

}
