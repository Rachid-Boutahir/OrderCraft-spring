package com.simplon.controller;

import com.simplon.entity.Admin;
import com.simplon.entity.Category;
import com.simplon.service.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CategoryController {
    private static final Logger Log = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/show")
    public String showFormCategoryAdd(Model objModel){
        Log.debug("inside this page 'Category-form-add.html' there is a handler methode ");
        Category category = new Category();
        objModel.addAttribute("category", category);

        return "Category/Category-form-add";
    }

    @GetMapping("/list")
    public String listCategory(Model objModel) {
        List<Category> listcategory = categoryService.getCategories();
        objModel.addAttribute("listcategory",listcategory);

        return "Category/category-list";
    }
}
