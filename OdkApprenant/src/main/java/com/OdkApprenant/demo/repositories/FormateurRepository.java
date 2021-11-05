package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OdkApprenant.demo.model.Formateur;
@RepositoryRestResource
@CrossOrigin("*")
public interface FormateurRepository extends JpaRepository<Formateur, Integer>{

}
