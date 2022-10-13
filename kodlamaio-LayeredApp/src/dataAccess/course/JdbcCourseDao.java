package dataAccess.course;

import entities.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Adding with Jdbc : Course :"+course.getCourseName());
    }
}
