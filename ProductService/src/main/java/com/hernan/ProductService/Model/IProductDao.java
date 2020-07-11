package com.hernan.ProductService.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernan.ProductService.Model.Entity.Product;

public interface IProductDao extends JpaRepository<Product,Long> {

}
