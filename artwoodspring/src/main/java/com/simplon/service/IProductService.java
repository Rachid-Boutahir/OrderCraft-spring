package com.simplon.service;

import java.util.List;

import com.simplon.entity.Product;


public interface IProductService {
    public List<Product> getProducts();

    public void saveProduct(Product theProduct);

    public Product getProduct(int id);

    public void deleteProduct(int id);
}
