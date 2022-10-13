import Logging.DatabaseLogger;
import Logging.Logger;
import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.educator.HibernateEducatorDao;
import entities.Category;
import entities.Course;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //Category
        Logger[] loggers={new DatabaseLogger(),}; //Şuanda sadece Database'e ekleniyor, istersek mail ve file ekleyebilirz
        Category category1=new Category(1,"FrontEnd");
        Category category2=new Category(2,"Backend");
        Category category3=new Category(3,"android");
        List<Category> categories= new ArrayList<>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        Category category=new Category(4,"Computer Eng");
        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers,categories);
        categoryManager.add(category);
        System.out.println(" ");

        //Course
        List<Course> courses= new ArrayList<>();
        Course course1=new Course(1,"c++",798);
        Course course2=new Course(2,"c#",1000);
        Course course3=new Course(3,".Net",1333);
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        Course course=new Course(4,"java",999);
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers,courses);
        courseManager.add(course);
        System.out.println(" ");

        //Educator
        List<Educator> educators= new ArrayList<>();
        Educator educator=new Educator(1,"Engin","Demirog");
        EducatorManager educatorManager=new EducatorManager(new HibernateEducatorDao(),loggers,educators);
        educatorManager.add(educator);

    }
}