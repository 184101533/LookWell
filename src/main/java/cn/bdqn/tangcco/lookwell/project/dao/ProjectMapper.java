package cn.bdqn.tangcco.lookwell.project.dao;



import cn.bdqn.tangcco.lookwell.entity.Project;

import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
public interface ProjectMapper {
    public List<Project> QueryAllProject();

    public Project QueryProjectById(Integer Id);

    public Integer AddProject(Project project);

    public Integer UpdateProject(Project project);

}
