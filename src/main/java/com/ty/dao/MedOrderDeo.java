package com.ty.dao;

import java.util.List;

import com.ty.dto.MedOrder;

public interface MedOrderDeo
{
	public MedOrder saveMedOrderById(int eid, MedOrder medOrder);
	
	public boolean deleteMedOrder(int mid);
	
	public MedOrder updateMedOrder(int mid, MedOrder medOrder);
	
	public MedOrder getMedOrderById(int mid);
	
	public MedOrder getMedOrderByDocterName(String name);
	
	public MedOrder getMedOrderByDate(String Date);
	
	public List<MedOrder> getAllMedOrder();
	
}
