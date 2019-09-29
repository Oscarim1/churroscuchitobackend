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

import com.workshop.churroscuchito.models.CatalogoEstadoOrden;
import com.workshop.churroscuchito.service.ICatalogoEstadoOrdenService;

@RestController
@RequestMapping("/CatalogoEstadoOrden")
public class CatalogoEstadoSolicitudController {
	@Autowired
	private ICatalogoEstadoOrdenService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CatalogoEstadoOrden>> listar(){
		List<CatalogoEstadoOrden> CatalogoEstadoOrden=new ArrayList<>();
		CatalogoEstadoOrden=service.getAll();		
		return new ResponseEntity<List<CatalogoEstadoOrden>>(CatalogoEstadoOrden, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public CatalogoEstadoOrden registrar(@RequestBody CatalogoEstadoOrden v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatalogoEstadoOrden> listarId(@PathVariable("id") Integer id){
		CatalogoEstadoOrden CatalogoEstadoOrdenes=service.findById(id);		
		return new ResponseEntity<CatalogoEstadoOrden>(CatalogoEstadoOrdenes, HttpStatus.OK);
}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody CatalogoEstadoOrden tipo){
		service.merge(tipo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id){
		CatalogoEstadoOrden tip=service.findById(id);
		service.delete(id);
		
	}
	*/
}