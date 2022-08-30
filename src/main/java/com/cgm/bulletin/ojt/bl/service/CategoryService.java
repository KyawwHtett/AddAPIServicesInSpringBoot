package com.cgm.bulletin.ojt.bl.service;

import java.util.List;

import com.cgm.bulletin.ojt.persistence.entity.Category;
import com.cgm.bulletin.ojt.web.form.CategoryForm;

/**
 * <h2>CategoryService Class</h2>
 * <p>
 * Process for Displaying CategoryService
 * </p>
 * 
 * @author KyawHtet
 *
 */
public interface CategoryService {

	/**
	 * <h2>doSaveCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param category
	 * @return void
	 */
	void doSaveCategory(CategoryForm category);

	/**
	 * <h2>doGetAllCategories</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<Category>
	 */
	List<Category> doGetAllCategories();

	/**
	 * <h2>doDeleteCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param category_id
	 * @return void
	 */
	void doDeleteCategory(int category_id);

	/**
	 * <h2>doGetCategoryById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param category_id
	 * @return
	 * @return CategoryForm
	 */
	CategoryForm doGetCategoryById(int category_id);

	/**
	 * <h2>doUpdateCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param category
	 * @return void
	 */
	void doUpdateCategory(CategoryForm category);
}