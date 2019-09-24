package com.workshop.churroscuchito.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	@Column(name="Nombre",nullable=false) //Descripcion= Nombre
	private String nombre;	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}
	@Column(name="Apellido",nullable=false) //Descripcion= Apellido
	public String apellido;
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	
	}
	@Column(name="Rut",nullable=false) //Descripcion= Apellido
	public Integer rut;
	public Integer getRut() {
		return rut;
	}
	public void setRut(Integer rut) {
		this.rut = rut;
	
	}
	/*
	@OneToMany
	@JoinColumn(name="id_detalle_usuario",nullable=false, unique=true)
	private DetalleUsuario id_detalle_usuario;
	
	public DetalleUsuario getId_detalle_usuario() {
		return id_detalle_usuario;
	}
	public void setDetalleUsuario(DetalleUsuario id_detalle_usuario) {
		this.id_detalle_usuario = id_detalle_usuario;
	}
	*/	
	
	@OneToMany(mappedBy="id_detalle_usuario", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},fetch=FetchType.LAZY,orphanRemoval=true)
	private List<DetalleUsuario> id_detalle_usuario;
	
	public List<DetalleUsuario> getDetalleUsuario() {
		return id_detalle_usuario;
	}
	public void setDetalleUsuario(List<DetalleUsuario> id) {
		this.id_detalle_usuario = id;
	}
	
	

}