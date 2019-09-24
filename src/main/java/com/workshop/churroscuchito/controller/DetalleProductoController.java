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

import com.workshop.churroscuchito.models.DetalleProducto;
import com.workshop.churroscuchito.service.IDetalleProductoService;

@RestController
@RequestMapping("/DetalleProducto")
public class DetalleProductoController {
	@Autowired
	private IDetalleProductoService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DetalleProducto>> listar(){
		List<DetalleProducto> DetalleProducto=new ArrayList<>();
		DetalleProducto=service.getAll();		
		return new ResponseEntity<List<DetalleProducto>>(DetalleProducto, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public DetalleProducto registrar(@RequestBody DetalleProducto v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleProducto> listarId(@PathVariable("id") Integer id){
		DetalleProducto DetalleProductos=service.findById(id);		
		return new ResponseEntity<DetalleProducto>(DetalleProductos, HttpStatus.OK);
}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody DetalleProducto tipo){
		service.merge(tipo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id){
		DetalleProducto tip=service.findById(id);
		service.delete(id);
		
	}
	*/
}
