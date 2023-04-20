package com.ty.controller;

import com.ty.dto.Hospital;
import com.ty.service.HospitalService;

public class TestDeleteHospitalByID {

	public static void main(String[] args) {
		
		HospitalService hospitalService= new HospitalService();
		hospitalService.deleteHospitalById(3);
		//System.out.println("Hospital Deleted Successfully");
		

	}

}