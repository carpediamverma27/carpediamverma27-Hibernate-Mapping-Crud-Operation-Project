package com.ty.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.UserDao;
import com.ty.dto.User;

public class UserDaoImp implements UserDao{

	public User saveUser(User user) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(user);
		et.begin();
		return user;
		
	}

	public boolean deleteUserById(int uid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user=em.find(User.class, uid);
		if(user!=null) {
			et.begin();
			em.remove(user);
			et.commit();
			return true;
		}
		
		return false;
		
	}

	public User updateUserById(int uid, User user) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user1=em.find(User.class, uid);
		if(user1!=null) {
			user1.setName(user.getName());
			user1.setEmail(user.getEmail());
			user1.setPhno(user.getPhno());
			user1.setPassward(user.getPassward());
			user1.setRole(user.getRole());
			
			et.begin();
			em.merge(user1);
			et.commit();
			}
		return user;
		
	}

	public User getUserById(int uid) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user=em.find(User.class, uid);
		
		return user;
		
	}

	public User getUserByName(String name) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user=em.find(User.class, name);
		return user;
	}

	public User getUserByRole(String role) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user=em.find(User.class, role);
		return user;
	}

	public List<User> getAllUsers() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String sql = "Select v from User v";
		Query query = em.createQuery(sql);
		List<User> user= query.getResultList();
		return user;
	}

}
