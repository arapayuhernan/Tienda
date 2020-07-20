package com.hernan.ProductService.Model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernan.ProductService.Model.Entity.Category;
import com.hernan.ProductService.Model.Entity.Product;

public interface IProductDao extends JpaRepository<Product,Long> {

	public List<Product> ListProductByCategory(Category category);
	
	
}
