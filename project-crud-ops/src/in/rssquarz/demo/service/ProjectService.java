/**
 * 
 */
package in.rssquarz.demo.service;

import in.rssquarz.demo.model.ProjectVO;

import java.util.List;

/**
 * @author digvijayb
 *
 */
public interface ProjectService {

	List<ProjectVO> getlistOfProject();
	
	ProjectVO editProject(int id);
	
	boolean updateProject(ProjectVO projectVO);
	
	boolean addProject(ProjectVO projectVO);
	
	boolean deleteProject(ProjectVO projectVO);
	
}
