package com.shoppinglist.service.impl;

import com.shoppinglist.model.entity.Category;
import com.shoppinglist.model.entity.CategoryName;
import com.shoppinglist.repository.CategoryRepository;
import com.shoppinglist.service.CategoryServise;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryServise {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategory() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryName.values()).forEach(categoryName -> {
                Category category = new Category(categoryName, " description for " + categoryName.name());
                categoryRepository.save(category);
            });
        }
    }
}
