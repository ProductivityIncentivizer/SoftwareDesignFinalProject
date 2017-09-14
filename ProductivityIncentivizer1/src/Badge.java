/**
 * This class is of the Badge object with attributes, name and value
 * @param name is the name of the badge and @param value is the value of the badge
 * */
public class Badge {
	
	private String name;
	private int value;

	public Badge(String name, int value) {
		this.name = name;
		this.value = value;
		
	}
	
	public String getBadgeName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

}
