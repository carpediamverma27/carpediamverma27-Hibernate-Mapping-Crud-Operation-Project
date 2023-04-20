package com.ty.service;

import java.util.List;

import com.ty.dao.imp.MedOrderDaoImp;
import com.ty.dto.MedOrder;

public class MedOrderService 
{
	public void saveMedOrderById(int eid, MedOrder medOrder)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder1 = medOrderDaoImp.saveMedOrderById(eid, medOrder);
		if(medOrder1!=null)
		{
			System.out.println("MedOrder Saved Successfully");
		}
		else
		{
			System.out.println("Unfortunately Medorder Not Saved");
		}
	}
	
	public void deleteMedOrder(int mid)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		boolean flag = medOrderDaoImp.deleteMedOrder(mid);
		if(flag)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public MedOrder updateMedOrder(int mid, MedOrder medOrder)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder2 = medOrderDaoImp.updateMedOrder(mid, medOrder);
		if(medOrder2!=null)
		{
			System.out.println("MedOrder Updated Successfully");
		}
		else
		{
			System.out.println("MedOrder Not Update");
		}
		return null;
	}
	
	public MedOrder getMedOrderById(int mid)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder = medOrderDaoImp.getMedOrderById(mid);
		if(medOrder!=null)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
	
	public MedOrder getMedOrderByDocterName(String name)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder = medOrderDaoImp.getMedOrderByDocterName(name);
		if(medOrder!=null)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
	
	public MedOrder getMedOrderByDate(String Date)
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder = medOrderDaoImp.getMedOrderByDate(Date);
		if(medOrder!=null)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
	
	public List<MedOrder> getAllMedOrder()
	{
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		List<MedOrder> medOrder = medOrderDaoImp.getAllMedOrder();
		if(medOrder.size()>0)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
}
