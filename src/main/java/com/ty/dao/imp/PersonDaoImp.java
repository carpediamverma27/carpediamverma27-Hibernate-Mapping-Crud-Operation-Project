package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.PersonDao;
import com.ty.dto.Encounter;
import com.ty.dto.Person;

public class PersonDaoImp implements PersonDao{

	public Person saveperson(int eid, Person person) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Encounter encounter = em.find(Encounter.class, eid);
		if(encounter!=null) {
		et.begin();
		em.persist(person);
		et.begin();
		return person;}
		else {
			return null;
		}
	}

	public boolean deletepersonById(int pid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=em.find(Person.class, pid);
		if(person!=null) {
			et.begin();
			em.remove(person);
			et.commit();
			return true;
		}
		
		return false;
	}

	public Person updatePerson(int pid, Person person) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person1=em.find(Person.class, pid);
		if(person1!=null) {
			person1.setName(person.getName());
			person1.setAddress(person.getAddress());
			person1.setPhoneno(person.getPhoneno());
			person1.setEmail(person.getEmail());
			person1.setAge(person.getAge());
			person1.setGender(person1.getGender());
			person1.setDob(person1.getDob());
			et.begin();
			em.merge(person1);
			et.commit();
			}
		return person;
		
	}

	public Person getPersonById(int pid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=em.find(Person.class, pid);
		
		return person;
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql = "Select v from Items v";
		Query query = em.createQuery(sql);
		List<Person> person=query.getResultList();
		
		return person;
		
	}

	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=em.find(Person.class, gender);
		
		Query query = em.createQuery(gender);
		List<Person> persons=query.getResultList(); 
		
		return persons;
	}

	public List<Person> getPersonsByAge(int age) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=em.find(Person.class, age);
		
		Query query = em.createQuery("Select v from Person v where v.age=?1");
		query.setParameter(1, age);
		List<Person> persons=query.getResultList(); 
		
		return persons;
	}

	public List<Person> getPersonByPhone(long phno) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=em.find(Person.class, phno);
		Query query = em.createQuery("Select v from Person v where v.phno=?1");
		query.setParameter(1, phno);
		List<Person> persons=query.getResultList(); 
		
		return persons;
	}

}
