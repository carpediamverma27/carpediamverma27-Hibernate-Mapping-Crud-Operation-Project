package com.ty.service;

import java.util.List;

import com.ty.dao.imp.PersonDaoImp;
import com.ty.dto.Person;

public class PersonService 
{
	public void saveperson(int eid, Person person)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person1 = personDaoImp.saveperson(eid, person);
		if(person1!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public void deletepersonById(int pid)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		boolean flag = personDaoImp.deletepersonById(pid);
		if(flag)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public Person updatePerson(int pid, Person person)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person2 = personDaoImp.updatePerson(pid, person);
		if(person2!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
		return null;
	}
	
	public Person getPersonById(int pid)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = personDaoImp.getPersonById(pid);
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getAllPerson()
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = (Person)personDaoImp.getAllPerson();
		if(person!=null)
		{
			return (List<Person>) person;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonByGender(String gender)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = (Person)personDaoImp.getPersonByGender(gender);
		if(person!=null)
		{
			return (List<Person>) person;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonsByAge(int age)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = (Person)personDaoImp.getPersonsByAge(age);
		if(person!=null)
		{
			return (List<Person>) person;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonByPhone(long phno)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> person = personDaoImp.getPersonByPhone(phno);
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
}
