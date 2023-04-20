package com.ty.controller;

import com.ty.dto.Hospital;
import com.ty.service.HospitalService;

public class TestUpdateHospitalById {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		HospitalService hospitalService = new HospitalService();
		hospital.setHname("Iysafe Hospital");
		hospital.setWebsite("www.iysafe.co.in");
		hospitalService.updateHospitalById(5,hospital );
		
		

	}

}
