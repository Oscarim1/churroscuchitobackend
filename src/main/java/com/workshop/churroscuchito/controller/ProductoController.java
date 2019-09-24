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

import com.workshop.churroscuchito.DTO.ProductoDTO;
import com.workshop.churroscuchito.models.Producto;
import com.workshop.churroscuchito.service.IProductoService;
@RestController
@RequestMapping("/Producto")
public class ProductoController {
	@Autowired
	IProductoService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Producto>> listar(){
		List<Producto> Productos=new ArrayList<>();
		Productos=service.getAll();		
		return new ResponseEntity<List<Producto>>(Productos, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Producto registrar(@RequestBody ProductoDTO v) {
		return service.persist(v);
	}
	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> listarId(@PathVariable("id") Integer id){		
		Producto Productos=service.findById(id);		
		return new ResponseEntity<Producto>(Productos, HttpStatus.OK);		
		
	}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody Producto Productos){
		service.merge(Productos);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id) {
		Producto tips=service.findById(id);
			service.delete(id);
	}
	*/
}