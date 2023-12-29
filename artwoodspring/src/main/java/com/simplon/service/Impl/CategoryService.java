package com.simplon.service.Impl;

import com.simplon.entity.Category;
import com.simplon.repository.ICategoryRepository;
import com.simplon.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    @Transactional
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCategory(Category theCategory) {
         categoryRepository.save(theCategory);
    }

    @Override
    @Transactional
    public Category getCategory(int id) {
        return categoryRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("Category with ID = ${id} is not found"));
    }

    @Override
    @Transactional
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }
}
