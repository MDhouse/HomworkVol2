package repositories.impl;

import java.util.List;

import domain.Departament;
import domain.Seller;
import repositories.ISellerRepository;


public class DummySellerRepository implements ISellerRepository
{

	private DummyDB db;
	private int departaments;

	public DummySellerRepository(DummyDB db) 
	{
		super();
		this.db = db;
		
	}


	public Seller get(int id) 
	{
		for(Seller s : db.sellers)
		{
		if(s.getId()==id)
		return s;
		}
		return null;
		
	}

	
	public List<Seller> getAll() 
	{
		return db.sellers;
	}


	public void add(Seller entity) 
	{
		db.sellers.add(entity);
	}

	
	public void delete(Seller entity) 
	{
		db.sellers.remove(entity);
	}

	
	public void update(Seller entity) 
	{

	}

	public List<Seller> withDepartament(Departament departament) 
	{
		return withDepartament (departament.getId());
	}


	public List<Seller> withDepartament(String departamentName) 
	{
		Departament departament = null;
		for(Departament d : db.departaments)
		{
			if(d.getName().equalsIgnoreCase(departamentName))
			{
				departament = d;
				break;
			}
		}
		
		if (departament==null) return null;
		return departament.getSeller();
	}

	
	public List<Seller> withDepartament(int departamentId) 
	{
		Departament departament = null;
		for(Departament d : db.departaments)
		{
			if(d.getId()==departaments)
			{
				departament = d;
				break;
			}
		}
		
		if(departament==null) return null;
		return departament.getSeller();
	}


}
