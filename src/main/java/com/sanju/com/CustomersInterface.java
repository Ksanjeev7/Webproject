package com.sanju.com;

import java.util.List;
public interface CustomersInterface {
	public int insertCust(Customers cus);
	public int upadteCust(Customers cus);     
	public int delete(int C_Id);
	public int delete(Customers cus);
	public  Customers getcust(int C_Id);
    public 	List<Customers>getAll();
}

