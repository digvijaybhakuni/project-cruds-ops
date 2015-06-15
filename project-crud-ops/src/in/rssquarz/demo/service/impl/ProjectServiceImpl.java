package in.rssquarz.demo.service.impl;

import java.util.List;

import in.rssquarz.demo.dao.ProjectDAO;
import in.rssquarz.demo.model.ProjectVO;
import in.rssquarz.demo.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	private ProjectDAO dao;
	
	public ProjectServiceImpl() {
	}

	@Override
	public List<ProjectVO> getlistOfProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectVO editProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
