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

import com.workshop.churroscuchito.DTO.UsuarioDTO;
import com.workshop.churroscuchito.models.Usuario;
import com.workshop.churroscuchito.service.IUsuarioService;
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	@Autowired
	IUsuarioService service;
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> listar(){
		List<Usuario> Usuarios=new ArrayList<>();
		Usuarios=service.getAll();		
		return new ResponseEntity<List<Usuario>>(Usuarios, HttpStatus.OK);		
		
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario registrar(@RequestBody UsuarioDTO v) {
		return service.persist(v);
	}
	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> listarId(@PathVariable("id") Integer id){		
		Usuario Usuarios=service.findById(id);		
		return new ResponseEntity<Usuario>(Usuarios, HttpStatus.OK);		
		
	}
	/*
	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object>actualizar(@Valid @RequestBody Usuario Usuarios){
		service.merge(Usuario);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	@DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminar(@PathVariable Integer id) {
		Usuario tips=service.findById(id);
			service.delete(id);
	}
	*/
}