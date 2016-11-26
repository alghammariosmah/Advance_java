import Item.Item;
import Item.ItemCollection;
import Item.ItemList;
import Item.Person;
import Item.Ranking;

public class Main {
	public static void main(String[] args){
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		
		ItemCollection il = new ItemList();
		il.add(p);
		il.add(p1);
		il.add(p2);

		Item r = new Ranking();
		System.out.println(r.getID());
	}
}