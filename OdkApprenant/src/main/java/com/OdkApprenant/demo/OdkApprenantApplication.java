package com.OdkApprenant.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.model.Presence;
import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Status;
import com.OdkApprenant.demo.repositories.FormateurRepository;
import com.OdkApprenant.demo.repositories.PresenceRepository;
import com.OdkApprenant.demo.repositories.ApprenantRepository;

@SpringBootApplication
public class OdkApprenantApplication implements CommandLineRunner {
//	@Autowired
//	private ApprenantRepository apprenantRepository;
//	@Autowired
//	private FormateurRepository administrateurRepository;
//	@Autowired
//	private PresenceRepository presenceRepository;

	public static void main(String[] args) {
		SpringApplication.run(OdkApprenantApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
 //ApprenantRepository.save(new Apprenant(null, "abouabacar", "kone", 11,"delnasa3@gmail.com", 72410986, "delnasa","delnasa123", "M",Status.activer, new Date(), new Date(),null));
 	
}	

}
