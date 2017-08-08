package cn.bdqn.tangcco.lookwell.project.service;

import cn.bdqn.tangcco.lookwell.entity.Project;
import cn.bdqn.tangcco.lookwell.project.dao.ProjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
@Service
public class ProjectServiceImpl implements ProjectService{
    @Resource
    private ProjectMapper projectMapper;


    @Override
    public List<Project> QueryAllProject() {
        return projectMapper.QueryAllProject();
    }

    @Override
    public Project QueryProjectById(Integer Id) {
        return projectMapper.QueryProjectById(Id);
    }

    @Override
    public Integer AddProject(Project project) {
        Date now = new Date();
        project.setCreateTime(now);
        project.setUpdateTime(now);
        return projectMapper.AddProject(project);
    }

    @Override
    public Integer UpdateProject(Project project) {
        Date now = new Date();
        project.setUpdateTime(now);
        return projectMapper.UpdateProject(project);
    }
}
