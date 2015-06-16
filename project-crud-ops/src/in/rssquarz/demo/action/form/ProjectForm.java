/**
 * 
 */
package in.rssquarz.demo.action.form;

import org.apache.struts.action.ActionForm;
/**
 * @author digvijay.bhakuni
 *
 */
public class ProjectForm  extends ActionForm{


	/**
	 * 
	 */
	private static final long serialVersionUID = -1670153014698455908L;

	/**
	 * 
	 */
	public ProjectForm() {
	}

	private int Id;
	private String name;
	private String Location;
	private double price;
	private int rating;
	private String categoryStr;
	private String subCategoryStr;
	private String req;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getCategoryStr() {
		return categoryStr;
	}
	public void setCategoryStr(String categoryStr) {
		this.categoryStr = categoryStr;
	}
	public String getSubCategoryStr() {
		return subCategoryStr;
	}
	public void setSubCategoryStr(String subCategoryStr) {
		this.subCategoryStr = subCategoryStr;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	
	
}
