package com.hernan.ProductService.Service.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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

	

	//@Override
	//public void FindProductByCategory(Product product) {
		
	//}

	@Override
	public List<Product> ListarProductos(Product product) {
		
			List<Product> listaProductoList = productdao.findAll();
		return listaProductoList;
	}

	@Override
	public void EliminarProducto(Long id) {
		 productdao.deleteById(id);
		
	}

	@Override
	public List<Product> ListProductByCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void FindProductoById(Long id) {
		productdao.findById(id);
		
	}

	
	

	

	

	

	

	

	

}
