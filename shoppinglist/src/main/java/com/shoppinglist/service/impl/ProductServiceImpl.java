package com.shoppinglist.service.impl;

import com.shoppinglist.model.entity.Product;
import com.shoppinglist.model.servise.ProductServiceModel;
import com.shoppinglist.repository.ProductRepository;
import com.shoppinglist.service.CategoryServise;
import com.shoppinglist.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    private final CategoryServise categoryServise;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper, CategoryServise categoryServise) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
        this.categoryServise = categoryServise;
    }

}
