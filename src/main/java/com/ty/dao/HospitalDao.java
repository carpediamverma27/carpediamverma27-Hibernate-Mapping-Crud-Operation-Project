package com.ty.dao;

import com.ty.dto.Hospital;

public interface HospitalDao 
{
	public Hospital saveHospital(Hospital hospital);// to save the hospital mandatory to give Hospital type return type & argument.
	
	public boolean deleteHospitalById(int hid);// No need to return the hospital but delete based on hid.
	
	public Hospital updateHospitalById(int hid, Hospital hospital);// Based on hid we are updating Hospital and returning
	
	public Hospital getHospitalById(int hid);// get hospital based on hid and returning
}
