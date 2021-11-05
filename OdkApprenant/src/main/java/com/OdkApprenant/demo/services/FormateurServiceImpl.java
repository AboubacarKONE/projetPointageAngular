package com.OdkApprenant.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.repositories.FormateurRepository;
@Service
public class FormateurServiceImpl implements FormateurService{
	@Autowired
	private FormateurRepository formateurRepository;
	@Override
	public Formateur save(Formateur formateur) {
		return formateurRepository.save(formateur);
	}

	@Override
	public List<Formateur> listeFormateur() {
		return formateurRepository.findAll();
	}

	@Override
	public Formateur update(Integer id, Formateur adminis) {
		Formateur admin = formateurRepository.findById(id).get();
		admin.setId(adminis.getId());
		admin.setNom(adminis.getNom());
		admin.setPrenom(adminis.getPrenom());
		admin.setEmail(adminis.getEmail());
		admin.setGenre(adminis.getGenre());
		admin.setLogin(adminis.getLogin());
		admin.setFormateurStatus(adminis.getFormateurStatus());
		admin.setDateCreation(adminis.getDateCreation());
		admin.setDateModification(adminis.getDateModification());
		return null;
	}

	@Override
	public void delete(Integer id) {
		formateurRepository.deleteById(id);
		
	}

}
