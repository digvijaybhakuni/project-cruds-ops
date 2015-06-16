package in.rssquarz.demo.model.constants;

import java.util.HashMap;
import java.util.Map;

public enum SubCategory {

	PLOT("Plot"), FLAT("Flat"), COMMERCIAL("Commercial");

	
	private static Map<String, SubCategory> loopUp = new  HashMap<String, SubCategory>();
	
	static{
		for(SubCategory subcategory : SubCategory.values()){
			loopUp.put(subcategory.getValue(), subcategory);
		}
	}
	
	private String value;

	private SubCategory(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static SubCategory get(String value){
		return loopUp.get(value);
	}
	
	
	@Override
	public String toString() {
		return value.toString();
	}
}
