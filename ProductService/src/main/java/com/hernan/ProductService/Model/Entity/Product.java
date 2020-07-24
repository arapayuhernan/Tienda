package com.hernan.ProductService.Model.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="producto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	
	@Column(name="nombre",length=50)
	private String nombre;
	
	@Column(name="descripcion",length=200)
	private String descripcion;
	
	@Column(name="precio")
	private Double price;
	
	
	@Column(name="stock")
	private int stock;
	
	
	@Column(name="fecha_creacion")
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creacion_prod;
	
	@Column(name="producto_status")
	
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_catergoria")
	private Category category;
}
