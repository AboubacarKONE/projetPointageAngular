package com.OdkApprenant.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.OdkApprenant.demo.model.Apprenant;

public interface ApprenantService {

	Apprenant save(Apprenant apprenant);
	List<Apprenant> listeApprenant();
	Apprenant apprenantById(Integer id);
	Apprenant update(Integer id, Apprenant apprenant ); 	
	void delete(Integer id);
	Optional<Apprenant> rechercher(String login, String password);
}
  