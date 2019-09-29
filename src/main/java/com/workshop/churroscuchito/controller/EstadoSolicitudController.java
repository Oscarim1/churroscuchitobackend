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

import com.workshop.churroscuchito.DTO.EstadoSolicitudDTO;
import com.workshop.churroscuchito.models.EstadoSolicitud;
import com.workshop.churroscuchito.service.IEstadoSolicitudService;
@RestController
@RequestMapping("/EstadoSolicitud")
public class EstadoSolicitudController {
	@Autowired
	IEstadoSolicitudService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EstadoSolicitud>> listar(){
		List<EstadoSolicitud> EstadoSolicitudes=new ArrayList<>();
		EstadoSolicitudes=service.getAll();		
		return new ResponseEntity<List<EstadoSolicitud>>(EstadoSolicitudes, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public EstadoSolicitud registrar(@RequestBody EstadoSolicitudDTO v) {
		return service.persist(v);
	}
	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EstadoSolicitud> listarId(@PathVariable("id") Integer id){		
		EstadoSolicitud EstadoSolicitudes=service.findById(id);		
		return new ResponseEntity<EstadoSolicitud>(EstadoSolicitudes, HttpStatus.OK);		
		
	}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody EstadoSolicitud EstadoSolicitudes){
		service.merge(EstadoSolicitudes);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id) {
		EstadoSolicitud tips=service.findById(id);
			service.delete(id);
	}
	*/
}