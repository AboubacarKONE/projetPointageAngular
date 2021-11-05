package com.OdkApprenant.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OdkApprenant.demo.model.Presence;
import com.OdkApprenant.demo.repositories.PresenceRepository;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@Service
public class PresenceServiceImpl implements PresenceService {
	@Autowired
	private PresenceRepository presenceRepository;

	@Override
	public Presence save(Presence presence) {
		return presenceRepository.save(presence);
	}

	@Override
	public List<Presence> presenceByDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Presence> findByDate(Date date) {
		// TODO Auto-generated method stub
		return presenceRepository.findByDate(date);
	}

	@Override
	public List<Presence> findByWeek(Date date) {
		// TODO Auto-generated method stub
		return presenceRepository.findByWeek(date);
	}

	

}
