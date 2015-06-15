package in.rssquarz.demo.dao;

import in.rssquarz.demo.model.ProjectVO;

import java.util.List;

public interface ProjectDAO {

	List<ProjectVO> getlistOfProject();

	ProjectVO editProject(int id);

	boolean updateProject(ProjectVO projectVO);

	boolean addProject(ProjectVO projectVO);

	boolean deleteProject(ProjectVO projectVO);
}
