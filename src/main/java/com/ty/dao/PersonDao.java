package com.ty.dao;

import java.util.List;

import com.ty.dto.Person;

public interface PersonDao 
{
	public Person saveperson(int eid, Person person);
	
	public boolean deletepersonById(int pid);
	
	public Person updatePerson(int pid, Person person);
	
	public Person getPersonById(int pid);
	
	public List<Person> getAllPerson();
	
	public List<Person> getPersonByGender(String gender);
	
	public List<Person> getPersonsByAge(int age);
	
	public List<Person> getPersonByPhone(long phno);
	//public Person getEncounterById(Encounter encounterid);
	
}
