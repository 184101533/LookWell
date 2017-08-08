package cn.bdqn.tangcco.lookwell.course.service;

import cn.bdqn.tangcco.lookwell.course.dao.CourseMapper;
import cn.bdqn.tangcco.lookwell.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Created by Administrator on 2017/8/6.
 */
@Service
public class CourseServiceImpl implements CourseService{

    @Resource
    private CourseMapper courseMapper;
    @Override
    public List<Course> QueryAllCourse() {

        return courseMapper.QueryAllCourse();
    }

    @Override
    public Course QueryCourseById(Integer Id) {
        return courseMapper.QueryCourseById(Id);
    }

    @Override
    public Integer AddCourse(Course course) {
        Date now = new Date();
        course.setCreateTime(now);
        course.setUpdateTime(now);
        return courseMapper.AddCourse(course);
    }

    @Override
    public Integer UpdateCourse(Course course) {
        Date now = new Date();
        course.setUpdateTime(now);
        return courseMapper.UpdateCourse(course);
    }
}
