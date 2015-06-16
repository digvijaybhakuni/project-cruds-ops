package in.rssquarz.demo.model.constants;

import java.util.HashMap;
import java.util.Map;

public enum Category {

	BUY("Buy"), SELL("Sell");

	private static Map<String, Category> loopUp = new  HashMap<String, Category>();
	
	static{
		for(Category category : Category.values()){
			loopUp.put(category.getValue(), category);
		}
	}
	
	private String value;
	private Category(String value) {
		this.value=value;
	}
	
	private String getValue(){
		return value;
	}
	
	public static Category get(String value){
		return loopUp.get(value);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
