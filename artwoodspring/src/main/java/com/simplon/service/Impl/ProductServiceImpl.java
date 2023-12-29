package com.simplon.service.Impl;

import com.simplon.entity.Product;
import com.simplon.repository.IProductRepository;
import com.simplon.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    @Transactional
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public void saveProduct(Product theProduct) {
        productRepository.save(theProduct);
    }

    @Override
    @Transactional
    public Product getProduct(int id)throws NullPointerException {
        return productRepository.findById(id).orElseThrow(
                ()->new NullPointerException("Product with ID =${id} is not found"));
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
