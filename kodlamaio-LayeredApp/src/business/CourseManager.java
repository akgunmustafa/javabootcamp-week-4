package business;

import Logging.Logger;
import dataAccess.course.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private Logger[] loggers;
    List<Course> courses=new ArrayList<Course>();

    public CourseManager(ICourseDao iCourseDao,Logger[] loggers,List<Course> courses){
        this.iCourseDao=iCourseDao;
        this.loggers=loggers;
        this.courses=courses;
    }

    public void add(Course course) throws Exception{
        for (Course course1:courses){
            if (course1.getCourseName()==course.getCourseName()){
                throw new Exception("Product names cannot be the same.");
            }
            if (course1.getCoursePrice()< 0){
                throw new Exception("Product prices cannot be 0.");
            }

        }
        courses.add(course);
        iCourseDao.add(course);

        for (Logger logger:loggers){
            logger.log(course.getCourseName());
        }

    }
}
