package com.demo.nguyenthephong_product_reponsity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.nguyenthephong_product_entity.Product;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
