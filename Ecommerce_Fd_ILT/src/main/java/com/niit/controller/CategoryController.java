package com.niit.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.Ecommerce_Bd_ILT.DAO.CategoryDAO;
import com.niit.Ecommerce_Bd_ILT.Model.CategoryModel;
@Controller
public class CategoryController 
{
	
	@Autowired
	CategoryDAO category1;
	
	@RequestMapping(value="/product")
	public ModelAndView addProduct()
	{
		ModelAndView m3=new ModelAndView("Adding");
		return m3;
	}
	
	@RequestMapping(value="/category")
	public ModelAndView addCategory()
	{
		ModelAndView m4=new ModelAndView("AddingCategory");
		return m4;
		}
	@RequestMapping(value="/addCategoryAction")
	public ModelAndView addCategoryPage(HttpServletRequest request)
	{
		try
		{
			System.out.println("IN");
			int cid=Integer.parseInt(request.getParameter("cid"));
			String cname=request.getParameter("cname");
			
			CategoryModel c = new CategoryModel();
			
			c.setCategoryid(cid);
			c.setCategoryname(cname);
			category1.addCategory(c);
			System.out.println("out");
			}
		catch(Exception t)
		{
			System.out.println(t);
			t.printStackTrace();
			
			}
		ModelAndView m6=new ModelAndView("sucess");
		return m6;
		
		
	}
	
}

