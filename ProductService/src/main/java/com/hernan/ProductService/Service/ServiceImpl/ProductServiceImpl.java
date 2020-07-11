package com.hernan.ProductService.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hernan.ProductService.Model.IProductDao;

import com.hernan.ProductService.Model.Entity.Product;
import com.hernan.ProductService.Service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDao productdao;
	
	
	@Override
	public Product crearProducto(Product product) {
		
		return productdao.save(product);
	}

	@Override
	public Product UpdateProducto(Product product) {
		// TODO Auto-generated method stub
		return productdao.save(product);
	}

	@Override
	public void FindProductoById(Long id) {
		productdao.findById(id);
		
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

}
