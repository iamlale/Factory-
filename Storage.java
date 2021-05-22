
public class Storage {
	private int capacity;
	private Item[] items;
	
	public Storage(int capacity) {
		this.capacity=capacity;
		items=new Item[0];

	}
	
	public void addItem(Item item) {
		Item[] newItems=new Item[items.length+1]; //orjinalden bir birim daha uzun newItems array'i
		for (int i = 0; i<items.length; i++) {
			newItems[i]=items[i]; //items arrayindeki nesneleri yeni olusturdugumuz newItems arrayinin icine atiyoruz.
		}
		newItems[items.length]=item;  //en sondaki nesne (newItems[items.length]) input olarak aldigimiz nese (item) oluyor.
		items=newItems; // yeni olusan newItems arrayinin icindekileri eskiden var olan items arrayine gonderiyoruz.
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	
	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items=items;
	}

}
