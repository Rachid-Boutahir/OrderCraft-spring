package com.simplon.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import com.simplon.entity.OrderDetail;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;
    @Column(name = "label")
    private String label ;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price ;
    @Column(name = "stock")
    private int stock ;
    @Column(name = "image")
    private String image ;
    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category category;
    @Column(name = "publish_date")
    private Date publishDate;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Product{" +
                    "productID=" + productID +
                    ", label='" + label + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    ", stock=" + stock +
                    ", image='" + image + '\'' +
                    ", category=" + category +
                    ", publishDate=" + publishDate +
                    ", orderDetails=" + orderDetails +
                '}';
    }
}
