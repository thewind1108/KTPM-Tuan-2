package com.demo.nguyenthephong_product_service;

import com.demo.nguyenthephong_product_entity.Product;
import com.demo.nguyenthephong_product_reponsity.ProductReponsity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSeviceImpl implements ProductSevice{
    @Autowired
    private ProductReponsity productReponsity;

    @Override
    public List<Product> getAllProduct() {
        List<Product> products= new ArrayList<>();
        products=productReponsity.findAll();
        return products;
    }

    @Override
    public void addProduct(Product product) {
        productReponsity.save(product);
    }
}
