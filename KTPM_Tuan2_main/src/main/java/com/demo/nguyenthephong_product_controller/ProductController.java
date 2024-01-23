package com.demo.nguyenthephong_product_controller;

import com.demo.nguyenthephong_product_reponsity.ProductReponsity;
import com.demo.nguyenthephong_product_service.ProductSevice;
import com.demo.nguyenthephong_product_entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductSevice productSevice;
    @Autowired
    ProductReponsity productReponsity;

  
    @GetMapping("product")
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        products = productSevice.getAllProduct();
        return products;
    }

    
    @PostMapping("Addproduct")
    public Product addUser(@RequestBody Product product) {
        productSevice.addProduct(product);
        return product;
    }

    @GetMapping("product/{id}")
    public Product findByIdProduct(@PathVariable Integer id) {
        Optional<Product> optional =productReponsity.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            new RuntimeException("Khong co product theo id nay");
        }

        return product;
    }
}
