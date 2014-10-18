package repositories.impl;

import java.util.*;

import domain.*;

public class DummyDB 

{
	public List<Seller> sellers;
	public List<Customers> customerses;
	public List<Departament> departaments;

	
	public DummyDB()
	{
		sellers = new ArrayList<Seller>();
		customerses = new ArrayList<Customers>();
		departaments = new ArrayList<Departament>();
	}

}
