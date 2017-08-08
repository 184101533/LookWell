package cn.bdqn.tangcco.lookwell.course.service;

import cn.bdqn.tangcco.lookwell.entity.Course;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
public interface CourseService {
    public List<Course> QueryAllCourse();

    public Course QueryCourseById(Integer Id);

    public Integer AddCourse(Course course);

    public Integer UpdateCourse(Course course);
}
