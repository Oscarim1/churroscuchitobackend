package com.workshop.churroscuchito.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	@Column(name="descripcion",nullable=false)
	private String descripcion;	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	
	}
	
}