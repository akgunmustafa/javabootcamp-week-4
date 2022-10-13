package dataAccess.course;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Adding with Hibernate : Course :"+course.getCourseName());
    }
}
