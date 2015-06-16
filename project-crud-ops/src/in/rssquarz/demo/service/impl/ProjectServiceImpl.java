package in.rssquarz.demo.service.impl;

import in.rssquarz.demo.dao.ProjectDAO;
import in.rssquarz.demo.model.ProjectVO;
import in.rssquarz.demo.service.ProjectService;

import java.util.List;

public abstract class ProjectServiceImpl implements ProjectService {

	private ProjectDAO projectDAO;
	
	public void setProjectDAO(ProjectDAO projectDAO){
		this.projectDAO = projectDAO;
	}
	
	private ProjectDAO getProjectDAO(){
		return this.projectDAO;
	}
	
	public ProjectServiceImpl() {
	}

	@Override
	public List<ProjectVO> getlistOfProject() {
		return createProjectDao().getlistOfProject();
	}

	@Override
	public ProjectVO editProject(int id) {
		return createProjectDao().editProject(id);
	}

	@Override
	public boolean updateProject(ProjectVO projectVO) {
		return createProjectDao().updateProject(projectVO);
	}

	@Override
	public boolean addProject(ProjectVO projectVO) {
		return createProjectDao().addProject(projectVO);
	}

	@Override
	public boolean deleteProject(ProjectVO projectVO) {
		return createProjectDao().deleteProject(projectVO);
	}
	
	protected abstract ProjectDAO createProjectDao();
}
