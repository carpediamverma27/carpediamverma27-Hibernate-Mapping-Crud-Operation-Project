package com.ty.dao;

import java.util.List;

import com.ty.dto.Items;

public interface ItemsDao 
{
	public Items saveItems(int mid, Items items);
	
	public boolean deleteItemsById(int id);
	
	public Items updateItems(int id, Items items);
	
	public Items getItemsById(int id);
	
	public Items getItemsByMedOrderId(int mid);
	
	public List<Items> getAllItems();
	
	
}
