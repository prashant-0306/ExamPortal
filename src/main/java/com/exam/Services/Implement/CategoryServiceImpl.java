package com.exam.Services.Implement;

import com.exam.Entities.Exam.Category;
import com.exam.Repositories.CategoryRepository;
import com.exam.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Set<Category> getCategories() {
        return new LinkedHashSet<>(categoryRepository.findAll());
    }

    @Override
    public Category getCategory(Long cid) {
        return categoryRepository.findById(cid).get();
    }

    @Override
    public void deleteCategory(Long cid) {
        categoryRepository.deleteById(cid);
    }
}
