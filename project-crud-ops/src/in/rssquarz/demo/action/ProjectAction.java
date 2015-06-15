/**
 * 
 */
package in.rssquarz.demo.action;

import in.rssquarz.demo.service.ProjectService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	/**
	 * 
	 */
	public ProjectAction() {
	}
	
	public ActionForward create(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response){
		
		return mapping.findForward("redirectTolist");
	}
	
	public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response){
		
		return mapping.findForward("redirectTolist");
	}

	public ActionForward edit(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response){
		
		return mapping.findForward("redirectTolist");
	}
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response){
		
		return mapping.findForward("redirectTolist");
	}
	
	public ActionForward list(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response){
		
		return mapping.findForward("redirectTolist");
	}
	
	
}
