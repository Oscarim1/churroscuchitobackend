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

import com.workshop.churroscuchito.DTO.OrdenDTO;
import com.workshop.churroscuchito.models.Orden;
import com.workshop.churroscuchito.service.IOrdenService;
@RestController
@RequestMapping("/Orden")
public class OrdenController {
	@Autowired
	IOrdenService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Orden>> listar(){
		List<Orden> Ordenes=new ArrayList<>();
		Ordenes=service.getAll();		
		return new ResponseEntity<List<Orden>>(Ordenes, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Orden registrar(@RequestBody OrdenDTO v) {
		return service.persist(v);
	}
	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orden> listarId(@PathVariable("id") Integer id){		
		Orden Ordenes=service.findById(id);		
		return new ResponseEntity<Orden>(Ordenes, HttpStatus.OK);		
		
	}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody Orden Ordenes){
		service.merge(Ordenes);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id) {
		Orden tips=service.findById(id);
			service.delete(id);
	}
	*/
}