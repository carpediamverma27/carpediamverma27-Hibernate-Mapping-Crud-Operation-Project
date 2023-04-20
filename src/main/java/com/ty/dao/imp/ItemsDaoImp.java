package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.ItemsDao;
import com.ty.dto.Items;
import com.ty.dto.MedOrder;

public class ItemsDaoImp implements ItemsDao{

	public Items saveItems(int mid, Items items) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MedOrder medOrder = em.find(MedOrder.class, mid);
		if(medOrder!= null) {
		et.begin();
		em.persist(items);
		et.commit();
		return items;}
		else {
			return null;
		}
	}

	public boolean deleteItemsById(int id) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Items items=em.find(Items.class, id);
		if(items!= null) {
			et.begin();
			em.remove(items);
			et.commit();
			return true;
		}
		return false;
	}

	public Items updateItems(int id, Items items) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Items items1=em.find(Items.class, id);
		if(items1!=null) {
			items1.setItemname(items.getItemname());
			items1.setCost(items.getCost());
			items1.setQuantity(items.getQuantity());
			et.begin();
			em.merge(items1);
			et.commit();
			return items1;
		}
		return items;
	}

	public Items getItemsById(int id) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Items items=em.find(Items.class, id);
		return items;
	}

	public Items getItemsByMedOrderId(int mid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Items items=em.find(Items.class, mid);
		return items;
	}

	public List<Items> getAllItems() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql = "Select v from Items v";
		Query query = em.createQuery(sql);
		List<Items> items=query.getResultList(); 
		return items;
	}

}
