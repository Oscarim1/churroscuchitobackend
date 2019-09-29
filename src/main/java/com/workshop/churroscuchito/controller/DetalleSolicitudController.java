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

import com.workshop.churroscuchito.models.DetalleSolicitud;
import com.workshop.churroscuchito.service.IDetalleSolicitudService;

@RestController
@RequestMapping("/DetalleSolicitud")
public class DetalleSolicitudController {
	@Autowired
	private IDetalleSolicitudService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DetalleSolicitud>> listar(){
		List<DetalleSolicitud> DetalleSolicitud=new ArrayList<>();
		DetalleSolicitud=service.getAll();		
		return new ResponseEntity<List<DetalleSolicitud>>(DetalleSolicitud, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public DetalleSolicitud registrar(@RequestBody DetalleSolicitud v) {
		return service.persist(v);
	}

	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleSolicitud> listarId(@PathVariable("id") Integer id){
		DetalleSolicitud DetalleSolicitudes=service.findById(id);		
		return new ResponseEntity<DetalleSolicitud>(DetalleSolicitudes, HttpStatus.OK);
}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody DetalleSolicitud tipo){
		service.merge(tipo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id){
		DetalleSolicitud tip=service.findById(id);
		service.delete(id);
		
	}
	*/
}