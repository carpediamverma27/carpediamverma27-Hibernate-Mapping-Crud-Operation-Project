package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.BranchDao;
import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class BranchDaoImp implements BranchDao {

	public Branch saveBranch(int hid, Branch branch) {

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital = em.find(Hospital.class, hid);
		if(hospital!=null) {
		et.begin();
		em.persist(branch);
		et.commit();
		return branch;
		}
		else {
			return null; 
		}
	}

	public boolean deleteBranchById(int bid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch branch=em.find(Branch.class, bid);

		if(branch!=null) {
			et.begin();
			em.remove(branch);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}

	public Branch updateBranchById(int bid, Branch branch) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Branch branch1 =em.find(Branch.class,bid);
		
		if(branch1!=null)
		{
			branch1.setBname(branch.getBname());
			branch1.setPhno(branch.getPhno());
			branch1.setEmail(branch.getEmail());
			et.begin();
			em.merge(branch1);
			et.commit();
			return branch1;
		}
		else {
		return branch;
		}
	}

	public Branch getBranchById(int bid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch branch=em.find(Branch.class, bid);
		return branch;
	}

	public List<Branch> getAllBranch() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Branch branch =em.find(Branch.class, 1); --> in getAllBranch we dont need to find the class, based on id or anything we need to find the class
		String sql = "Select v from Branch v";
		Query query = em.createQuery(sql);
		List<Branch> branch=query.getResultList();
		
		/*for(Branch branch2: branchs) {
			System.out.println(branch2.getBname());
			System.out.println(branch2.getPhno());
			System.out.println(branch2.getEmail());
		}*/
		return branch;
	}

}
