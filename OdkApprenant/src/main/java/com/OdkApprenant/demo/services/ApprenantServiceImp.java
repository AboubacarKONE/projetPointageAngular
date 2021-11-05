package com.OdkApprenant.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;

import net.bytebuddy.implementation.bytecode.Throw;
@Service
public class ApprenantServiceImp implements ApprenantService {
	@Autowired
	ApprenantRepository apprenantRepository;
	
	

	@Override
	public Apprenant save(Apprenant apprenant) {
		
		return apprenantRepository.save(apprenant);
		
		
	}

	@Override
	public List<Apprenant> listeApprenant() {
		// TODO Auto-generated method stub
		return apprenantRepository.findAll();
		
	}

	@Override
	public Apprenant apprenantById(Integer id) {
		// TODO Auto-generated method stub
		return apprenantRepository.findById(id).get();
		
	}

	@Override
	public void delete(Integer id) {
		apprenantRepository.deleteById(id);
		
	}
	@Override
	public Apprenant update(Integer id, Apprenant apprenant) {
		Apprenant APP = apprenantRepository.findById(id).get();
		APP.setId(apprenant.getId());
		APP.setPrenom(apprenant.getPrenom());
		APP.setNom(apprenant.getNom());
		APP.setAge(apprenant.getAge());
		APP.setEmail(apprenant.getEmail());
		APP.setDateCreation(apprenant.getDateCreation());
		APP.setApprenantStatus(apprenant.getApprenantStatus());
		APP.setLogin(apprenant.getLogin());
		APP.setGenre(apprenant.getGenre());
		APP.setPassword(apprenant.getPassword());
		APP.setTelephone(apprenant.getTelephone());
		APP.setDateModification(apprenant.getDateModification());
		return apprenantRepository.save(APP);
	}

	@Override
	public Optional<Apprenant> rechercher(String login, String password)  {
		
		return apprenantRepository.findApprenantByLoginAndPassword(login, password);
		
	}

	
	
	

}
