package com.OdkApprenant.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import com.OdkApprenant.demo.services.ApprenantService;


@RestController
@CrossOrigin("*")
public class ApprenantController {
	@Autowired
	public ApprenantService apprenantService;
	@PostMapping(value="/saveApprenant")
	public Apprenant save(@RequestBody Apprenant apprenant) {
		return apprenantService.save(apprenant);
	}
	@PutMapping(value=("/updateApprenant/{id}"))
	public Apprenant update(@PathVariable("id") Integer id, @RequestBody Apprenant apprenant ) {
		
		return apprenantService.update(id, apprenant);
		
	}
	@GetMapping(value="/listeApprenant")
	public List<Apprenant> listeApprenant(){
		return apprenantService.listeApprenant();
		
		
	}
	@GetMapping(value="/apprenant/{id}")
	public Apprenant apprenantById(@PathVariable("id") Integer id) {
		return apprenantService.apprenantById(id);
	}
	@DeleteMapping(value="/deleteApprenant/{id}")
	public void delete(@PathVariable("id") Integer id) {
		apprenantService.delete(id);
		
	}
	@GetMapping(value="/rechercherApprenant/login={login}&password={password}")
	public Optional<Apprenant> rechercher(@PathVariable("login") String login,@PathVariable("password") String password){
		return apprenantService.rechercher(login, password);
		
	}
}
