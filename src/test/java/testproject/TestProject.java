package testproject;

import base.TestBase;
import cn.bdqn.tangcco.lookwell.entity.Project;
import cn.bdqn.tangcco.lookwell.project.service.ProjectService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/5.
 */
public class TestProject extends TestBase{
    @Resource
    private ProjectService projectService;
    @Test
    public void testQueryAllProject() {
        List<Project> list = projectService.QueryAllProject();
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testQueryProjectById() {
        Project project = projectService.QueryProjectById(1);
        System.out.println(project.getProjectName());

    }

    @Test
    public void testAddProject() {
        Project project = new Project();
        project.setProjectName("渣渣");
        project.setProjectDesc("产品说明");
        project.setProjectVersion("10.0");
        project.setProjectStatus("在线");
        Integer count = projectService.AddProject(project);
        System.out.println("添加结果行数=====================================>"+count);
    }

    @Test
    public void testUpdateProject() {
        Project project = new Project();
        project.setProjectId(8);
        project.setProjectName("产品名称");
        project.setProjectDesc("产品说明");
        project.setProjectVersion("产品版本");
        project.setProjectStatus("产品状态");
        Integer count = projectService.UpdateProject(project);
        System.out.println("改变结果行数=====================================>"+count);

    }
}
