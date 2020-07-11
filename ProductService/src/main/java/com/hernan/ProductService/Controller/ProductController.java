package com.hernan.ProductService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hernan.ProductService.Model.Entity.Product;
import com.hernan.ProductService.Service.ServiceImpl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	public ProductServiceImpl productServiceImpl;
	
	
	
	
	
	
	@PostMapping()
	public Product crear(Product product) {
		return productServiceImpl.crearProducto(product);
	}
	
	
	@DeleteMapping(value="/{id}")
	public void borrar(@PathVariable(name="id")Long id) {
		productServiceImpl.EliminarProducto(id);
	}
	
	
	@GetMapping("/list")
	public List<Product> ListarProductos(Product product){
		return productServiceImpl.ListarProductos(product) ;
	}
	
}
