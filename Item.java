
public class Item {
	private int id;
	public static int numberOfItems;
	
	public Item (int id) {
		numberOfItems++;
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public static int getNumberOfItems() {
		return numberOfItems;
	}
	

}
