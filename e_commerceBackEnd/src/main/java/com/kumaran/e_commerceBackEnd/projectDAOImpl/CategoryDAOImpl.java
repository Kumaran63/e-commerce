package com.kumaran.e_commerceBackEnd.projectDAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kumaran.e_commerceBackEnd.projectDAO.CategoryDAO;
import com.kumaran.e_commerceBackEnd.projectDTO.CategoryDTO;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<CategoryDTO> categories = new ArrayList<>();
	static {
		
		CategoryDTO category = new CategoryDTO();
		 
		//adding South Indian category
		category.setId(1);
		category.setName("South Indian");
		category.setDescription("We sell best South Indian Food");
		category.setPictureURL("CAT1.png");
		categories.add(category);
		//adding North Indian category
		category = new CategoryDTO();	
		category.setId(2);
		category.setName("North Indian");
		category.setDescription("We sell best North Indian Food");
		category.setPictureURL("CAT2.png");
		categories.add(category);
		//adding Western Food category
		category = new CategoryDTO();	
		category.setId(3);
		category.setName("Western Food");
		category.setDescription("We sell best Western Food");
		category.setPictureURL("CAT3.png");
		categories.add(category);	
	}
	@Override
	public List<CategoryDTO> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
