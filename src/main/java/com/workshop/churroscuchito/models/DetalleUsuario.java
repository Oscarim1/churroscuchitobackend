package com.workshop.churroscuchito.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalleUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	@Column(name="direccion",nullable=false)
	private String direccion;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setId_detalle_usuario(Integer id_detalle_usuario) {
		this.id_detalle_usuario = id_detalle_usuario;
	}

	@Column(name="telefono",nullable=false, unique=true)
	private String telefono;	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	
	}
	
	@Column(name="id_detalle_usuario",nullable=false)
	private Integer id_detalle_usuario;	

	public Integer getId_detalle_usuario() {
		return id_detalle_usuario;
	}
	public void set(Integer id_detalle_usuario) {
		this.id_detalle_usuario = id_detalle_usuario;
	
	}


}