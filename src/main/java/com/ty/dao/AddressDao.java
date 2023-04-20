package com.ty.dao;

import java.util.List;

import com.ty.dto.Address;
import com.ty.dto.Branch;

public interface AddressDao
{
	public Address saveAddress(int bid, Address address);
	
	public boolean deleteAddressById(int aid);
	
	public Address updateAddressById(int aid, Address address);
	
	public Address getAddressById(int aid);
	
	public Address getAddressByCountry(String country);
	
	public List<Address> getAllAddress();
	
	

}
