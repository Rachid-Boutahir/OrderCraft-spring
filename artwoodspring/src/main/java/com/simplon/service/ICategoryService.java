package com.simplon.service;

import com.simplon.entity.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> getCategories();
    public void saveCategory(Category theCategory);

    public Category getCategory(int id);

    public void deleteCategory(int id);
}
