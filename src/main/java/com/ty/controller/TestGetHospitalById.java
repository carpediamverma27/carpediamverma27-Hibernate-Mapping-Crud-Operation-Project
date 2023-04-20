package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Hospital;
import com.ty.service.HospitalService;

public class TestGetHospitalById {

	public static void main(String[] args) {
		
		
		
		Hospital hospital = new Hospital();
		HospitalService hospitalService = new HospitalService();
		hospitalService.getHospitalById(1);
		
		 
		System.out.println(hospital.getHid());
		System.out.println(hospital.getHname());
		System.out.println(hospital.getWebsite());
	}

}
