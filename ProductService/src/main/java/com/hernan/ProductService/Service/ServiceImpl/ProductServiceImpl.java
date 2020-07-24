package com.hernan.ProductService.Service.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.hernan.ProductService.Model.IProductDao;
import com.hernan.ProductService.Model.Entity.Category;
import com.hernan.ProductService.Model.Entity.Product;
import com.hernan.ProductService.Service.IProductService;

import javassist.expr.NewArray;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDao productdao;
	
	
	
	
	
	
	
	
	@Override
	public Product crearProducto(Product product) {
		product.setStatus("CREADO");
		product.setCreacion_prod(new Date());
		return productdao.save(product);
	}
	
	
	
	

	@Override
	public Product UpdateProducto(Product product) {
		
		Product productonuevo = productdao.findById(product.getId_producto()).orElse(null);
		if (productonuevo==null) {
			return null;
		}
		productonuevo.setNombre(product.getNombre());
		productonuevo.setPrice(product.getPrice());
		productonuevo.setCategory(product.getCategory());
		productonuevo.setStock(product.getStock());
		
		
		
		
		
		return productdao.save(productonuevo);
	}

	

	

	@Override
	public List<Product> ListarProductos() {
		List<Product> listaProducto = productdao.findAll();
		return listaProducto;
			
	}

	@Override
	public Product EliminarProducto(Long id) {
		Product productdb = productdao.findById(id).orElse(null);
		if(null==productdb) {
			return null;
		}
		
		
		productdb.setStatus("DELETED");
		return productdao.save(productdb);
		 
		
	}

	

	@Override
	public Product FindProductoById(Long id) {
		return productdao.findById(id).orElse(null);
		
	}





	@Override
	public List<Product> ProductosPorCategoria(Category category) {
		// TODO Auto-generated method stub
		return productdao.findByCategory(category);
	}

	
	

	

	

	

	

	

	

}
