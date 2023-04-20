package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.AddressDao;
import com.ty.dto.Address;
import com.ty.dto.Branch;

public class AddressDaoImp implements AddressDao{

	public Address saveAddress(int bid, Address address) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
	Branch branch = em.find(Branch.class, bid);
		if(branch!=null) {
		et.begin();
		em.persist(address);
		et.commit();
		return address;}
		else {
			return null;
		}
	}

	public boolean deleteAddressById(int aid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address address =em.find(Address.class, aid);
		if(address!=null) {
			et.begin();
			em.remove(address);
			et.commit();
			return true;
		}
		else {
		return false;
		}
	}

	public Address updateAddressById(int aid, Address address) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address address1 =em.find(Address.class, aid);
		
		if(address1!=null) {
			address1.setStreet(address.getStreet());
			address1.setState(address.getState());
			address1.setCountry(address.getCountry());
			address1.setPin(address.getPin());
			et.begin();
			em.merge(address1);
			et.commit();
			return address1;
		}
		return address;
	}

	public Address getAddressById(int aid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address address =em.find(Address.class, aid);
		return address;
	}
	
	public Address getAddressByCountry(String country) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address address =em.find(Address.class, country);
		String sql = "Select v from  Address v where v.country=?1";
		Query query = em.createQuery(sql);
		query.setParameter(1, country);
		List<Address> address1=query.getResultList();
		
		for (Address address2 : address1) {
			System.out.println(address2.getPin());
			System.out.println(address2.getState());
			System.out.println(address2.getStreet());
		}
		return null;
	}

	public List<Address> getAllAddress() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql = "Select v from Address v";
		Query query = em.createQuery(sql);
		List<Address> address = query.getResultList();
		
		return address;
	}

}
