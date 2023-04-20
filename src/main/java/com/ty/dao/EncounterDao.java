package com.ty.dao;

import java.util.List;

import com.ty.dto.Encounter;

public interface EncounterDao 
{
	public Encounter saveEncounter(int bid, int pid, Encounter encounter);
	
	public boolean deleteEncounter(int eid);
	
	public Encounter updateEncounter(int eid, Encounter encounter);
	
	public Encounter getEncounterByPersonId(int pid);
	
	public List<Encounter> getAllEncounter();
}
