package in.rssquarz.demo.model.constants;

public enum SubCategory {

	PLOT("Plot"), FLAT("Flat"), COMMERCIAL("Commercial");

	private String value;

	private SubCategory(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
