package com.OdkApprenant.demo.services;

import java.util.List;

import com.OdkApprenant.demo.model.Formateur;


public interface FormateurService {
	Formateur save(Formateur formateur);
	List<Formateur> listeFormateur();
	Formateur update(Integer id, Formateur formateur ); 	
	void delete(Integer id);
}
