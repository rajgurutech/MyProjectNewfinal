package com.niit.Ecommerce_Bd_ILT.Impl;

import javax.persistence.Query;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Ecommerce_Bd_ILT.DAO.CategoryDAO;
import com.niit.Ecommerce_Bd_ILT.Model.CategoryModel;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
		
	}
	public boolean addCategory(CategoryModel category1)
	{
		try
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(category1);
			s.getTransaction().commit();
			s.close();
			return true;
			
		}
		catch(Exception r)
		{
			return false;
			
			}
		
	}
	
		public CategoryModel findById(int id) 
		{
		// TODO Auto-generated method stub
		CategoryModel c=(CategoryModel)sessionFactory.openSession().get(CategoryModel.class, id);
		return c;
	}
//		public List<CategoryModel> getAll()
//		{
//			Session s=sessionFactory.openSession();
//			s.beginTransaction();
//			Query query=s.createQuery("from CategoryModel");
//			List<CategoryModel> list= query.list();
//			s.getTransaction();
//			return list;
//			
//		}
}
	
	




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


