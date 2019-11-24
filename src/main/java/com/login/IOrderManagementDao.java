package com.login;

import java.util.List;

import com.calculator.pojo.ItemInfo;

public interface IOrderManagementDao {

	public int deleteItem(int itemId);
	public List<String> fetchMenu();
	public void updateItem();
	public String getItemInfoByItemId(int itemId);
	
}
