package com.OdkApprenant.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.OdkApprenant.demo.model.Presence;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

public interface PresenceService {
	Presence save(Presence presence);
	List<Presence>presenceByDay();
//	List<Match> presenceByDay(String day);
//	List<Presence> getByDay(int day);
	Optional<Presence> findByDate(Date date);
	List<Presence>findByWeek(@Param("date") Date date);

}
