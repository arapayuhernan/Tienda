package com.hernan.ProductService.Service;

import java.util.List;

import com.hernan.ProductService.Model.Entity.Category;
import com.hernan.ProductService.Model.Entity.Product;


public interface IProductService {

	public Product crearProducto (Product product);
	
	public Product UpdateProducto(Product product);
	
	public List<Product> ProductosPorCategoria(Category category);
	
	public Product FindProductoById(Long id);
	
	
	public List<Product> ListarProductos();
	
	public Product EliminarProducto(Long id);
	
	
	
}
