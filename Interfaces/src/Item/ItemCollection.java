package Item;

public interface ItemCollection {
	public void add(Item item);
	public boolean remove(Item item);
	public boolean contains(Item person);
	public boolean isEmpty();
	public boolean isFull();
	
}
