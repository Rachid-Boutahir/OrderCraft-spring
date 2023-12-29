package com.simplon.controller;


import com.simplon.entity.Product;
import com.simplon.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private static final Logger Log = LoggerFactory.getLogger(ProductController.class);

    private IProductService productService;

    @GetMapping("/show")
    public String showFormProductToAdd(Model objModel){
        Log.debug("inside this page 'Admin-form-add.html' there is a handler methode ");
        Product product = new Product();
        objModel.addAttribute("product", product);

        return "Product/product-form-add";
    }

    @GetMapping("/list")
    public String listProduct(Model objModel) {
        List<Product> listProduct = productService.getProducts();
        objModel.addAttribute("listProduct",listProduct);
        return "Product/product-list";
    }

    @GetMapping("/save")
    public String SaveProduct(@ModelAttribute("product") Product objProduct) {
        productService.saveProduct(objProduct);
        return "redirect:product/list";
    }

    @GetMapping("/Update")
    public String showFormProductToUpdate(@RequestParam("productId") int productId, Model objModel )throws NullPointerException{
        Product product = productService.getProduct(productId);
        objModel.addAttribute("product", product);

        return "Product/product-form-update";
    }

    @GetMapping("/delete-admin/{productId}")
    public String deleteProduct(@ModelAttribute("productId") int productId) throws NullPointerException {
        productService.deleteProduct(productId);

        return "redirect:Admin/list-admin";
    }

}
