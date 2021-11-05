package com.OdkApprenant.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Presence implements Serializable{
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 @Temporal(TemporalType.DATE)
 private Date date;
 @Temporal(TemporalType.TIME)
 @JsonFormat(pattern="HH:mm")
 private Date heureArriveApprenant;
 @ManyToOne
 private Apprenant apprenant;
 @ManyToOne
 private Formateur formateur;
}
