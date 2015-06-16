/**
 * 
 */
package in.rssquarz.demo.action;

import in.rssquarz.demo.action.form.ProjectForm;
import in.rssquarz.demo.model.ProjectVO;
import in.rssquarz.demo.model.constants.Category;
import in.rssquarz.demo.service.ProjectService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * @author digvijayb
 *
 */
public class ProjectAction extends DispatchAction {

	
	private ProjectService service; 
	
	
	
	public void setService(ProjectService service) {
		this.service = service;
	}

	/**
	 * 
	 */
	public ProjectAction() {
	}
	
	public ActionForward create(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {
			ProjectForm projectForm = (ProjectForm)form;
			ProjectVO projectVO = new ProjectVO();
			BeanUtils.copyProperties(projectVO, projectForm);
			boolean result = service.addProject(projectVO);
			if(!result){
				request.setAttribute("actionResult", "Project Creation Fail's");
				return mapping.getInputForward();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("Something went wrong while creating project",ex);
		}
		return mapping.findForward("redirectTolist");
	}
	
	public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {
			ProjectForm projectForm = (ProjectForm)form;
			ProjectVO projectVO = new ProjectVO();
			BeanUtils.copyProperties(projectVO, projectForm);
			boolean result = service.deleteProject(projectVO);
			if(!result){
				request.setAttribute("actionResult", "Project Creation Fail's");
				return mapping.getInputForward();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("Something went wrong while updating project",ex);
		}
		return mapping.findForward("redirectTolist");
	}

	public ActionForward edit(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {
			ProjectForm projectForm = (ProjectForm)form;
			ProjectVO projectVO = null;
			if(projectForm!=null && projectForm.getId()!=0){
				System.out.println(projectForm.getId()+"ID");
				projectVO = service.editProject(projectForm.getId());
				request.setAttribute("reqCode", "update");
			}else{
				projectVO = new ProjectVO();
				request.setAttribute("reqCode", "create");
				request.setAttribute("projectVO", projectVO);
			}
			request.setAttribute("projectVO", projectVO);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("Something went wrong while fetching project",ex);
		}
		return mapping.findForward("projForm");
	}
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {
			ProjectForm projectForm = (ProjectForm)form;
			ProjectVO projectVO = new ProjectVO();
			BeanUtils.copyProperties(projectVO, projectForm);
			boolean result = service.updateProject(projectVO);
			if(!result){
				request.setAttribute("actionResult", "Project Creation Fail's");
				return mapping.getInputForward();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("Something went wrong while updating project",ex);
		}
		return mapping.findForward("redirectTolist");
	}
	
	public ActionForward list(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception{
		try{
			List<ProjectVO> projectVOs = service.getlistOfProject();
			request.setAttribute("listofProject", projectVOs);
		}catch(Exception ex){
			ex.printStackTrace();
			throw new Exception("Something went wrong while fetching listing",ex);
		}
		return mapping.findForward("listing");
	}
	
	
}
