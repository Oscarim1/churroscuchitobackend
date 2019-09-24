package com.workshop.churroscuchito.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.churroscuchito.models.DetalleUsuario;
import com.workshop.churroscuchito.service.IDetalleUsuarioService;

@RestController
@RequestMapping("/DetalleUsuario")
public class EstadoOrdenController {
	@Autowired
	private IEstadoOrdenService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EstadoOrden>> listar(){
		List<EstadoOrden> EstadoOrden=new ArrayList<>();
		EstadoOrden=service.getAll();		
		return new ResponseEntity<List<EstadoOrden>>(EstadoOrden, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public DetalleUsuario registrar(@RequestBody DetalleUsuario v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EstadoOrden> listarId(@PathVariable("id") Integer id){
		EstadoOrden EstadoOrdenes=service.findById(id);		
		return new ResponseEntity<EstadoOrden>(EstadoOrdenes, HttpStatus.OK);
}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody DetalleUsuario tipo){
		service.merge(tipo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id){
		DetalleUsuario tip=service.findById(id);
		service.delete(id);
		
	}
	*/
}