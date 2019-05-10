package com.example.mothertochild.service.impl;

import com.example.mothertochild.entity.Category;
import com.example.mothertochild.mapper.CategoryMapper;
import com.example.mothertochild.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> categoryList() {
        return categoryMapper.categoryList();
    }

    @Override
    public int insertCategory(String categoryName) {
        return categoryMapper.insertCategory(categoryName);
    }

    @Override
    public int deleteCategory(int categoryId) {
        return categoryMapper.deleteCategory(categoryId);
    }

    @Override
    public Category getCategory(String categoryName) {
        return categoryMapper.getCategory(categoryName);
    }

    @Override
    public int updateCategory(int categoryId, String categoryName) {
        return categoryMapper.updateCategory(categoryId,categoryName);
    }
}
