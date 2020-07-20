package com.hernan.ProductService.Service;

import java.util.List;

import com.hernan.ProductService.Model.Entity.Category;
import com.hernan.ProductService.Model.Entity.Product;


public interface IProductService {

	public Product crearProducto (Product product);
	
	public Product UpdateProducto(Product product);
	
	
	
	public void FindProductoById(Long id);
	
	
	
	public List<Product> ListProductByCategory(Category category);
	
	public List<Product> ListarProductos(Product product);
	
	public void EliminarProducto(Long id);
	
	
	
}
