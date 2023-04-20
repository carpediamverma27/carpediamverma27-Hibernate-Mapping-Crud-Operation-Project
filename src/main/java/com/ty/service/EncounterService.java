package com.ty.service;

import java.util.List;

import com.ty.dao.imp.EncounterDaoImp;
import com.ty.dto.Encounter;

public class EncounterService 
{
	public void saveEncounter(int bid, int pid, Encounter encounter)
	{
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		Encounter encounter1 = encounterDaoImp.saveEncounter(bid, pid, encounter);
		if(encounter1!=null)
		{
			System.out.println("Encounter Saved Successfully");
		}
		else
		{
			System.out.println("Unfortunately Encounter Not Saved");
		}
	}
	
	public void deleteEncounter(int eid)
	{
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		boolean flag = encounterDaoImp.deleteEncounter(eid);
		if(flag)
		{
			System.out.println("Encounter Deleted Successfully");
		}
		else
		{
			System.out.println("Encounter Not Deleted");
		}
	}
	
	public Encounter updateEncounter(int eid, Encounter encounter)
	{
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		Encounter encounter2 = encounterDaoImp.updateEncounter(eid, encounter);
		if(encounter2!=null)
		{
			System.out.println("Encounter Updated Successfully");
		}
		else
		{
			System.out.println("Encounter Not Updated");
		}
		return null;
	}
	
	public Encounter getEncounterByPersonId(int pid)
	{
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		Encounter encounter = encounterDaoImp.getEncounterByPersonId(pid);
		if(encounter!=null)
		{
			return encounter;
		}
		else
		{
			return null;
		}
		
	}
	
	public List<Encounter> getAllEncounter()
	{
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		List<Encounter> encounter = encounterDaoImp.getAllEncounter();
		if(encounter!=null)
		{
			return encounter;
		}
		else
		{
			return null;
		}
	}
}
