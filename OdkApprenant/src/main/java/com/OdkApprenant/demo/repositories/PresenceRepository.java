package com.OdkApprenant.demo.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OdkApprenant.demo.model.Presence;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
@RepositoryRestResource
@CrossOrigin("*")
public interface PresenceRepository extends JpaRepository<Presence, Integer>{
//	@Query(value = "SELECT * FROM Presence WHERE date Like %?1%", nativeQuery = true)
//	List<Match> findByMatchMonthAndMatchDay(@Param ("jour") String jour);
//	@Query("select e from Presence e where day(e.date) = ?1 ")
//	List<Presence> getByDay(int day);
	Optional<Presence>findByDate(@Param("date")Date date);
//	List<Presence> findByDateBeforeAndDateAfter(@Param("date")Date startDate,@Param("date") Date endDate);
	@Query(value="SELECT * FROM Presence WHERE date >= SYSDATE + INTERVAL '7' DAY",nativeQuery = true)
	@RestResource(path="/date={dateWeek}")
	List<Presence>findByWeek(@Param("dateWeek") Date dateWeek);

	

}
