package com.ty.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dao.HospitalDao;
import com.ty.dto.Hospital;

public class HospitalDaoImp implements HospitalDao{

	public Hospital saveHospital(Hospital hospital) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(hospital);
		et.commit();
		return hospital;
	}

	public boolean deleteHospitalById(int hid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Hospital hospital =em.find(Hospital.class, hid);
		if(hospital!=null)
		{
			et.begin();
			em.remove(hospital);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}

	public Hospital updateHospitalById(int hid, Hospital hospital) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital1=em.find(Hospital.class, hid);
		if(hospital1!=null)
		{
			hospital1.setHname(hospital.getHname());
			hospital1.setWebsite(hospital.getWebsite());
			et.begin();
			em.merge(hospital1);
			et.commit();
			return hospital1;
		}
		else {
			return hospital;
		}
	}

	public Hospital getHospitalById(int hid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Hospital hospital=em.find(Hospital.class, hid);
		return hospital;
	}

}
