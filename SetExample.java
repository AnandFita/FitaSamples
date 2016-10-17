import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> players = new HashSet<String>();
		
		players.add("Sachin");
		players.add("Dhoni");
		players.add("Virat");
		players.add("Virat");
		
//		System.out.println("Dhoni".hashCode());
		
//		System.out.println(players.get(1));
		
		for (String name : players) {
			System.out.println(name);
		}
		
	}
}
