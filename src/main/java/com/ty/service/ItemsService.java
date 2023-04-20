package com.ty.service;

import java.util.List;

import com.ty.dao.imp.ItemsDaoImp;
import com.ty.dto.Items;

public class ItemsService 
{
	public void saveItems(int mid, Items items)
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		Items items1 = itemsDaoImp.saveItems(mid, items);
		if(items1!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public void deleteItemsById(int id)
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		boolean flag = itemsDaoImp.deleteItemsById(id);
		if(flag)
		{
			System.out.println("");
		}
		else
		{
			System.out.println(""); 
		}
	}
	
	public Items updateItems(int id, Items items)
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		Items items2 = itemsDaoImp.updateItems(id, items);
		if(items2!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println(""); 
		}
		return null;
	}
	
	public Items getItemsById(int id)
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		Items items = itemsDaoImp.getItemsById(id);
		if(items!=null)
		{
			return items;
		}
		else
		{
			return null;
		}
	}
	
	public Items getItemsByMedOrderId(int mid)
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		Items items = itemsDaoImp.getItemsByMedOrderId(mid);
		if(items!=null)
		{
			return items;
		}
		else
		{
			return null;
		}
	}
	
	public List<Items> getAllItems()
	{
		ItemsDaoImp itemsDaoImp = new ItemsDaoImp();
		List<Items> items = itemsDaoImp.getAllItems();
		if(items.size()>0)
		{
			return items;
		}
		else
		{
			return null;
		}
	}
}
