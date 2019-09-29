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

import com.workshop.churroscuchito.models.Solicitud;
import com.workshop.churroscuchito.service.ISolicitudService;

@RestController
@RequestMapping("/Solicitud")
public class SolicitudController {
	@Autowired
	private ISolicitudService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Solicitud>> listar(){
		List<Solicitud> Solicitud=new ArrayList<>();
		Solicitud=service.getAll();		
		return new ResponseEntity<List<Solicitud>>(Solicitud, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Solicitud registrar(@RequestBody Solicitud v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Solicitud> listarId(@PathVariable("id") Integer id){
		Solicitud Solicitudes=service.findById(id);		
		return new ResponseEntity<Solicitud>(Solicitudes, HttpStatus.OK);
}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody Solicitud tipo){
		service.merge(tipo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id){
		Solicitud tip=service.findById(id);
		service.delete(id);
		
	}
	*/
}