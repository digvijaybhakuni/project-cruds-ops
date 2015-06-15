/**
 * 
 */
package in.rssquarz.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import in.rssquarz.demo.model.constants.Category;
import in.rssquarz.demo.model.constants.SubCategory;

/**
 * @author digvijayb
 *
 */
@Table(name="ProjectData")
@Access(AccessType.FIELD)
public class ProjectVO {

	/**
	 * 
	 */
	public ProjectVO() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column(name="project_name", nullable=false)
	private String name;
	
	@Column(name="location",  nullable=false)
	private String Location;
	
	@Column(name = "price", columnDefinition="Decimal(10,2)",  nullable=false)
	private double price;
	
	@Column(name="rating", nullable=false)
	private int rating;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "category",  nullable=false)
	private Category category;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "subcategory",  nullable=false)
	private SubCategory subCategory;
	
	
	
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public SubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	
	
	
	
}
