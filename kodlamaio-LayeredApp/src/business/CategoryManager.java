package business;

import Logging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    List<Category> categories=new ArrayList<Category>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories){
        this.categories=categories;
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }

    public void add(Category category) throws Exception{
        for (Category category1:categories){
            if (category.getCategoryName()==category1.getCategoryName()){
                throw new Exception("Product names cannot be the same. ");
            }
        }

        categories.add(category);
        categoryDao.add(category);
        for (Logger logger:loggers){
            logger.log(category.getCategoryName());
        }

    }
}
