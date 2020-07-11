package com.hernan.ProductService.Service;

import java.util.List;


import com.hernan.ProductService.Model.Entity.Product;


public interface IProductService {

	public Product crearProducto (Product product);
	
	public Product UpdateProducto(Product product);
	
	public void FindProductoById(Long id);
	
	//public void FindProductByCategory(Product product);
	
	public List<Product> ListarProductos(Product product);
	
	public void EliminarProducto(Long id);
	
	
	
}
