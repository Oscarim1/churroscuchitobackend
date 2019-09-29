package com.workshop.churroscuchito.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EstadoSolicitud")
public class EstadoSolicitud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	@Column(name="estado",nullable=false)
	private String estado;	

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	
	}
	
}