package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.MedOrderDeo;
import com.ty.dto.Encounter;
import com.ty.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDeo{

	public MedOrder saveMedOrderById(int eid, MedOrder medOrder) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Encounter encounter = em.find(Encounter.class, eid);
		if(encounter!=null) {
		et.begin();
		em.persist(medOrder);
		et.commit();
		return medOrder;}
		else {
			return null;
		}
	}

	public boolean deleteMedOrder(int mid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder =em.find(MedOrder.class, mid);
		
		if(medOrder!=null) {
			et.begin();
			em.remove(medOrder);
			et.commit();
			return true;
		}
		else {
		return false;
		}
	}

	public MedOrder updateMedOrder(int mid, MedOrder medOrder) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder1 =em.find(MedOrder.class, mid);
		if(medOrder1!=null) {
			et.begin();
			em.merge(medOrder1);
			et.commit();
			return medOrder1;
		}
		else {
		return medOrder;
		}
	}

	public MedOrder getMedOrderById(int mid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder =em.find(MedOrder.class, mid);
		return medOrder;
	}

	public MedOrder getMedOrderByDocterName(String name) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder =em.find(MedOrder.class, name);
		Query query = em.createQuery(name);
		
		List<MedOrder> medOrders= query.getResultList();
		for (MedOrder medOrder2 :medOrders ) {
			System.out.println(medOrder2.getDname());
			System.out.println(medOrder2.getOrderdate());
			System.out.println(medOrder2.getOrdertotal());
		}
		
		return medOrder;
	}

	public MedOrder getMedOrderByDate(String Date) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder =em.find(MedOrder.class, Date);
		Query query = em.createQuery(Date);
		//query.setParameter(1, Date);
		List<MedOrder> medOrders= query.getResultList();
		for (MedOrder medOrder2 :medOrders ) {
			System.out.println(medOrder2.getDname());
			System.out.println(medOrder2.getOrderdate());
			System.out.println(medOrder2.getOrdertotal());
		}
		
		return medOrder;
	}

	public List<MedOrder> getAllMedOrder() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql= "Select v from Branch v";
		Query query = em.createQuery(sql);
		List<MedOrder> medOrder=query.getResultList();
		
		return medOrder ;
	}

}
