package com.shoppinglist.repository;

import com.shoppinglist.model.entity.CategoryName;
import com.shoppinglist.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product>findAllByCategory_CategoryName(CategoryName categoryName);
}
