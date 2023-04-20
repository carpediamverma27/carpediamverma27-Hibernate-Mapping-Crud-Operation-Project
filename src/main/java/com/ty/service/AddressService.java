package com.ty.service;

import java.util.List;

import com.ty.dao.imp.AddressDaoImp;
import com.ty.dao.imp.BranchDaoImp;
import com.ty.dto.Address;
import com.ty.dto.Branch;

public class AddressService {
	
	public void saveAddress(int bid, Address address)
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address1 = addressDaoImp.saveAddress(bid, address);
		if(address1!=null) {
			System.out.println("Address Saved Successfully");
		}
		else
		{
			System.out.println("Unfortunately Address Not Saved ");
		}
	}
	
	public void deleteAddressById(int aid)
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		boolean flag = addressDaoImp.deleteAddressById(aid);
		if(flag)
		{
			System.out.println("Address Deleted Successfully");
		}
		else
		{
			System.out.println("Address Not Deleted");
		}
	}
	
	public Address updateAddressById(int aid, Address address)
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address2 = addressDaoImp.updateAddressById(aid, address);
		if(address2!=null)
		{
			System.out.println("Address Updated Successfully");
		}
		else {
			System.out.println("Address not Updated");
		}
		return null;
	}
	
	public Address getAddressById(int aid)
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address = addressDaoImp.getAddressById(aid);
		if(address!=null)
		{
			return address;
		}
		else
		{
			return null;
		}
	}
	
	public Address getAddressByCountry(String country) 
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address  = addressDaoImp.getAddressByCountry(country);
		if(address!=null) {
			return address;
		}
		else {
			return null;
		}
		
	}
	
	public List<Address> getAllAddress()
	{
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		List<Address> address = addressDaoImp.getAllAddress();
		if(address.size()>0)
		{
			return address;
		}
		else
		{
			return null;
		}
	}

}
