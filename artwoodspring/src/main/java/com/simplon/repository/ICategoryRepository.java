package com.simplon.repository;

import com.simplon.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends IGenericRepository<Category, Integer> {
}
