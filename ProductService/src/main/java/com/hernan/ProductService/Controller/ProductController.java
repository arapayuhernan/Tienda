package com.hernan.ProductService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hernan.ProductService.Model.Entity.Category;
import com.hernan.ProductService.Model.Entity.Product;
import com.hernan.ProductService.Service.ServiceImpl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	public ProductServiceImpl productServiceImpl;
	
	
	
	
	
	
	@PostMapping()
	public ResponseEntity<Product> crear(@RequestBody Product product) {
		
		if(product.equals(null)) {
			return ResponseEntity.noContent().build();
		}
		
		 productServiceImpl.crearProducto(product);
		 return ResponseEntity.ok().build();
		 
	}
	
	
	@DeleteMapping(value="/{id}")
	public void borrar(@PathVariable(name="id")Long id) {
		productServiceImpl.EliminarProducto(id);
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Product>> listarProductos(){
		List<Product> productlist = productServiceImpl.ListarProductos();
		if(productlist.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(productlist);
	}
	
	@GetMapping(value="/list/{id}")
	public void BuscarPorId(@PathVariable Long id ) {
		 productServiceImpl.FindProductoById(id);
		
	}
	
	
	@GetMapping(value="/category/{id}")
	public ResponseEntity<List<Product>> ProductosCategoria(@PathVariable(name="id")Long id){
	List<Product> listaproductos = productServiceImpl.ProductosPorCategoria(Category.builder().id(id).build());
	
	if(listaproductos.isEmpty()) {
		return ResponseEntity.noContent().build();
	}	
	
		return ResponseEntity.ok(listaproductos);
	}
	
}
