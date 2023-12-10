package com.example.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.models.Docente;
import com.example.services.DocenteServices;

@RestController
@RequestMapping("/docente")
public class DocenteController {
	@Autowired
	private DocenteServices docenteServices;
	
	@GetMapping
	public ResponseEntity<ArrayList<Docente>> getAll()
	{
		return ResponseEntity.ok(docenteServices.getAll());
	}
	
	@PostMapping
	public ResponseEntity<Docente> save(@RequestBody Docente docente){
		return ResponseEntity.ok(docenteServices.save(docente));
	}
	
	@PutMapping
	public ResponseEntity<Docente> update(@RequestBody Docente docente){
		return ResponseEntity.ok(docenteServices.update(docente));
	}
	
	@DeleteMapping("/{id}")
	public  ResponseEntity<Void> delete(@PathVariable Long id){
		docenteServices.deleteById(id);
		return ResponseEntity.ok("Se eliminó el docente con ID: " + id);
	}

}
