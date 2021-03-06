
/**
 * these are the given Java libraries.
 */
import java.sql.Time;

/**
 * these classes and interfaces I made in this tesk
 */
import Item.Item;
import Item.Person;
import Race.Race;
import Ranking.Ranking;

public class Main {
	public static void main(String[] args) {
		Item p1 = new Person("Ben");
		Item p2 = new Person("Sam");
		Item p3 = new Person("Johannes");
		Item p4 = new Person("Pramod");

		@SuppressWarnings("deprecation")
		Time t1 = new Time(1, 10, 00);
		@SuppressWarnings("deprecation")
		Time t2 = new Time(2, 10, 00);
		@SuppressWarnings("deprecation")
		Time t3 = new Time(3, 10, 00);
		@SuppressWarnings("deprecation")
		Time t4 = new Time(4, 10, 00);

		Ranking r1 = new Ranking(p1, t1);
		Ranking r2 = new Ranking(p2, t2);
		Ranking r3 = new Ranking(p3, t3);
		Ranking r4 = new Ranking(p4, t4);

		Race race = new Race();
		race.addRanking(r3);
		race.addRanking(r1);
		race.addRanking(r2);
		;
		race.addRanking(r4);

		race.sortTime();

		System.out.println(race);

	}
}
