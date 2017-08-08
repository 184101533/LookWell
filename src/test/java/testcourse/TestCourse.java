package testcourse;

import base.TestBase;
import cn.bdqn.tangcco.lookwell.course.service.CourseService;
import cn.bdqn.tangcco.lookwell.entity.Course;
import cn.bdqn.tangcco.lookwell.entity.Project;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
public class TestCourse extends TestBase {
    @Resource
    private CourseService courseService;

    @Test
    public void testQueryAllCourse() {
        List<Course> list = courseService.QueryAllCourse();
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testQueryCourseById() {

        System.out.println(courseService.QueryCourseById(1));
    }

    @Test
    public void testAddCourse() {
        Course course = new Course();
        course.setCourseName("课程名称");
        course.setCourseDesc("课程说明");
        Project project = new Project();
        project.setProjectId(8);
        course.setProject(project);
        Integer count = courseService.AddCourse(course);
        System.out.println("新增行数===================>"+count);
    }

    @Test
    public void testUpdateCourse() {
        Course course = new Course();
        Project project = new Project();
        project.setProjectId(1);
        course.setCourseId(5);
        course.setCourseName("冲啊");
        course.setCourseDesc("杀啊");
        course.setProject(project);
        Integer count = courseService.UpdateCourse(course);
        System.out.println("修改行数====================>"+count);
    }
}
