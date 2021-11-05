package com.OdkApprenant.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.FormateurService;

@RestController
public class FormateurController {
	@Autowired
	FormateurService formateurService;
	@PostMapping(value="/saveFormateur")
	public Formateur save(@RequestBody Formateur formateur) {
		return formateurService.save(formateur);
		
	}
	@PutMapping(value=("/updateFormateur/{id}"))
	public Formateur update(@PathVariable("id") Integer id, @RequestBody Formateur formateur ) {
		
		return formateurService.update(id, formateur);
		
	}
	@GetMapping(value="/listeFormateur")
	public List<Formateur> listeAdministrateur(){
		return formateurService.listeFormateur();
		
		
	}

	@DeleteMapping(value="/deleteFormateur/{id}")
	public void delete(@PathVariable("id") Integer id) {
		formateurService.delete(id);
		
	}
	
}
