package com.OdkApprenant.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OdkApprenant.demo.model.Apprenant;
@RepositoryRestResource
@CrossOrigin("*")
public interface ApprenantRepository extends JpaRepository<Apprenant, Integer>{
	Optional<Apprenant> findApprenantByLoginAndPassword(@Param("login") String login,@Param("password") String password); 
	
}
