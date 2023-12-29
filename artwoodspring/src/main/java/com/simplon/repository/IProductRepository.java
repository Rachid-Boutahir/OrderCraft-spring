package com.simplon.repository;


import com.simplon.entity.Product;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends IGenericRepository<Product, Integer> {
}
