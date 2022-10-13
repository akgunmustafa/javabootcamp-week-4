package dataAccess.category;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Adding to Jdbc : Category"+ category.getCategoryName());
    }
}
