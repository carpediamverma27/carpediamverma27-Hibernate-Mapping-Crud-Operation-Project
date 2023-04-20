package com.ty.service;

import com.ty.dao.imp.HospitalDaoImp;
import com.ty.dto.Hospital;

public class HospitalService 
{
	public void SaveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();

		Hospital hospital1 = daoImp.saveHospital(hospital);

		if(hospital1!=null)
		{
			System.out.println("Hospital save Successfully");
		}
		else {
			System.out.println("Unfortunately Hospital not Saved");
		}
	}
	
	public Hospital getHospitalById(int hid)
	{
		
		HospitalDaoImp daoImp  = new HospitalDaoImp();
		Hospital hospital  = daoImp.getHospitalById(hid);
		if(hospital!=null)
		{
			return hospital;
		}
		else {
			return null;
		}
	}
	
	public void deleteHospitalById(int hid) {
		
		HospitalDaoImp daoImp  = new HospitalDaoImp();
		boolean flag = daoImp.deleteHospitalById(hid);
		
		if(flag)
		{
			System.out.println("Hospital deleted");
		}
		else {
			System.out.println("Hospital Not Deleted");
		}
	}
	
	public Hospital updateHospitalById(int hid, Hospital hospital) {
		
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital2  = daoImp.updateHospitalById(hid, hospital);
		
		if(hospital2!=null)
		{
			//return hospital2;
			System.out.println("Hospital is Updated");
		}
		else {
			//return null;
			System.out.println("Hospital is not Updated");;
		}
		return null;
	}
}
