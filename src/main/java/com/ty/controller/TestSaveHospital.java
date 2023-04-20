package com.ty.controller;

import com.ty.dto.Hospital;
import com.ty.service.HospitalService;

public class TestSaveHospital {

	public static void main(String[] args) {
		
		Hospital hospital  = new Hospital();
		HospitalService hospitalService = new HospitalService();
		
		hospital.setHname("Iysaf Hostipal");
		hospital.setWebsite("www.Tysafhospital.com");
		hospitalService.SaveHospital(hospital);

	}

}
