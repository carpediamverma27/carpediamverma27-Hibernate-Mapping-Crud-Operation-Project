package com.ty.service;

import java.util.List;

import com.ty.dao.imp.ObservationDaoImp;
import com.ty.dto.Observation;

public class Observationservice 
{
	public void saveObservation(int eid, Observation observation)
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation1 = observationDaoImp.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public void deleteObservationById(int oid)
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		boolean flag = observationDaoImp.deleteObservationById(oid);
		if(flag)
		{
			System.out.println("");
		}
		else
		{
			System.out.println(""); 
		}
	}
	
	public Observation updateObservation(int oid, Observation observation) 
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation2 = observationDaoImp.updateObservation(0, null);
		if(observation2!=null)
		{
			System.out.println(""); 
		}
		else
		{
			System.out.println("");
		}
		return null;
	}
	
	public Observation getObservationById(int oid)
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation = observationDaoImp.getObservationById(oid);
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	
	public Observation getObservationByDocterName(String name)
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation = observationDaoImp.getObservationByDocterName(name);
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	
	public List<Observation> getAllObservation()
	{
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		List<Observation> observation = observationDaoImp.getAllObservation();
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
}
