package com.demo.nguyenthephong_product_service;

import java.util.List;

import com.demo.nguyenthephong_product_entity.Product;

public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
