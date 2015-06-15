/**
 * 
 */
package in.rssquarz.demo.dao.impl;

import java.util.List;

import in.rssquarz.demo.dao.ProjectDAO;
import in.rssquarz.demo.model.ProjectVO;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author digvijayb
 *
 */
public class ProjectDAOImpl extends HibernateDaoSupport implements ProjectDAO {

	/**
	 * 
	 */
	public ProjectDAOImpl() {
		// TODO Auto-generated constructor stub
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
