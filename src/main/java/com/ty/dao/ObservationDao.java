package com.ty.dao;

import java.util.List;

import com.ty.dto.Observation;

public interface ObservationDao 
{
	public Observation saveObservation(int eid, Observation observation);
	
	public boolean deleteObservationById(int oid);
	
	public Observation updateObservation(int oid, Observation observation);
	
	public Observation getObservationById(int oid);
	
	public Observation getObservationByDocterName(String name);
	
	public List<Observation> getAllObservation();
}
