package com.shoppinglist.init;

import com.shoppinglist.service.CategoryServise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoryInitInDB implements CommandLineRunner {

    private final CategoryServise categoryServise;

    public CategoryInitInDB(CategoryServise categoryServise) {
        this.categoryServise = categoryServise;
    }


    @Override
    public void run(String... args) throws Exception {
        categoryServise.initCategory();
    }
}
