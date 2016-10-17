import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		
		players.add("Sachin");
		players.add("Dhoni");
		players.add("Virat");
		players.add("Virat");
		
//		System.out.println(players.get(1));
		
		for (String name : players) {
			System.out.println(name);
		}
		
	}
}
