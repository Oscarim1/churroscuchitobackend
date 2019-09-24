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

import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.service.IEstadoOrdenService;

@RestController
@RequestMapping("/DetalleOrden")
public class DetalleOrdenController {
	@Autowired
	private IDetalleOrdenService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DetalleOrden>> listar(){
		List<DetalleOrden> DetalleOrden=new ArrayList<>();
		DetalleOrden=service.getAll();		
		return new ResponseEntity<List<DetalleOrden>>(DetalleOrden, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public DetalleOrden registrar(@RequestBody DetalleOrden v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleOrden> listarId(@PathVariable("id") Integer id){
		DetalleOrden DetalleOrdenes=service.findById(id);		
		return new ResponseEntity<DetalleOrden>(DetalleOrdenes, HttpStatus.OK);
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