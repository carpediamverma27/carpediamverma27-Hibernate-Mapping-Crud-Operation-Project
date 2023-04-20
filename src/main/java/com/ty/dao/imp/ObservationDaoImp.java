package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.ObservationDao;
import com.ty.dto.Encounter;
import com.ty.dto.Observation;

public class ObservationDaoImp implements ObservationDao{

	public Observation saveObservation(int eid, Observation observation) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Encounter encounter = em.find(Encounter.class, eid);
		if(encounter!=null) {
		et.begin();
		em.persist(observation);
		et.commit();
		return observation;}
		else {
			return null;
		}
	}

	public boolean deleteObservationById(int oid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Observation observation=em.find(Observation.class, oid);
		if(observation!=null) {
			et.begin();
			em.remove(observation);
			et.commit();
			return true;
		}
		return false;
	}

	public Observation updateObservation(int oid, Observation observation) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Observation observation1=em.find(Observation.class, oid);
		if(observation1!=null) {
			observation1.setDname(observation.getDname());
			observation1.setReason(observation.getReason());
			et.begin();
			em.merge(observation1);
			et.commit();
			return observation1;
			}
		else {
		return observation;
		}
	}

	public Observation getObservationById(int oid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Observation observation=em.find(Observation.class, oid);
		return observation;
	}

	public Observation getObservationByDocterName(String name) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Observation observation=em.find(Observation.class, name);
		//Query query = em.createQuery(name);
		//List<Observation> observations = query.getResultList();
		
		return observation;
	}

	public List<Observation> getAllObservation() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql = "Select v from Observation";
		Query query = em.createQuery(sql);
		List<Observation> observation = query.getResultList();
		
		return observation;
	}

}
